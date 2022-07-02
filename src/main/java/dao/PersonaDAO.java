package dao;

import dto.Persona;
import java.util.List;

public class PersonaDAO implements IPersona {

    conexion con;

    @Override
    public int Insertar(Persona p) {
        return 0;
    }

    @Override
    public int Eliminar(int id) {
        return 0;
    }

    @Override
    public int Modificar(Persona p, int id) {
        return 0;
    }

    @Override
    public Persona Buscar(int id) {
        return null;
    }

    @Override
    public List<Persona> Listar() {
        return null;
    }
}
