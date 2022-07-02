package dto;

public class Marca {

    private int idmarca;
    private String nombre;

    public Marca() {
    }

    public Marca(int idmarca, String nombre) {
        this.idmarca = idmarca;
        this.nombre = nombre;
    }

    public int getIdmarca() {
        return idmarca;
    }

    public void setIdmarca(int idmarca) {
        this.idmarca = idmarca;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


}
