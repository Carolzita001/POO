package exer_escola;

public class Pessoa {
	//atributos
	
	 private String nome;
	 private int idade;
	
	//Construtores
	
	Pessoa(){
		this.nome = "Desconhecido";
		this.idade = 0;
	}
	
	Pessoa(String nome, int idade){
		this.idade = idade;
		this.nome = nome;
	}
	
	//metodos

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	//metodo tooString
	
	@Override
	public String toString() {
		return "Pessoa: [ nome: " + nome + ", idade: " + idade +" ]";
	}
	
	
	
}
