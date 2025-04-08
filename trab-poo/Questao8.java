import java.util.ArrayList;
import java.util.List;

 class Pais {
    private String nome;
    private String capital;
    private int populacao;
    private List<Hospital2> hospitais;

    public Pais() {
        this.hospitais = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public int getPopulacao() {
        return populacao;
    }

    public void setPopulacao(int populacao) {
        this.populacao = populacao;
    }

    public void adicionarHospital(Hospital2 hospital) {
        hospitais.add(hospital);
    }

    public boolean removerHospital(String nomeHospital) {
        return hospitais.removeIf(h -> h.getNome().equalsIgnoreCase(nomeHospital));
    }

    public void mostrarHospitais() {
        if (hospitais.isEmpty()) {
            System.out.println("Nenhum hospital cadastrado.");
        } else {
            System.out.println("Hospitais em " + nome + ":");
            for (Hospital2 h : hospitais) {
                System.out.println(h);
            }
        }
    }

    public void calcularTaxaLeitos() {
        int totalLeitos = 0;
        for (Hospital2 h : hospitais) {
            totalLeitos += h.getLeitos();
        }

        if (populacao <= 0) {
            System.out.println("População inválida para cálculo.");
            return;
        }

        double taxa = totalLeitos / (populacao / 1000.0);
        System.out.printf("Taxa de leitos por mil habitantes: %.2f%n", taxa);
    }
}


class Hospital2 {
    private String nome;
    private int leitos;

    public Hospital2(String nome, int leitos) {
        this.nome = nome;
        this.leitos = leitos;
    }

    public String getNome() {
        return nome;
    }

    public int getLeitos() {
        return leitos;
    }

    @Override
    public String toString() {
        return "Hospital: " + nome + " | Leitos: " + leitos;
    }
}

public class Questao8 {
    public static void main(String[] args) {
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
    }
}

