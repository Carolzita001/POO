// Classe filha - Herança
// A classe moto herda os atributos e métodos da classe veiculo
public class Moto extends Veiculo {
    private String tipo;
    private String cilindrada;
    private String cor;

    // Construtor com parâmetros para inicializar os atributos da classe moto
    // O construtor da classe moto chama o construtor da classe pai (veiculo) usando super()
    public Moto(String marca, String modelo, int ano, String tipo, String cilindrada, String cor) {
        super(marca, modelo, ano); // Chama o construtor da classe pai (veiculo)
        this.tipo = tipo;
        this.cilindrada = cilindrada;
        this.cor = cor;
    }

    // Métodos getters para acessar os atributos da classe moto
    public String getTipo() {
        return tipo;
    }

    public String getCilindrada() {
        return cilindrada;
    }

    public String getCor() {
        return cor;
    }

    // Métodos setters para modificar os atributos da classe moto
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setCilindrada(String cilindrada) {
        this.cilindrada = cilindrada;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    // Método toString para representar o objeto moto como uma string (Polimorfismo)
    @Override
    public String toString() {
        // Chama o método toString da classe pai (veiculo) e adiciona os atributos específicos da classe moto
        return super.toString() + "\nTipo: " + tipo + "\nCilindrada: " + cilindrada + "\nCor: " + cor;
    }
    
}
