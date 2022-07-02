package dao;

import dto.Atencion;
import java.util.List;

public interface IAtencion {
    public int Insertar(Atencion a);

    public int Eliminar(int id);

    public int Modificar(Atencion a, int id);

    public Atencion Buscar(int id);

    public List<Atencion> Listar();
}
