package exer_escola;

public class Professor extends Pessoa{
	private String materia;
	
	Professor(){
		this.materia = "Desconhecido";
		//this("");
	}
	
	Professor(String nome, int idade, String materia){
		super(nome, idade);
		this.materia = materia;
	}
	
	public String getMateria() {
		return materia;
	}
	
	public void setMateria(String materia) {
		this.materia = materia;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", Matéria: " + materia;
	}
}
