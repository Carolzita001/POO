package exer_maior_menor_vet;

import java.util.Scanner;

public class MaiorMenorVetor {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Quantos números deseja inserir? ");
		int quantidade = scanner.nextInt();
		
		double[] numeros = new double[quantidade];
		
		System.out.println("Digite os números:");
		for(int i = 0; i < quantidade; i++) {
			System.out.print("Número " + (i + 1) + ": ");
			numeros[i] = scanner.nextDouble();
		}
		
		double maior = numeros[0];
		double menor = numeros[0];
		
		for(int i = 1; i < quantidade; i++) {
			if(numeros[i] > maior) {
				maior = numeros[i];
			}
			if(numeros[i] < menor){
				menor =numeros[i];
			}
		}
		
		System.out.println("Maior número: " + maior);
		System.out.println("Menor número: " + menor);
		
		scanner.close();
	}
}
