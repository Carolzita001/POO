import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Paciente {
    private String nome;
    private String cpf;
    private int idade;
    private String tipoSanguineo;
    private List<String> historicoDoencas;

    public Paciente() {
        historicoDoencas = new ArrayList<>();
    }

    public Paciente(String nome, String cpf, int idade, String tipoSanguineo) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.tipoSanguineo = tipoSanguineo;
        historicoDoencas = new ArrayList<>();
    }

    public String getNome() { return nome; }
    public String getCpf() { return cpf; }
    public int getIdade() { return idade; }
    public String getTipoSanguineo() { return tipoSanguineo; }
    public List<String> getHistoricoDoencas() { return historicoDoencas; }

    public void adicionarDoenca(String doenca) {
        historicoDoencas.add(doenca);
    }

    @Override
    public String toString() {
        return nome + " (CPF: " + cpf + ")";
    }
}

class Consulta {
    private String data;
    private String hora;
    private Paciente paciente;
    private ProfissionalSaude2 profissional;

    public Consulta(String data, String hora, Paciente paciente, ProfissionalSaude2 profissional) {
        this.data = data;
        this.hora = hora;
        this.paciente = paciente;
        this.profissional = profissional;
    }

    @Override
    public String toString() {
        return "Consulta em " + data + " às " + hora +
                " com " + profissional + " para " + paciente;
    }
}

class Hospital3 {
    private List<Paciente> pacientes;
    private List<ProfissionalSaude2> profissionais;
    private List<Consulta> consultas;

    public Hospital3() {
        pacientes = new ArrayList<>();
        profissionais = new ArrayList<>();
        consultas = new ArrayList<>();
    }

    public void cadastrarPaciente(Paciente paciente) {
        pacientes.add(paciente);
    }

    public void removerPaciente(String cpf) {
        pacientes.removeIf(p -> p.getCpf().equals(cpf));
    }

    public void cadastrarProfissional(ProfissionalSaude2 profissional) {
        profissionais.add(profissional);
    }

    public void removerProfissional(String registro) {
        profissionais.removeIf(p -> p.getRegistro().equals(registro));
    }

    public void agendarConsulta(Consulta consulta) {
        consultas.add(consulta);
    }

    public void listarConsultas() {
        if (consultas.isEmpty()) {
            System.out.println("Nenhuma consulta agendada.");
        } else {
            for (Consulta c : consultas) {
                System.out.println(c);
            }
        }
    }

    public List<Paciente> getPacientes() {
        return pacientes;
    }

    public List<ProfissionalSaude2> getProfissionais() {
        return profissionais;
    }
}

abstract class ProfissionalSaude2 {
    private String nome;
    private String registro;

    public ProfissionalSaude2(String nome, String registro) {
        this.nome = nome;
        this.registro = registro;
    }

    public String getNome() { return nome; }
    public String getRegistro() { return registro; }

    public abstract String getEspecialidade();

    @Override
    public String toString() {
        return nome + " - " + getEspecialidade();
    }
}

class Medico2 extends ProfissionalSaude2 {
    public Medico2(String nome, String registro) {
        super(nome, registro);
    }

    @Override
    public String getEspecialidade() {
        return "Médico";
    }
}

public class Questao2e3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Hospital3 hospital = new Hospital3();

        int opcao;

        do {
            System.out.println("\n===== MENU HOSPITAL =====");
            System.out.println("[ 1 ] Cadastrar paciente");
            System.out.println("[ 2 ] Cadastrar profissional (médico)");
            System.out.println("[ 3 ] Agendar consulta");
            System.out.println("[ 4 ] Listar consultas");
            System.out.println("[ 0 ] Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine(); // limpar buffer

            switch (opcao) {
                case 1:
                    System.out.print("Nome do paciente: ");
                    String nome = sc.nextLine();
                    System.out.print("CPF: ");
                    String cpf = sc.nextLine();
                    System.out.print("Idade: ");
                    int idade = sc.nextInt(); sc.nextLine();
                    System.out.print("Tipo sanguíneo: ");
                    String tipoSang = sc.nextLine();
                    Paciente paciente = new Paciente(nome, cpf, idade, tipoSang);

                    System.out.print("Deseja adicionar doenças ao histórico? (s/n): ");
                    if (sc.nextLine().equalsIgnoreCase("s")) {
                        while (true) {
                            System.out.print("Digite uma doença (ou 'fim' para parar): ");
                            String doenca = sc.nextLine();
                            if (doenca.equalsIgnoreCase("fim")) break;
                            paciente.adicionarDoenca(doenca);
                        }
                    }

                    hospital.cadastrarPaciente(paciente);
                    System.out.println("Paciente cadastrado com sucesso!");
                    break;

                case 2:
                    System.out.print("Nome do médico: ");
                    String nomeMed = sc.nextLine();
                    System.out.print("Registro (CRM): ");
                    String crm = sc.nextLine();
                    Medico2 medico = new Medico2(nomeMed, crm);
                    hospital.cadastrarProfissional(medico);
                    System.out.println("Médico cadastrado com sucesso!");
                    break;

                case 3:
                    if (hospital.getPacientes().isEmpty() || hospital.getProfissionais().isEmpty()) {
                        System.out.println("É necessário ter pelo menos 1 paciente e 1 profissional cadastrados.");
                        break;
                    }

                    System.out.println("PACIENTES DISPONÍVEIS:");
                    int i = 1;
                    for (Paciente p : hospital.getPacientes()) {
                        System.out.println(i++ + ". " + p);
                    }
                    System.out.print("Escolha o número do paciente: ");
                    int idxPac = sc.nextInt(); sc.nextLine();
                    if (idxPac < 1 || idxPac > hospital.getPacientes().size()) {
                        System.out.println("Paciente inválido.");
                        break;
                    }
                    Paciente pacSelecionado = hospital.getPacientes().get(idxPac - 1);

                    System.out.println("PROFISSIONAIS DISPONÍVEIS:");
                    i = 1;
                    for (ProfissionalSaude2 prof : hospital.getProfissionais()) {
                        System.out.println(i++ + ". " + prof);
                    }
                    System.out.print("Escolha o número do profissional: ");
                    int idxProf = sc.nextInt(); sc.nextLine();
                    if (idxProf < 1 || idxProf > hospital.getProfissionais().size()) {
                        System.out.println("Profissional inválido.");
                        break;
                    }
                    ProfissionalSaude2 profSelecionado = hospital.getProfissionais().get(idxProf - 1);

                    System.out.print("Data da consulta (dd/mm/aaaa): ");
                    String data = sc.nextLine();
                    System.out.print("Hora da consulta (hh:mm): ");
                    String hora = sc.nextLine();

                    Consulta consulta = new Consulta(data, hora, pacSelecionado, profSelecionado);
                    hospital.agendarConsulta(consulta);
                    System.out.println("Consulta agendada com sucesso!");
                    break;

                case 4:
                    hospital.listarConsultas();
                    break;

                case 0:
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);

        sc.close();
    }
}
