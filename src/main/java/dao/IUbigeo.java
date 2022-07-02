package dao;

import dto.Ubigeo;
import java.util.List;

public interface IUbigeo {

    public int Insertar(Ubigeo u);

    public int Eliminar(int id);

    public int Modificar(Ubigeo u, int id);

    public Ubigeo Buscar(int id);

    public List<Ubigeo> Listar();
}
