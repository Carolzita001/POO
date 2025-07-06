//Classe filha - Herança
// A classe carro herda os atributos e métodos da classe Veiculo
public class Carro extends Veiculo {
    private int portas;
    private String cor;
    private String tipoCombustivel;

    //contrutor com parâmetros para inicializar os atributos da classe carro
    // O construtor da classe carro chama o construtor da classe pai (veiculo) usando super()
    // Isso é necessário para garantir que os atributos da classe pai sejam inicializados corretamente
    public Carro(String marca, String modelo, int ano, int portas, String cor, String tipoCombustivel) {
        super(marca, modelo, ano); // Chama o construtor da classe pai (veiculo)
        this.portas = portas;
        this.cor = cor;
        this.tipoCombustivel = tipoCombustivel;
    }

    // Métodos getters para acessar os atributos da classe carro
    public int getPortas() {
        return portas;
    }

    public String getCor() {
        return cor;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    // Métodos setters para modificar os atributos da classe carro
    public void setPortas(int portas) {
        this.portas = portas;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    // Método toString para representar o objeto carro como uma string (Polimorfismo)
    @Override
    public String toString() {
        // Chama o método toString da classe pai (veiculo) e adiciona os atributos específicos da classe carro
        return super.toString() + "\nPortas: " + portas + "\nCor: " + cor + "\nTipo de Combustível: " + tipoCombustivel;
    }
}
