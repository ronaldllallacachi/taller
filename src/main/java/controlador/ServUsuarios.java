package controlador;

import dao.FichaDAO;
import dao.RolDAO;
import dao.UsuarioDAO;
import dto.Ficha;
import dto.Usuario;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ServUsuarios", urlPatterns = {"/ServUsuarios"})
public class ServUsuarios extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.sendRedirect(request.getContextPath() + "/vista/usuario/index.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String contextPath = request.getContextPath();

        String user = request.getParameter("txtuser");
        String pass = request.getParameter("txtpassword");

        RolDAO rol_dao = new RolDAO();
        UsuarioDAO usuario_dao = new UsuarioDAO();
        Usuario usuario_dto = new Usuario(user, pass, rol_dao.Buscar(2), Boolean.TRUE);
        int respuesta = usuario_dao.Insertar(usuario_dto);

        if (respuesta == -1) {
            response.sendRedirect(contextPath + "/vista/usuario/index.jsp?incidencia=si");
        }
        if (respuesta > 0) {
            FichaDAO ficha_dao = new FichaDAO();
            Ficha ficha_dto = new Ficha(respuesta);
            ficha_dao.Insertar(ficha_dto);
            response.sendRedirect(contextPath + "/index.jsp?creacion=si");

        }
    }
}
