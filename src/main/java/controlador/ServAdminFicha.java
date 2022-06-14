package controlador;

import dao.FichaDAO;
import dto.Ficha;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "ServAdminFicha", urlPatterns = {"/ServAdminFicha"})
public class ServAdminFicha extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id_usuario = Integer.parseInt(request.getParameter("id_usu"));
        FichaDAO ficha_dao = new FichaDAO();
        List<Ficha> fichas = ficha_dao.Buscar(id_usuario);
        for (Ficha ficha : fichas) {
            request.getSession().setAttribute("nombres", ficha.getNombres());
            request.getSession().setAttribute("apellidos", ficha.getApellidos());
            request.getSession().setAttribute("dni", ficha.getDni());
            request.getSession().setAttribute("telefono", ficha.getTelefono());
            request.getSession().setAttribute("direccion", ficha.getDireccion());
            request.getSession().setAttribute("correo", ficha.getCorreo());
        }

        HttpSession session = request.getSession(false);

        session.setAttribute("idusuario", id_usuario);

        response.sendRedirect(request.getContextPath() + "/vista/admin/ficha/update.jsp");

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
        String correo = request.getParameter("txtcorreo");

        Ficha ficha_dto = new Ficha(id, nombres, apellidos, dni, telefono, direccion, correo);
        FichaDAO ficha_dao = new FichaDAO();
        ficha_dao.Modificar(ficha_dto);

        response.sendRedirect(request.getContextPath() + "/ServAdminUsuarios");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
