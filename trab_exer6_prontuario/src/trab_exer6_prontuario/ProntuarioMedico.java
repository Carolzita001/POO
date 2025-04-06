package trab_exer6_prontuario;
//As importações a seguir são para criar e usar listas dinâmicas em java
import java.util.ArrayList;//implementação concreta da interface "List", baseada em um array redimencional
import java.util.List;//é uma interface que representa uma lista.

public class ProntuarioMedico {
	private List<String> consultas;
	private List<String> exames;
	private List<String> alergias;
	
	//O construtor é chamado quando se cria um novo prontuario (cria listas vazias)
	public ProntuarioMedico(){
		this.consultas = new ArrayList<>();
		this.exames = new ArrayList<>();
		this.alergias = new ArrayList<>();
	}
	
	public void adicionarConsulta(String consulta) {
		consultas.add(consulta);
	}
	
	public void adicionarExame(String exame) {
		exames.add(exame);
	}
	
	public void adicionarAlergia(String alergia) {
		alergias.add(alergia);
	}
	
	public boolean removerConsulta(String consulta) {
		return consultas.remove(consulta);
	}
	
	public boolean removeExame(String exame) {
		return exames.remove(exame);
	}
	
	public boolean removeAlergia(String alergia) {
		return alergias.remove(alergia);
	}
	
	public void mostrarConsultas() {
		System.out.println("Consultas: "+ consultas);
	}
	
	public void mostrarExames() {
		System.out.println("Exames: "+ exames);
	}
	
	public void mostrarAlergias() {
		System.out.println("Alergias: "+ alergias);
	}
	
	public static void main(String[] args) {
		//A seguir se cria um objeto prontuario
		ProntuarioMedico prontuario = new ProntuarioMedico();
		
		prontuario.adicionarConsulta("Consulta com clínico - 05/04/2025");
		prontuario.adicionarExame("Raio_X do tórax - 02/04/2025");
		prontuario.adicionarAlergia("Alergia a frutos do mar");
		
		prontuario.mostrarConsultas();
		prontuario.mostrarExames();
		prontuario.mostrarAlergias();
	}
}
