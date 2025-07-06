package restaurante_universitario;

public class Pessoa {
	//Atributos
	private String nome;
	
	//Construtor
	public Pessoa(String nome) {
		this.nome = nome;
	}
	
	//Métodos setters and Getters
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	//Método pagar refeição
	public void pagarRefeicao() {
		System.out.println(nome + "pagou o valor total da refeição.");
	}
	
	//Métodos toString
	/*@Override
	public String toString() {
		return "Nome: " + nome;
	}*/
}
