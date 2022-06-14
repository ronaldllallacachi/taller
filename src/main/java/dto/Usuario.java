package dto;

public class Usuario {

    public int idusuario;
    public int numeracion;
    public String usuario;
    public String password;
    public Rol rol;
    public Boolean estado;

    public Usuario() {
    }

    public Usuario(int idusuario, String usuario, String password, Rol rol, Boolean estado) {
        this.idusuario = idusuario;
        this.usuario = usuario;
        this.password = password;
        this.rol = rol;
        this.estado = estado;
    }

    public Usuario(String usuario, String password, Rol rol, Boolean estado) {
        this.usuario = usuario;
        this.password = password;
        this.rol = rol;
        this.estado = estado;
    }


    public Usuario(int idusuario, int numeracion, String usuario, Rol rol, Boolean estado) {
        this.idusuario = idusuario;
        this.numeracion = numeracion;
        this.usuario = usuario;
        this.rol = rol;
        this.estado = estado;
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public int getNumeracion() {
        return numeracion;
    }

    public void setNumeracion(int numeracion) {
        this.numeracion = numeracion;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    

}
