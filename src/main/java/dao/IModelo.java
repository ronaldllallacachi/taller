package dao;

import dto.Modelo;
import java.util.List;

public interface IModelo {

    public int Insertar(Modelo m);

    public int Eliminar(int id);

    public int Modificar(Modelo a, int id);

    public Modelo Buscar(int id);

    public List<Modelo> Listar();
}
