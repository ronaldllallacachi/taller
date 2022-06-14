package controlador;

import dao.FichaDAO;
import dao.UsuarioDAO;
import dto.Ficha;
import dto.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "ServFicha", urlPatterns = {"/ServFicha"})
public class ServFicha extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int id = (int) request.getSession().getAttribute("idusuario");

        FichaDAO ficha_dao = new FichaDAO();
        List<Ficha> fichas = ficha_dao.Buscar(id);
        for (Ficha ficha : fichas) {
            request.getSession().setAttribute("nombres", ficha.getNombres());
            request.getSession().setAttribute("apellidos", ficha.getApellidos());
            request.getSession().setAttribute("dni", ficha.getDni());
            request.getSession().setAttribute("telefono", ficha.getTelefono());
            request.getSession().setAttribute("direccion", ficha.getDireccion());
            request.getSession().setAttribute("correo", ficha.getCorreo());
        }
        int rol = (int) request.getSession(false).getAttribute("idrol");
        System.out.println("rol " + rol);
        switch (rol) {
            case 1:
                response.sendRedirect(request.getContextPath() + "/vista/tecnicos/ficha/update.jsp");
                break;
            case 2:
                response.sendRedirect(request.getContextPath() + "/vista/cliente/ficha/update.jsp");
                break;
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int id = (int) request.getSession(false).getAttribute("idusuario");
        String nombres = request.getParameter("txtnombres");
        String apellidos = request.getParameter("txtapellidos");
        int dni = Integer.parseInt(request.getParameter("txtdni"));
        int telefono = Integer.parseInt(request.getParameter("txttelefono"));
        String direccion = request.getParameter("txtdireccion");
        String correo = request.getParameter("txtdireccion");

        Ficha ficha_dto = new Ficha(id, nombres, apellidos, dni, telefono, direccion, correo);
        FichaDAO ficha_dao = new FichaDAO();
        ficha_dao.Modificar(ficha_dto);

        int rol = (int) request.getSession(false).getAttribute("idrol");

        switch (rol) {
            case 1:
                response.sendRedirect(request.getContextPath() + "/vista/tecnicos/index.jsp");
                break;
            case 2:
                response.sendRedirect(request.getContextPath() + "/vista/cliente/index.jsp");
                break;
        }
    }
}
