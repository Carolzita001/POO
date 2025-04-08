import java.util.Scanner;

class Medicamento{
    private String nome;
    private String prinAtivo;
    private String laboratorio;
    private float valor;

    Medicamento(){
        this("", "", "", 0);
    }
    Medicamento(String nome, String prinAtivo, String laboratorio, float valor){
        this.nome = nome;
        this.prinAtivo = prinAtivo;
        this.laboratorio = laboratorio;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPrinAtivo() {
        return prinAtivo;
    }
    public void setPrinAtivo(String prinAtivo) {
        this.prinAtivo = prinAtivo;
    }

    public String getLaboratorio() {
        return laboratorio;
    }
    public void setLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
    }

    public float getValor() {
        return valor;
    }
    public void setValor(float valor) {
        this.valor = valor;
    }
    @Override
    public String toString(){
        return "[Medicamento: " + nome + ", Princípio Ativo: " + prinAtivo + ", Laboratório: " + laboratorio + ", Valor: R$ " + valor + "]";
    }

}

class ReceitaMedica extends Medicamento{
    private String medico;

    ReceitaMedica(){
        this("", "", "", 0, "");
    }

    ReceitaMedica(String nome, String prinAtivo, String laboratorio, float valor, String medico){
        super(nome, prinAtivo, laboratorio, valor);
        this.medico = medico;
    }

    public String getMedico() {
        return medico;
    }
    public void setMedico(String medico) {
        this.medico = medico;
    }

    @Override
    public String toString() {
        return "Dr. " + medico + ",está preparando sua prescrição \n" +
                "Prescrição [" + super.toString() + "]";
    }
}

public class Questao4 {
    public static void main(String args[]){
        String paciente;
        int opção = 0;
        Scanner scan = new Scanner(System.in);

        ReceitaMedica a1 = new ReceitaMedica("diclofenaco", "anti-inflatório", "lab1", 35, "Arthur");
        ReceitaMedica a2 = new ReceitaMedica("dipirona", "analgésico", "lab2", 15, "Pedro");
        ReceitaMedica a3 = new ReceitaMedica("atenolol", "betabloqueador", "lab3", 40, "Juliana");
        ReceitaMedica a4= new ReceitaMedica("zolpidem", "imidazopiridinas", "lab4", 90, "Andressa");

        System.out.print("Nome do Paciente: ");
        paciente = scan.nextLine();
        System.out.println();

        while (opção != 5) {

            System.out.println(paciente + ", qual medicamento você deseja?");
            System.out.println("[ 1 ] Diclofenaco");
            System.out.println("[ 2 ] Dipirona");
            System.out.println("[ 3 ] Atenolol");
            System.out.println("[ 4 ] Zolpidem");
            System.out.println("[ 5 ] Sair do Programa");
            System.out.println("Opção desejada: ");
            opção = scan.nextInt();

            switch (opção){
                case 1:
                    System.out.println(a1.toString());
                    System.out.println();
                    break;
                case 2:
                    System.out.println(a2.toString());
                    System.out.println();
                    break;
                case 3:
                    System.out.println(a3.toString());
                    System.out.println();
                    break;
                case 4:
                    System.out.println(a4.toString());
                    System.out.println();
                    break;
                case 5:
                    System.out.println("Saindo do Programa!");
                    System.out.println();
                    break;
                default:
                    System.out.println("Opção Inválida!");
                    System.out.println();
                    break;
            }
        }
        scan.close();
    }
}
