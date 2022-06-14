package dto;

public class Tecnico {
    private int Id;
    private Horario horario;
        
    public Tecnico(){
        
    }   

    public Tecnico(int Id, Horario horario) {
        this.Id = Id;
        this.horario = horario;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public Horario getHorario() {
        return horario;
    }

    public void setHorario(Horario horario) {
        this.horario = horario;
    }
  
}
