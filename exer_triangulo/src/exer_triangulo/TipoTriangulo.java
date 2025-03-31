package exer_triangulo;

import java.util.Scanner;

public class TipoTriangulo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe o primeiro lado do triãngulo: ");
		double lado1 = scanner.nextDouble();
		
		System.out.print("Informe a segundo lado do triângulo: ");
		double lado2 = scanner.nextDouble();
		
		System.out.print("Informe o terceiro lado do triângulo: ");
		double lado3 = scanner.nextDouble();
		
		if(lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
			if(lado1 == lado2 && lado2 == lado3) {
				System.out.println("O triângulo é Equilátero.");
			}else if(lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
				System.out.println("O triângulo é Isósceles.");
			}else {
				System.out.println("O triângulo é Escaleno.");
			}
			
			scanner.close();
		}
	}
}
