import java.util.ArrayList;
public class Cadastro {
	// Atributos do objeto
	private int codCliente;
	private String nomeCliente;

	// Atributos da classe
	static int codClienteStatic = 1;

	// Contrutores
	public Cadastro(String nomeCliente) {
		this.codCliente = codClienteStatic++;
		this.nomeCliente = nomeCliente;
	}
	
	public int getCodCliente() {
		return codCliente;
	}

	public void setCodCliente(int codCliente) {
		this.codCliente = codCliente;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public int getCodClienteStatic() {
		return codClienteStatic;
	}

	public boolean equals(final Cadastro outro)
	{
		if(this.nomeCliente == outro.nomeCliente)return true;
		else return false;
	}
	
	@Override
	public String toString() {
		return "Cadastro [Código=" + codCliente + ", Nome=" + nomeCliente + "]";
	}

}
