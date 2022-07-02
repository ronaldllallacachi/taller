package dao;

import dto.Equipo;
import java.util.List;

public interface IEquipo {

    public int Insertar(Equipo e);

    public int Eliminar(int id);

    public int Modificar(Equipo e, int id);

    public Equipo Buscar(int id);

    public List<Equipo> Listar();
}
