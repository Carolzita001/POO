package trab_exer7_unid_saude;

public class PostoSaude extends UnidadeSaude {
    public PostoSaude(String nome, String endereco, int capacidade) {
        super(nome, endereco, capacidade);
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Tipo: Posto de Saúde - Casos simples");
    }
}

