package exer_sist_cadast_aluno;

import java.util.Scanner;

public class javaCadastroAluno {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//Recebendo a média do aluno
		System.out.print("Digite a média do aluno: ");
		double media = scanner.nextDouble();
		//Verificando se o aluno foi apro. ou repro.
		if(media >= 6.0) {
			System.out.println("Aluno aprovado");
		}else {
			System.out.println("Aluno reprovado");
		}
		scanner.close();
	}
	
}
