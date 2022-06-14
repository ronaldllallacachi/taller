package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexion {

    private static String bd = "taller_utp";
    private static String user = "root";
    private static String pass = "";
    private static String ruta = "jdbc:mysql://localhost:3306/" + bd;
    private static String driver = "com.mysql.jdbc.Driver";

    private Connection conexion;

    public String getDriver() {
        return driver;
    }

    public Connection getConexion() {
        return conexion;
    }

    public void setConexion(Connection conexion) {
        this.conexion = conexion;
    }

    public void Conectar() throws Exception {
        try {
            Class.forName(driver);
            this.conexion = DriverManager.getConnection(ruta, user, pass);
            if (this.conexion != null) {
                System.out.println("Conectado correctamente");
            } else {
                System.out.println("Error al conectar");
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void Desconectar() throws Exception {
        try {
            if (this.conexion != null) {
                if (this.conexion.isClosed() != true) {
                    this.conexion.close();
                }
            }
        } catch (SQLException e) {
        }
    }
}
