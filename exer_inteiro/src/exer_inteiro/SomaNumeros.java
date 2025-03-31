package exer_inteiro;

import java.util.Scanner;

public class SomaNumeros {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numero;
		do {
			System.out.print("Digite um número inteiro positivo entre 1 e 10: ");
			numero = scanner.nextInt();
		}while(numero<1||numero>10);
		
		int soma = 0;
		for(int i = 1; i <= numero; i++) {
			soma += i;
		}
		
		System.out.println("A soma de todos os números de 1 até "+ numero +" é: "+soma);
		scanner.close();
		
	}
}
