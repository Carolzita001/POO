public class Veiculo {//Classe pai
    // O uso do private mais os setters e getter permitem o encapsulamento dos atributos
    // O encapsulamento é um dos pilares da POO, que permite proteger os dados e controlar o acesso a eles
    private String marca;// Atributo marca do veículo
    private String modelo;
    private int ano;

    // Construtor com parâmetros para inicializar os atributos
    public Veiculo(String marca, String modelo, int ano){
        this.marca = marca;//O this é usado para referenciar o objeto atual, evitando confusão entre os atributos e os parâmetros do construtor
        this.modelo = modelo;
        this.ano = ano;
    }

    // Métodos getters para acessar os atribulos
    public String getMarca(){
        return marca;// O método getMarca retorna o valor do atributo marca
    }

    public String getModelo(){
        return modelo;
    }

    public int getAno(){
        return ano;
    }

    // Métodos setters para modificar os atributos
    public void setMarca(String marca){
        this.marca = marca;// O método setMarca recebe um parâmetro e atribui o valor ao atributo marca do objeto atual
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public void setAno(int ano){
        this.ano = ano;
    }

    // Método toString para representar o objeto como uma string (Polimorfismo)
    @Override
    public String toString(){
        return "Marca: " + marca + "\nModelo: " + modelo + "\nAno: " + ano;
    }
}
