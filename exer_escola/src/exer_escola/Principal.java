package exer_escola;

public class Principal {
	public static void main() {
		Pessoa pessoa = new Pessoa("Carlos", 30);
		Aluno aluno = new Aluno("Ana", 20, "Matemática");
		Professor professor = new Professor("João", 45, "Física");
		
		System.out.println(pessoa);
		System.out.println(aluno);
		System.out.println(professor);
	}
}
