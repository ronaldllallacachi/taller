package dao;

import dto.Ficha;
import java.util.List;

public interface IFicha {
    
    public int Insertar(Ficha f);

    public int Eliminar(int id);

    public int Modificar(Ficha f);

    public List<Ficha> Buscar(int id);

    public List<Ficha> Listar();
}
