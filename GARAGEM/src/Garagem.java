import java.util.List; // Importa a classe List para trabalhar com listas
import java.util.ArrayList; // Importa a classe ArrayList para criar listas dinâmicas
// Classe garagem que representa uma garagem de veículos
//Essa classe é uma composição da classe veiculo, pois a garagem contém veículos
// A composição é um dos pilares da POO, que representa uma relação "tem um" entre classes
public class Garagem {
    private List<Veiculo> veiculos; // Lista de veículos na garagem

    // Método para adicionar um veículo à garagem
    public Garagem(){
        this.veiculos = new ArrayList<>(); // Inicializa a lista de veículos como um ArrayList vazio
    }

    // Método para adicionar um veículo à lista de veículos
    public void adicionarVeiculo(Veiculo veiculo) {
        veiculos.add(veiculo); // Adiciona o veículo à lista de veículos
    }

    // Método para listar todos os veículos na garagem
    public void listarVeiculos(){
        /* 
        // Exemplo de uso de for para percorrer uma coleção
        for (Tipo elemento : colecao) {
            // Código a ser executado para cada elemento
        }*/
        for (Veiculo v : veiculos){ // Percorre cada veículo na lista de veículos
            System.out.println(v.toString()); // Chama o método toString do veículo para imprimir suas informações
            // O método toString é sobrescrito na classe veiculo e nas classes filhas (carro e moto)
            System.out.println("------------------------------"); // Linha separadora entre os veículos
        }
    }
}
