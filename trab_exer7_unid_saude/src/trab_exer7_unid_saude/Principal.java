package trab_exer7_unid_saude;

public class Principal {
	public static void main(String[] args) {
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
    }
}
