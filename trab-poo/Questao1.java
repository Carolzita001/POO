import java.util.Scanner;

class ProfissionalSaude{

    protected String nome;
    protected String registroProfissional;
    protected String especialidade;
    protected Float salario;

    public void Preencher(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nome: ");
        this.nome = scanner.nextLine();
        System.out.print("Registro Profissional: ");
        this.registroProfissional = scanner.nextLine();
        System.out.print("Especialidade: ");
        this.especialidade = scanner.nextLine();
        System.out.print("Salário: R$ ");
        this.salario = scanner.nextFloat();
        System.out.println();
    }

    public void ExibirDados(){
        System.out.println("\tInformações do Profissional");
        System.out.println("Nome: " + nome);
        System.out.println("Registro Profissional: " + registroProfissional);
        System.out.println("Especialidade: " + especialidade);
        System.out.println("Salário: R$ " + salario);
        System.out.println();
    }

}

class Medico extends ProfissionalSaude{
    public void Medico(){
        System.out.println("O Dr. " + nome + " está emitindo sua Prescrição Médica!");
        System.out.println();
    }
}

class Enfermeiro extends ProfissionalSaude{
    public void Enfermeiro(){
        System.out.println("O Enfermeiro " + nome + " irá realizar seu procedimento!");
        System.out.println();
    }
}

class Fisioterapeuta extends ProfissionalSaude{
    public void Fisioterapeuta(){
        System.out.println("O Fisioterapeuta " + nome + " irá realizar seu procedimento!");
        System.out.println();
    }
}

public class Questao1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int escolha = 0;

        while (escolha != 4){
            System.out.println("[ 1 ] Preencher Médico");
            System.out.println("[ 2 ] Preencher Enfermeiro");
            System.out.println("[ 3 ] Preencher Fisioterapeuta");
            System.out.println("[ 4 ] Fechar Programa");
            System.out.print("Opção desejada: ");
            escolha = scanner.nextInt();
            System.out.println();

            switch (escolha){
                case 1:
                    Medico medico = new Medico();
                    medico.Preencher();
                    medico.ExibirDados();
                    medico.Medico();
                    System.out.println();
                    break;
                case 2:
                    Enfermeiro enfermeiro = new Enfermeiro();
                    enfermeiro.Preencher();
                    enfermeiro.ExibirDados();
                    enfermeiro.Enfermeiro();
                    System.out.println();
                    break;
                case 3:
                    Fisioterapeuta fisioterapeuta = new Fisioterapeuta();
                    fisioterapeuta.Preencher();
                    fisioterapeuta.ExibirDados();
                    fisioterapeuta.Fisioterapeuta();
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Programa Finalizado!");
                    System.out.println();
                    break;
                default:
                    System.out.println("Opção Inválida!");
                    System.out.println();
                    break;
            }
        }
    }
}