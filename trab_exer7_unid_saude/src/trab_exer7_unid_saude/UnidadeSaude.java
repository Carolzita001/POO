package trab_exer7_unid_saude;

public class UnidadeSaude {
	protected String nome;
	protected String endereco;
    protected int capacidade;
    
    public UnidadeSaude(String nome, String endereco, int capacidade) {
    	this.nome = nome;
    	this.endereco = endereco;
    	this.capacidade = capacidade;
    	
    }
    
    public void exibirInfo() {
    	System.out.println("Nome: " + nome);
    	System.out.println("Endereço: " + endereco);
    	System.out.println("Capacidade: " + capacidade);
    }
}
