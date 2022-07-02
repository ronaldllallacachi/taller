package dao;

import dto.Marca;
import java.util.List;

public interface IMarca {
    public int Insertar(Marca a);

    public int Eliminar(int id);

    public int Modificar(Marca a, int id);

    public Marca Buscar(int id);

    public List<Marca> Listar();
}
