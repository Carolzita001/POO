package aviario;

public class Ave_voa extends Ave {
    //Atributos
    private String habilidade_escape;
    private String diversidade_habitat;

    //Construtor
    public Ave_voa(String especie, String cor, String sexo, String habilidade_escape, String diversidade_habitat){
        super(especie, cor, sexo);
        this.habilidade_escape = habilidade_escape;
        this.diversidade_habitat = diversidade_habitat;
    }

    //Métodos getters and setters
    public String getHabilidade_escape(){
        return habilidade_escape;
    }

    public String getDiversidade_habitat(){
        return diversidade_habitat;
    }

    public void setHabitate_escape(String habilidade_escape){
        this.habilidade_escape = habilidade_escape;
    }

    public void setDiversidade_habitat(String diversidade_habitat){
        this.diversidade_habitat = diversidade_habitat;
    }

    //Método toString
    @Override
    public String toString(){
        return super.toString() + "\nHabilidade de escape: " + habilidade_escape + "\nDiversidade de habitat: " + diversidade_habitat;
    }
}

