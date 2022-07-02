package dao;

import dto.Modelo;
import java.util.List;

public class ModeloDAO implements IModelo {

    conexion con;

    @Override
    public int Insertar(Modelo m) {
        return 0;
    }

    @Override
    public int Eliminar(int id) {
        return 0;
    }

    @Override
    public int Modificar(Modelo a, int id) {
        return 0;
    }

    @Override
    public Modelo Buscar(int id) {
        return null;
    }

    @Override
    public List<Modelo> Listar() {
        return null;
    }
}
