package controlador;

import dao.FichaDAO;
import dao.RolDAO;
import dao.UsuarioDAO;
import dto.Ficha;
import dto.Rol;
import dto.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ServAdminAddUsuario", urlPatterns = {"/ServAdminAddUsuario"})
public class ServAdminAddUsuario extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RolDAO rol_dao = new RolDAO();
        List<Rol> lista = rol_dao.Listar();
        request.setAttribute("list_rol", lista);
        String path = "/vista/admin/usuarios/add.jsp";

        getServletContext().getRequestDispatcher(path).forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String user = request.getParameter("user");
        String pass = request.getParameter("pass");
        Integer id_rol = Integer.parseInt(request.getParameter("select_rol"));

        RolDAO rol_dao = new RolDAO();
        Rol rol_dto = rol_dao.Buscar(id_rol);

        UsuarioDAO usuario_dao = new UsuarioDAO();
        Usuario usuario_dto = new Usuario(user, pass, rol_dto, Boolean.TRUE);
        int id_usuario = usuario_dao.Insertar(usuario_dto);

        Ficha ficha = new Ficha(id_usuario);
        FichaDAO ficha_dao = new FichaDAO();
        ficha_dao.Insertar(ficha);
        


        response.sendRedirect(request.getContextPath() + "/vista/admin/index.jsp");
    }
}
