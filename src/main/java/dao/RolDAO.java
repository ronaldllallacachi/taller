package dao;

import dto.Rol;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class RolDAO implements IRol {

    conexion con;

    @Override
    public int Insertar(Rol r) {
        return 0;
    }

    @Override
    public int Eliminar(int id) {
        return 0;
    }

    @Override
    public int Modificar(Rol r, int id) {
        return 0;
    }

    @Override
    public Rol Buscar(int id) {
        con = new conexion();
        List<Rol> lista = new ArrayList();
        Connection cnn;
        PreparedStatement pst;
        ResultSet rs;
        String sql = "select * from rol where idrol=?";
        try {
            con.Conectar();
            cnn = con.getConexion();
            pst = cnn.prepareStatement(sql);
            pst.setInt(1, id);
            rs = pst.executeQuery();
            while (rs.next()) {
                lista.add(new Rol(rs.getInt("idrol"), rs.getString("nombre")));
            }
            cnn.close();
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return lista.get(0);
    }

    @Override
    public List<Rol> Listar() {
        con = new conexion();
        List<Rol> lista = new ArrayList();
        Connection cnn;
        PreparedStatement pst;
        ResultSet rs;
        String sql = "select * from rol where idrol <> 3";
        try {
            con.Conectar();
            cnn = con.getConexion();
            pst = cnn.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                lista.add(new Rol(rs.getInt("idrol"), rs.getString("nombre")));
            }
            cnn.close();
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return lista;
    }
}
