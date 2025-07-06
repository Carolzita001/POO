import javax.swing.*;
import java.awt.*;
import java.awt.FlowLayout;

public class JanelaContador extends JFrame {
    public JanelaContador(){
        Contador cont = new Contador();
        JLabel label1 = new JLabel("Valor: 0");
        JLabel label2 = new JLabel("Contagem atual: 0");

        Observador 01 = novoValor -> label1.setText("Valor: "+ novoValor);
        Observador 02 = novoValor -> label2.setText("Contagem Atual: "+ novoValor);

        cont.adicionaObservador(o1);
        cont.adicionaObservador(o2);

        JButton botao = new JButton("Incrementar");
        botao.addActionListener(e -> cont.incrementar());

        setLayout(new FlowLayout());
        add(label1);
        add(label2);
        add(botao);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,120);
        setVisible(true);
    }
    public static void main(String[] args){
        new JanelaContador();
    }
}
