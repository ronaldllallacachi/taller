package dao;

import dto.Rol;
import java.util.List;

public interface IRol {

    public int Insertar(Rol r);

    public int Eliminar(int id);

    public int Modificar(Rol r, int id);

    public Rol Buscar(int id);

    public List<Rol> Listar();

}
