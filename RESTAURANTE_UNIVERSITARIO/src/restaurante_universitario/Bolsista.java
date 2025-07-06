package restaurante_universitario;

public class Bolsista extends Aluno {
	//Contrutor
	public Bolsista(String nome, int matricula, String curso, double desconto) {
		super(nome, matricula, curso,desconto);
	}
	
	@Override
	public void pagarRefeicao(double valorRefeicao) {
		System.out.println("Nome: " + getNome() + "\nMatricula: " + getMatricula() + "\nCurso: " + getCurso() + "não pagou pela refeição por ser bolsista.");
	}
}
