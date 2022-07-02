package dto;

public class Modelo {

    private int idmodelo;
    private String nombre;

    public Modelo() {
    }

    public Modelo(int idmodelo, String nombre) {
        this.idmodelo = idmodelo;
        this.nombre = nombre;
    }

    public int getIdmodelo() {
        return idmodelo;
    }

    public void setIdmodelo(int idmodelo) {
        this.idmodelo = idmodelo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
