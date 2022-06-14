package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dao.UsuarioDAO;
import dto.Usuario;
import java.util.List;
import javax.servlet.http.HttpSession;

@WebServlet(name = "ServLogin", urlPatterns = {"/ServLogin"})
public class ServLogin extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        UsuarioDAO usuario_dao = new UsuarioDAO();
        Usuario usuario_dto;

        String user = request.getParameter("user");
        String pass = request.getParameter("password");

        HttpSession session = request.getSession(false);

        if (session == null) {
            session = request.getSession(true);
        }

        List<Usuario> lista = usuario_dao.login(user, pass);

        if (lista != null) {
            usuario_dto = lista.get(0);

            session.setAttribute("idusuario", usuario_dto.getIdusuario());
            session.setAttribute("idrol", usuario_dto.getRol().getIdrol());
            session.setAttribute("rol", usuario_dto.getRol().getNombre());

            switch (usuario_dto.getRol().getIdrol()) {
                case 1:
                    response.sendRedirect(request.getContextPath() + "/vista/tecnicos/index.jsp");
                    break;
                case 2:
                    response.sendRedirect(request.getContextPath() + "/vista/cliente/index.jsp");
                    break;
                case 3:
                    response.sendRedirect(request.getContextPath() + "/vista/admin/index.jsp");
                    break;
            }
        } else {
            session.setAttribute("error", true);
        }

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

    private void response(HttpServletResponse resp, String msg) throws IOException {
        PrintWriter out = resp.getWriter();
        out.println("<html>");
        out.println("<body>");
        out.println("<t1>" + msg + "</t1>");
        out.println("</body>");
        out.println("</html>");
    }
}
