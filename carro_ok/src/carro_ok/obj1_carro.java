package carro_ok;

public class obj1_carro {
		int ano;
		String cor;
		String modelo;
		
		public obj1_carro() {
			this.ano = 0;
			this.cor = "";
			this.modelo = "";
		}
		
		public obj1_carro(int ano, String cor, String modelo) {
			this.ano = ano;
			this.cor = cor;
			this.modelo = modelo;
		}
		
		public void setAno(int ano) {
			this.ano = ano;
		}
		
		public int getAno() {
			return ano;
		}
		
		public void setCor(String cor) {
			this.cor = cor;
		}
		
		public String getCor() {
			return cor;
		}
		
		public void setModelo(String modelo) {
			this.modelo = modelo;
		}
		
		public String getModelo() {
			return modelo;
		}

		@Override
		public String toString() {
			return "obj1_carro [ano=" + ano + ", cor=" + cor + ", modelo=" + modelo + "]";
		}
		
}
