package dao;

import dto.Ficha;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FichaDAO implements IFicha {

    conexion con;

    @Override
    public int Insertar(Ficha f) {
        con = new conexion();
        int resultado = 0;
        Connection conn;
        PreparedStatement pst;
        String sql = "INSERT INTO ficha_persona (idpersona) VALUES (?)";
        try {
            con.Conectar();
            conn = con.getConexion();
            pst = conn.prepareStatement(sql);
            pst.setInt(1, f.getIdpersona());
            resultado = pst.executeUpdate();
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
    public int Modificar(Ficha f) {
        con = new conexion();
        int resultado = 0;
        Connection conn;
        PreparedStatement pst;
        String sql = "update ficha_persona set"
                + " nombres=?,"
                + "apellidos=?,"
                + "dni =?,"
                + "telefono=?,"
                + "direccion=?,"
                + "correo=?"
                + " where idpersona=?";
        System.out.println(sql);
        try {
            con.Conectar();
            conn = con.getConexion();
            pst = conn.prepareStatement(sql);
            pst.setInt(7, f.getIdpersona());
            pst.setString(1, f.getNombres());
            pst.setString(2, f.getApellidos());
            pst.setInt(3, f.getDni());
            pst.setInt(4, f.getTelefono());
            pst.setString(5, f.direccion);
            pst.setString(6, f.correo);
            resultado = pst.executeUpdate();
            conn.close();
            con.Desconectar();
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        return resultado;
    }

    @Override
    public List<Ficha> Buscar(int id) {
        con = new conexion();

        List<Ficha> lista = new ArrayList();
        Connection conn;
        PreparedStatement pst;
        ResultSet rs;
        String sql = "select * from ficha_persona where idpersona = ?";
        try {
            con.Conectar();
            conn = con.getConexion();
            pst = conn.prepareStatement(sql);
            pst.setInt(1, id);
            rs = pst.executeQuery();
            while (rs.next()) {
                lista.add(new Ficha(
                        rs.getInt("idpersona"),
                        rs.getString("nombres"),
                        rs.getString("apellidos"),
                        rs.getInt("dni"),
                        rs.getInt("telefono"),
                        rs.getString("direccion"),
                        rs.getString("correo")));
            }
            conn.close();
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("error: " + e.getMessage());
        } catch (Exception ex) { 
            Logger.getLogger(FichaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }

    @Override
    public List<Ficha> Listar() {
        return null;
    }
}
