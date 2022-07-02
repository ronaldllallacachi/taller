package dto;

public class Ubigeo {

    private int idubigeo;
    private String departamento;
    private String provincia;
    private String distrito;
    private int codigo;

    public Ubigeo() {
    }

    public Ubigeo(int idubigeo, String departamento, String provincia, String distrito, int codigo) {
        this.idubigeo = idubigeo;
        this.departamento = departamento;
        this.provincia = provincia;
        this.distrito = distrito;
        this.codigo = codigo;
    }

    public int getIdubigeo() {
        return idubigeo;
    }

    public void setIdubigeo(int idubigeo) {
        this.idubigeo = idubigeo;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }


}
