package aula_12;

public class Cadastro {
	//Atributos do objeto
	private int codigo;
	private String nome;
	
	//Atributos da Classe
	static int codigoStatic = 1;
	
	//Construtores
	public Cadastro(String nome) {
		this.codigo = codigoStatic++;
		this.nome = nome;
	}

	//Metodos
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Cadastro [codigo=" + codigo + ", nome=" + nome + "]";
	}
	
}
