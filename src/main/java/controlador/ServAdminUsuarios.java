package controlador;

import dao.UsuarioDAO;
import dto.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ServAdminUsuarios", urlPatterns = {"/ServAdminUsuarios"})
public class ServAdminUsuarios extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        UsuarioDAO usuario_dao = new UsuarioDAO();
        List<Usuario> lista = usuario_dao.usuarios_admin();
        request.setAttribute("admin_usuarios", lista);
        String path = "/vista/admin/usuarios/list.jsp";

        getServletContext().getRequestDispatcher(path).forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

}
