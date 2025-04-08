import java.util.ArrayList;
import java.util.List;

class UnidadeSaude {
    protected String nome;
    protected String endereco;
    protected int capacidade;

    public UnidadeSaude(String nome, String endereco, int capacidade) {
        this.nome = nome;
        this.endereco = endereco;
        this.capacidade = capacidade;

    }

    public void exibirInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + endereco);
        System.out.println("Capacidade: " + capacidade);
    }
}

class Hospital extends UnidadeSaude{
    private int leitosUTI;

    public Hospital(String nome, String endereco, int capacidade, int leitosUTI) {
        super(nome, endereco, capacidade);
        this.leitosUTI = leitosUTI;
    }

    public void alocarLeitosUTI(int quantidade) {
        leitosUTI += quantidade;
        System.out.println(quantidade + "leitos de UTI alocados.");
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Leitos de UTI: " + leitosUTI);
    }
}

class PostoSaude extends UnidadeSaude {
    public PostoSaude(String nome, String endereco, int capacidade) {
        super(nome, endereco, capacidade);
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Tipo: Posto de Saúde - Casos simples");
    }
}

class GestorSaude {
    private List<UnidadeSaude> unidades;

    public GestorSaude() {
        this.unidades = new ArrayList<>();
    }

    public void adicionarUnidade(UnidadeSaude unidade) {
        unidades.add(unidade);
        System.out.println("Unidade adicionada: " + unidade.nome);
    }

    public void exibirTodasUnidades() {
        for (UnidadeSaude u : unidades) {
            System.out.println("\n--- Unidade ---");
            u.exibirInfo();
        }
    }

    public void alocarLeitosParaHospitais(int quantidade) {
        for (UnidadeSaude u : unidades) {
            if (u instanceof Hospital) {
                ((Hospital) u).alocarLeitosUTI(quantidade);
            }
        }
    }
}
