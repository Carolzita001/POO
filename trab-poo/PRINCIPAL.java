import java.util.Scanner;

public class PRINCIPAL {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int opcGeral = 0;

        while (opcGeral != 10) {
            System.out.println("[ 1 ] Questão1");
            System.out.println("[ 2 ] Questão2");
            System.out.println("[ 4 ] Questão4");
            System.out.println("[ 5 ] Questão5");
            System.out.println("[ 6 ] Questão6");
            System.out.println("[ 7 ] Questão7");
            System.out.println("[ 8 ] Questão8");
            System.out.println("[ 9 ] Questão9");
            System.out.println("[ 10 ] Sair do Programa");
            System.out.print("Opção Desejada: ");
            opcGeral = scan.nextInt();
            System.out.println();

            switch (opcGeral) {
                case 1:
                    Scanner scanner = new Scanner(System.in);
                    int escolha = 0;

                    while (escolha != 4) {
                        System.out.println("[ 1 ] Preencher Médico");
                        System.out.println("[ 2 ] Preencher Enfermeiro");
                        System.out.println("[ 3 ] Preencher Fisioterapeuta");
                        System.out.println("[ 4 ] Fechar Programa");
                        System.out.print("Opção desejada: ");
                        escolha = scanner.nextInt();
                        System.out.println();

                        switch (escolha) {
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
                    break;
                case 2:
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
                    System.out.println();
                    break;
                case 4:
                    String paciente;
                    int opção = 0;
                    Scanner scan1 = new Scanner(System.in);

                    ReceitaMedica a1 = new ReceitaMedica("diclofenaco", "anti-inflatório", "lab1", 35, "Arthur");
                    ReceitaMedica a2 = new ReceitaMedica("dipirona", "analgésico", "lab2", 15, "Pedro");
                    ReceitaMedica a3 = new ReceitaMedica("atenolol", "betabloqueador", "lab3", 40, "Juliana");
                    ReceitaMedica a4 = new ReceitaMedica("zolpidem", "imidazopiridinas", "lab4", 90, "Andressa");

                    System.out.print("Nome do Paciente: ");
                    paciente = scan1.nextLine();
                    System.out.println();

                    while (opção != 5) {

                        System.out.println(paciente + ", qual medicamento você deseja?");
                        System.out.println("[ 1 ] Diclofenaco");
                        System.out.println("[ 2 ] Dipirona");
                        System.out.println("[ 3 ] Atenolol");
                        System.out.println("[ 4 ] Zolpidem");
                        System.out.println("[ 5 ] Sair do Programa");
                        System.out.println("Opção desejada: ");
                        opção = scan1.nextInt();

                        switch (opção) {
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
                    break;
                case 5:
                    Data d1 = new Data();
                    d1.TesteData();
                    System.out.println(d1.toString());
                    System.out.println();
                    break;
                case 6:
                    //A seguir se cria um objeto prontuario
                    ProntuarioMedico prontuario = new ProntuarioMedico();

                    prontuario.adicionarConsulta("Consulta com clínico - 05/04/2025");
                    prontuario.adicionarExame("Raio_X do tórax - 02/04/2025");
                    prontuario.adicionarAlergia("Alergia a frutos do mar");

                    prontuario.mostrarConsultas();
                    prontuario.mostrarExames();
                    prontuario.mostrarAlergias();
                    System.out.println();
                    break;
                case 7:
                    // Criando o gestor
                    GestorSaude gestor = new GestorSaude();

                    // Criando hospitais e postos de saúde
                    Hospital hospital1 = new Hospital("Hospital Central", "Rua A, 123", 150, 30);
                    PostoSaude posto1 = new PostoSaude("Posto Saúde Bairro B", "Av. B, 456", 80);
                    // Adicionando ao gestor
                    gestor.adicionarUnidade(hospital1);
                    gestor.adicionarUnidade(posto1);

                    // Listando todas as unidades
                    System.out.println("Unidades de Saúde cadastradas:");
                    gestor.exibirTodasUnidades();
                    System.out.println();
                    break;
                case 8:
                    Pais brasil = new Pais();
                    brasil.setNome("Brasil");
                    brasil.setCapital("Brasília");
                    brasil.setPopulacao(210000000); // 210 milhões

                    brasil.adicionarHospital(new Hospital2("Hospital das Clínicas", 1000));
                    brasil.adicionarHospital(new Hospital2("Albert Einstein", 500));

                    brasil.mostrarHospitais();
                    brasil.calcularTaxaLeitos();

                    System.out.println("Removendo hospital...");
                    brasil.removerHospital("Albert Einstein");

                    brasil.mostrarHospitais();
                    brasil.calcularTaxaLeitos();
                    System.out.println();
                    break;
                case 9:
                    Scanner scanner1 = new Scanner(System.in);

                    PlanoDeSaude plano = new PlanoDeSaude();
                    plano.preencherDados(scanner1);

                    System.out.print("Digite a idade do paciente: ");
                    int idade = scanner1.nextInt();

                    plano.exibirDados();
                    plano.calcularReajuste(idade);
                    System.out.println();
                    break;
            }
        }
    }
}