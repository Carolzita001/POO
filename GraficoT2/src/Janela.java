import javax.swing.JFrame;

public class Janela extends JFrame{
	Janela(){
		this.add(new Desenho());
		
		//perde a borda da janela
		this.setUndecorated(true);
		
		//this.setSize(80,80);
		
		this.setSize(80,30);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

}
