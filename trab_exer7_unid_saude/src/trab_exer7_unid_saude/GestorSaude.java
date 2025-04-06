package trab_exer7_unid_saude;
import java.util.ArrayList;
import java.util.List;

public class GestorSaude {
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
