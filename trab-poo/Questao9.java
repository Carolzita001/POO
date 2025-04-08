import java.util.Scanner;

class PlanoDeSaude {
    private String operadora;
    private String cobertura;
    private float mensalidade;

    public void preencherDados(Scanner scanner) {

        System.out.print("Nome da Operadora: ");
        operadora = scanner.nextLine();

        System.out.print("Tipo de Cobertura (Básica ou Completa): ");
        cobertura = scanner.nextLine();

        System.out.print("Valor da Mensalidade: R$ ");
        mensalidade = scanner.nextFloat();
    }

    public void calcularReajuste(int idade) {
        float aumento = 0;

        if (idade < 18) {
            aumento = mensalidade * 0.05f;
        } else if (idade <= 40) {
            aumento = mensalidade * 0.10f;
        } else {
            aumento = mensalidade * 0.20f;
        }

        float novaMensalidade = mensalidade + aumento;

        System.out.println("Idade do paciente: " + idade + " anos");
        System.out.println("Mensalidade reajustada: R$ " + novaMensalidade);
    }

    public void exibirDados() {
        System.out.println("-Dados do Plano de Saúde-");
        System.out.println("Operadora: " + operadora);
        System.out.println("Cobertura: " + cobertura);
        System.out.println("Mensalidade Atual: R$ " + mensalidade);
    }
}

public class Questao9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        PlanoDeSaude plano = new PlanoDeSaude();
        plano.preencherDados(scanner);

        System.out.print("Digite a idade do paciente: ");
        int idade = scanner.nextInt();

        plano.exibirDados();
        plano.calcularReajuste(idade);

        scanner.close();
    }
}