package dao;

import dto.Tipo;
import java.util.List;

public interface ITipo {
    public int Insertar(Tipo t);

    public int Eliminar(int id);

    public int Modificar(Tipo t, int id);

    public Tipo Buscar(int id);

    public List<Tipo> Listar();
}
