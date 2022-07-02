package dao;

import dto.Persona;
import java.util.List;

public interface IPersona {

    public int Insertar(Persona p);

    public int Eliminar(int id);

    public int Modificar(Persona p, int id);

    public Persona Buscar(int id);

    public List<Persona> Listar();
}
