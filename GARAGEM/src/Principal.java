import java.util.Scanner;
// Classe Main para executar o programa
public class Principal {
    // O método main é o ponto de entrada do programa
    // Ele é chamado quando o programa é executado
    // O método main deve ser declarado como public e static
    // O modificador public permite que o método seja acessado de fora da classe
    // O modificador static permite que o método seja chamado sem criar uma instância da classe
    // O parâmetro String[] args permite passar argumentos para o programa na linha de comando
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner para ler entradas do usuário
        Garagem g = new Garagem(); // Cria uma nova garagem

        // Adiciona veículos à garagem
        g.adicionarVeiculo(new Carro("Fiat", "Palio", 2010, 4, "Preto", "Gasolina"));
        g.adicionarVeiculo(new Carro("Chevrolet", "Onix", 2020, 4, "Branco", "Etanol"));
        g.adicionarVeiculo(new Moto("Honda", "CB500F", 2018, "Naked", "500cc", "Vermelha"));
        g.adicionarVeiculo(new Moto("Yamaha", "MT-03", 2021, "Naked", "300cc", "Azul"));

        // Lista os veículos na garagem
        g.listarVeiculos();

        // Fecha o scanner para evitar vazamento de recursos
        scanner.close(); // O método close() é chamado para liberar os recursos associados ao objeto Scanner
        // Isso é importante para evitar vazamentos de memória e garantir que o programa seja eficiente
        // O scanner.close() deve ser chamado após o uso do objeto Scanner, geralmente no final do programa
        // ou quando não for mais necessário
    }
}