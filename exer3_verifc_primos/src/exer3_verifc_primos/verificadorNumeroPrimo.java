package exer3_verifc_primos;
import java.util.Scanner;

public class verificadorNumeroPrimo {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Recebendo o número
        System.out.print("Insira um número inteiro: ");
        int numero = scanner.nextInt();

        boolean ehPrimo = true;

        // Números menores ou iguais a 1 não são primos
        if (numero <= 1) {
            ehPrimo = false;
        } else {
            // Verifica divisores de 2 até a raiz quadrada do número
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    ehPrimo = false;
                    break; // Interrompe o laço ao encontrar um divisor
                }
            }
        }

        // Exibe o resultado
        if (ehPrimo) {
            System.out.println("O número " + numero + " é primo.");
        } else {
            System.out.println("O número " + numero + " não é primo.");
        }

        scanner.close();
    }
}