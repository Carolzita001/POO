package exer_animal;

public class Animal {
	//Atributos
		private String som;
		
		//Construtores
		Animal(){
			this("");
		}
		Animal(String som){
			this.som = som;
		}
		
		//Métodos
		public void setSom(String som) {
			this.som = som;
		}
		
		public String getSom() {
			return this.som;
		}
		
		public String verificaSom() {
			if(som != "") {
				return som; 
			}else {
				return "não teve som";
			}
		}
		@Override
		public String toString() {
			return "Animal: [ som: " + som + "verificaSom(): " + verificaSom()+" ]";
		}
}
