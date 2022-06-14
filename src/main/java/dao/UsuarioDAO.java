package dao;

import dto.Rol;
import dto.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UsuarioDAO implements IUsuario {

    conexion con;

    @Override
    public int Insertar(Usuario u) {
        con = new conexion();
        int resultado = 0;
        Connection conn;
        PreparedStatement pst;
        String sql = "INSERT INTO usuario (usuario, password, idrol, estado) VALUES (?, ?, ?, ?)";
        try {
            con.Conectar();
            conn = con.getConexion();
            pst = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            pst.setString(1, u.getUsuario());
            pst.setString(2, u.getUsuario());
            pst.setInt(3, u.getRol().getIdrol());
            pst.setBoolean(4, u.getEstado());
            pst.executeUpdate();
            ResultSet rs = pst.getGeneratedKeys();
            if (rs.next()) {
                resultado = rs.getInt(1);
            }
            conn.close();
            con.Desconectar();
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        return resultado;
    }

    @Override
    public int Eliminar(int id) {
        return 0;
    }

    @Override
    public int Modificar(Usuario r, int id) {

        return 0;
    }

    @Override
    public List<dto.Usuario> Buscar(int id) {
        return null;
    }

    @Override
    public List<Usuario> Listar() {
        return null;
    }

    public List<Usuario> login(String user, String pass) {
        con = new conexion();

        List<Usuario> lista = new ArrayList();
        Rol rol;
        RolDAO roldao = new RolDAO();

        Connection conn;
        PreparedStatement pst;
        ResultSet rs;
        String sql = "select * from usuario where usuario = ? and password = ?";
        try {
            con.Conectar();
            conn = con.getConexion();
            pst = conn.prepareStatement(sql);
            pst.setString(1, user);
            pst.setString(2, pass);
            rs = pst.executeQuery();
            while (rs.next()) {
                rol = roldao.Buscar(Integer.parseInt(rs.getString("idrol")));
                lista.add(new Usuario(
                        rs.getInt("idusuario"),
                        rs.getString("usuario"),
                        rs.getString("password"),
                        rol,
                        rs.getBoolean("estado")));

            }
            conn.close();
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("error: " + e.getMessage());
        } catch (Exception ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }

    public List<Usuario> usuarios_admin() {
        con = new conexion();

        List<Usuario> lista = new ArrayList();
        Rol rol;
        RolDAO roldao = new RolDAO();

        Connection conn;
        PreparedStatement pst;
        ResultSet rs;
        String sql = "select @i := @i + 1 as numero, u.idusuario, u.usuario, u.idrol, u.estado from usuario u cross join (select @i := 0) numero where u.idrol <> 3 ";
        try {
            con.Conectar();
            conn = con.getConexion();
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                rol = roldao.Buscar(Integer.parseInt(rs.getString("idrol")));
                lista.add(new Usuario(
                        rs.getInt("idusuario"),
                        rs.getInt("numero"),
                        rs.getString("usuario"),
                        rol,
                        rs.getBoolean("estado")
                ));
            }
            conn.close();
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("error: " + e.getMessage());
        } catch (Exception ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }
}
