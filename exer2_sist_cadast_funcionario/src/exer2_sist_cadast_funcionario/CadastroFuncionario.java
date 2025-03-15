package exer2_sist_cadast_funcionario;

import java.util.Scanner;

public class CadastroFuncionario {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//Recebendo os dados dos funcionários
		System.out.print("Digite o nome do funcionário: ");
		String nome = scanner.nextLine();
		System.out.print("Digite a idade do funcionário: ");
		int idade = scanner.nextInt();
		scanner.nextLine();//Consumir a quebra de linha
		System.out.print("Digite o cargo do funcionário: ");
		String cargo = scanner.nextLine();
		
		//condicional de idade e salário
		if(idade > 60) {
			System.out.println("Funcionário aposentado");
		}else {
			System.out.print("Digite o salário: ");
			double salario = scanner.nextDouble();
			
			if(salario > 5000) {
				System.out.println("Salário alto");
			}else {
				System.out.println("Salário baixo");
			}
		}
		scanner.close();
	}
}
