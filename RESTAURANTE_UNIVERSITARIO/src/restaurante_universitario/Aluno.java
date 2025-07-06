package restaurante_universitario;

public class Aluno extends Pessoa {
	//Atributos
	private int matricula;
	private String curso;
	private double desconto;
	
	//Construtor
	public Aluno(String nome, int matricula, String curso, double desconto) {
		super(nome);
		this.matricula = matricula;
		this.curso = curso;
		this.desconto = desconto;
		
	}

	//Métodos setters and getters
	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}
	
	//Método pagar refeição
	public void pagarRefeicao(double valorRefeicao) {
		double valorComDesconto = valorRefeicao - (valorRefeicao * (desconto / 100));
		System.out.println(getNome() + "\nMatricula: " + matricula + "\nCurso: " + curso + "\npagou R$" + valorComDesconto + "pela refeição com desconto.");
	}
}
	
