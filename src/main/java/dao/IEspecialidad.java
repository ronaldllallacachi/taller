package dao;

import dto.Especialidad;
import java.util.List;

public interface IEspecialidad {

    public int Insertar(Especialidad e);

    public int Eliminar(int id);

    public int Modificar(Especialidad e, int id);

    public Especialidad Buscar(int id);

    public List<Especialidad> Listar();
}
