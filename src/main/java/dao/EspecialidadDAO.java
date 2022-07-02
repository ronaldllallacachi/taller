package dao;

import dto.Especialidad;
import java.util.List;

public class EspecialidadDAO implements IEspecialidad {

    conexion con;

    @Override
    public int Insertar(Especialidad e) {
        return 0;
    }

    @Override
    public int Eliminar(int id) {
        return 0;
    }

    @Override
    public int Modificar(Especialidad e, int id) {
        return 0;
    }

    @Override
    public Especialidad Buscar(int id) {
        return null;
    }

    @Override
    public List<Especialidad> Listar() {
        return null;
    }
}
