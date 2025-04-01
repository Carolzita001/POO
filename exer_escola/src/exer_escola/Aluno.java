package exer_escola;

public class Aluno  extends Pessoa{
	private String disciplina;
	
	Aluno(){
		this.disciplina = "Desconhecido";
		//this("");
	}
	
	Aluno(String nome, int idade, String disciplina){
		super(nome, idade);
		this.disciplina = disciplina;
	}
	
	public String getDisciplina() {
		return disciplina;
	}
	
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", Disciplina: " + disciplina;
	}
}
