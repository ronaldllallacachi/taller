package dto;

import java.sql.Date;

public class Atencion {

    private int idcita;
    private Equipo equipo;
    private String descripcion;
    private Usuario cliente;
    private Usuario tecnico;
    private Usuario encargado;
    private Date fecha;
    private TipoAtencion tipoatencion;
    private String estado_atencion;
    private boolean estado;

    public Atencion() {
    }

    public Atencion(int idcita, Equipo equipo, String descripcion, Usuario cliente, Usuario tecnico, Usuario encargado, Date fecha, TipoAtencion tipoatencion, String estado_atencion, boolean estado) {
        this.idcita = idcita;
        this.equipo = equipo;
        this.descripcion = descripcion;
        this.cliente = cliente;
        this.tecnico = tecnico;
        this.encargado = encargado;
        this.fecha = fecha;
        this.tipoatencion = tipoatencion;
        this.estado_atencion = estado_atencion;
        this.estado = estado;
    }

    public int getIdcita() {
        return idcita;
    }

    public void setIdcita(int idcita) {
        this.idcita = idcita;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Usuario getCliente() {
        return cliente;
    }

    public void setCliente(Usuario cliente) {
        this.cliente = cliente;
    }

    public Usuario getTecnico() {
        return tecnico;
    }

    public void setTecnico(Usuario tecnico) {
        this.tecnico = tecnico;
    }

    public Usuario getEncargado() {
        return encargado;
    }

    public void setEncargado(Usuario encargado) {
        this.encargado = encargado;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public TipoAtencion getTipoatencion() {
        return tipoatencion;
    }

    public void setTipoatencion(TipoAtencion tipoatencion) {
        this.tipoatencion = tipoatencion;
    }

    public String getEstado_atencion() {
        return estado_atencion;
    }

    public void setEstado_atencion(String estado_atencion) {
        this.estado_atencion = estado_atencion;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }


}
