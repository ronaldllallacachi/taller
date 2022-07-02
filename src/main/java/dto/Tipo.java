package dto;

public class Tipo {

    private int idtipo;
    private String nombre;

    public Tipo() {
    }

    public Tipo(int idtipo, String nombre) {
        this.idtipo = idtipo;
        this.nombre = nombre;
    }

    public int getIdtipo() {
        return idtipo;
    }

    public void setIdtipo(int idtipo) {
        this.idtipo = idtipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
