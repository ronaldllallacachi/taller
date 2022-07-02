package dao;

import dto.Tipo;
import java.util.List;

public class TipoDAO implements ITipo {

    conexion con;

    @Override
    public int Insertar(Tipo t) {
        return 0;
    }

    @Override
    public int Eliminar(int id) {
        return 0;
    }

    @Override
    public int Modificar(Tipo t, int id) {
        return 0;
    }

    @Override
    public Tipo Buscar(int id) {
        return null;
    }

    @Override
    public List<Tipo> Listar() {
        return null;
    }
}
