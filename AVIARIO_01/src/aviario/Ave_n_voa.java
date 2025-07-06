package aviario;

public class Ave_n_voa extends Ave {
    //Atributos
    private String asas_curtas;
    private String quilha;

    //Construtor
    public Ave_n_voa(String especie, String cor, String sexo, String asas_curtas, String quilha){
        super(especie, cor, sexo);
        this.asas_curtas = asas_curtas;
        this.quilha = quilha;
    }

    //Métodos getters and setters
    public String getAsas_curtas(){
        return asas_curtas;
    }

    public String getQuilha(){
        return quilha;
    }

    public void setAsas_curtas(String asas_curtas){
        this.asas_curtas = asas_curtas;
    }

    public void setQuilha(String quilha){
        this.quilha = quilha;
    }

    //Método toString
    @Override
    public String toString(){
        return super.toString() + "\nAsas curtas: " + asas_curtas + "\nQuilha: " + quilha;
    }
}

