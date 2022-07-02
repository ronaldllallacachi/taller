package dao;

import dto.Atencion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

public class AtencionDAO implements IAtencion {

    conexion con;

    @Override
    public int Insertar(Atencion a) {      
        return 0;
    }

    @Override
    public int Eliminar(int id) {
        return 0;
    }

    @Override
    public int Modificar(Atencion a, int id) {
        return 0;
    }

    @Override
    public Atencion Buscar(int id) {
        return null;
    }

    @Override
    public List<Atencion> Listar() {
        return null;
    }
}
