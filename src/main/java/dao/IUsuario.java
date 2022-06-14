package dao;

import dto.Usuario;
import java.util.List;

public interface IUsuario {

    public int Insertar(Usuario r);

    public int Eliminar(int id);

    public int Modificar(Usuario r, int id);

    public List<Usuario> Buscar(int id);

    public List<Usuario> Listar();
}
