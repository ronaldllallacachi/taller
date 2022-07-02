package dto;

public class TipoAtencion {

    private int idtipoatencion;
    private String nombre;

    public TipoAtencion() {
    }

    public TipoAtencion(int idtipoatencion, String nombre) {
        this.idtipoatencion = idtipoatencion;
        this.nombre = nombre;
    }

    public int getIdtipoatencion() {
        return idtipoatencion;
    }

    public void setIdtipoatencion(int idtipoatencion) {
        this.idtipoatencion = idtipoatencion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
