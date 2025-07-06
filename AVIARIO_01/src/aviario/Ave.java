package aviario;

public class Ave {
    //Atributos
    private String especie;
    private String cor;
    private String sexo;

    //Contrutor
    public Ave(String especie, String cor, String sexo){
        this.especie = especie;
        this.cor = cor;
        this.sexo = sexo;
    }

    //Métodos getters and setters
    public String getEspecie(){
        return especie;
    }

    public String getCor(){
        return cor;
    }

    public String getSexo(){
        return sexo;
    }

    public void setEspecie(String especie){
        this.especie = especie;
    }

    public void setCor(String cor){
        this.cor = cor;
    }

    public void setSexo(String sexo){
        this.sexo = sexo;
    }

    //Método toString
    @Override
    public String toString(){
        return "Especie: " + especie + "\nCor: " + cor + "\nSexo: " + sexo;
    }
}

