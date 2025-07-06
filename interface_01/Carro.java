/*class CarroRodas {
    int numeroDeRodas = 4;  // Atributo de instância
}

public class Carro {
    public static void main(String[] args) {
    	CarroRodas c1 = new CarroRodas();
    	CarroRodas c2 = new CarroRodas();

        System.out.println(c1.numeroDeRodas);  // Imprime 4
        System.out.println(c2.numeroDeRodas);  // Imprime 4

        // Modificando o valor para cada instância
        c1.numeroDeRodas = 6;
        c2.numeroDeRodas = 3;

        System.out.println(c1.numeroDeRodas);  // Imprime 6
        System.out.println(c2.numeroDeRodas);  // Imprime 3
    }
}
*/
//Com atributo static

class CarroRodas {
    final int numeroDeRodas = 4;  // Atributo estático
}

public class Carro {
    public static void main(String[] args) {
    	CarroRodas c1 = new CarroRodas();
    	CarroRodas c2 = new CarroRodas();

        // Acessando diretamente através da classe
        System.out.println(CarroRodas.numeroDeRodas);  // Imprime 4

        // Alterando o valor do atributo estático
        c1.numeroDeRodas = 6;

        // Ambos os objetos refletem a mesma alteração
        System.out.println(c1.numeroDeRodas);  // Imprime 6
        System.out.println(c2.numeroDeRodas);  // Imprime 6
    }
}

