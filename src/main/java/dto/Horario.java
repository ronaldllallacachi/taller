package dto;

public class Horario {
    public int idhorario;
    public String nombre;
    
    public Horario(){
        
    }

    public Horario(int idhorario, String nombre) {
        this.idhorario = idhorario;
        this.nombre = nombre;
    }

    public int getIdhorario() {
        return idhorario;
    }

    public void setIdhorario(int idhorario) {
        this.idhorario = idhorario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
