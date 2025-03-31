package exer_vetor;

import java.util.Scanner;

public class SomaMediaVetor {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Quantos números deseja inserir? ");
		int quantidade = scanner.nextInt();
		
		double[] numeros = new double[quantidade];
		double soma = 0;
		
		for(int i = 0; i < quantidade; i++) {
			System.out.print("Digite o número " + (i + 1) + ": ");
			numeros[i] = scanner.nextDouble();
			soma += numeros[i];
		}
		
		double media = soma / quantidade;
		
		System.out.println("Soma dos números: " + soma);
		System.out.println("Média dos números: " + media);
		
		scanner.close();
	}
}
