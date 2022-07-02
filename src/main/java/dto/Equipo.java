package dto;

public class Equipo {

    private int idequipo;
    private String nombre;
    private Marca marca;
    private Modelo modelo;
    private Tipo tipo;
    private Usuario idusuario;

    public Equipo() {
    }

    public Equipo(int idequipo, String nombre, Marca marca, Modelo modelo, Tipo tipo, Usuario idusuario) {
        this.idequipo = idequipo;
        this.nombre = nombre;
        this.marca = marca;
        this.modelo = modelo;
        this.tipo = tipo;
        this.idusuario = idusuario;
    }

    public int getIdequipo() {
        return idequipo;
    }

    public void setIdequipo(int idequipo) {
        this.idequipo = idequipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public Usuario getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(Usuario idusuario) {
        this.idusuario = idusuario;
    }


}
