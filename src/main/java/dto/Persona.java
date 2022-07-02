package dto;

import java.sql.Date;

public class Persona {

    private int idpersona;
    private String nombres;
    private String apellidos;
    private int dni;
    private int telefono;
    private String direccion;
    private String correo;
    private Ubigeo ubigeo;
    private Date nacimiento;
    private Especialidad especialidad;
    private boolean estado;

    public Persona() {
    }

    public Persona(int idpersona, String nombres, String apellidos, int dni, int telefono, String direccion, String correo, Ubigeo ubigeo, Date nacimiento, Especialidad especialidad, boolean estado) {
        this.idpersona = idpersona;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.dni = dni;
        this.telefono = telefono;
        this.direccion = direccion;
        this.correo = correo;
        this.ubigeo = ubigeo;
        this.nacimiento = nacimiento;
        this.especialidad = especialidad;
        this.estado = estado;
    }

    public Persona(int idpersona, String nombres, String apellidos, int dni, int telefono, String direccion, String correo, Ubigeo ubigeo, Date nacimiento, boolean estado) {
        this.idpersona = idpersona;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.dni = dni;
        this.telefono = telefono;
        this.direccion = direccion;
        this.correo = correo;
        this.ubigeo = ubigeo;
        this.nacimiento = nacimiento;
        this.estado = estado;
    }

    public int getIdpersona() {
        return idpersona;
    }

    public void setIdpersona(int idpersona) {
        this.idpersona = idpersona;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Ubigeo getUbigeo() {
        return ubigeo;
    }

    public void setUbigeo(Ubigeo ubigeo) {
        this.ubigeo = ubigeo;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }


}
