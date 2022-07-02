package dao;

import dto.Equipo;
import java.util.List;

public class EquipoDAO implements IEquipo {

    conexion con;

    @Override
    public int Insertar(Equipo e) {
        return 0;
    }

    @Override
    public int Eliminar(int id) {
        return 0;
    }

    @Override
    public int Modificar(Equipo e, int id) {
        return 0;
    }

    @Override
    public Equipo Buscar(int id) {
        return null;
    }

    @Override
    public List<Equipo> Listar() {
        return null;
    }
}
