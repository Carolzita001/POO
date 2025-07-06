import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Interface extends JFrame{
    private JPanel pnDados, pnBotoes;
    private JLabel lbCodigo, lbNome;
    private JTextField tfCodigo, tfNome;
    private JButton btCriar, btMostrar, btSair;
    private Container tela;
    private Cadastro cliente;

    Interface(){
        //Container
        tela = this.getContentPane();
        tela.setLayout(new BorderLayout());
        //configurar paineis
        pnDados = new JPanel();
        pnBotoes = new JPanel();
        tela.add(pnDados,BorderLayout.NORTH);
        tela.add(pnBotoes,BorderLayout.SOUTH);
        pnDados.setBackground(Color.cyan);
        pnBotoes.setBackground(Color.cyan);

        //Configurar os Componentes
        lbCodigo = new JLabel("Código do Cliente");
        lbNome = new JLabel("Nome do Cliente");
        tfCodigo = new JTextField(10);
        tfNome = new JTextField(30);
        btCriar = new JButton("Criar");
        btMostrar = new JButton("Mostrar");
        btSair = new JButton("Sair");

        tfCodigo.setEditable(false);
        tfCodigo.setBackground(Color.pink);

        //Adicionar componentes
        pnDados.setLayout(new GridLayout(2,2));
        pnDados.add(lbCodigo);pnDados.add(lbNome);
        pnDados.add(tfCodigo);pnDados.add(tfNome);
        pnBotoes.setLayout(new GridLayout(1,3));
        pnBotoes.add(btCriar);pnBotoes.add(btMostrar);pnBotoes.add(btSair);

        btCriar.addActionListener((ActionListener) this);
        btMostrar.addActionListener((ActionListener) this);
        btSair.addActionListener((ActionListener) this);

        super.setTitle("Cadastro Clientes");
        super.setSize(400,100);
        super.setLocationRelativeTo(null);
        super.setDefaultCloseOperation(EXIT_ON_CLOSE);
        super.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == btCriar){
            cliente = new Cadastro(tfNome.getText());
            tfCodigo.setText(Integer.toString(cliente.getCodigo()));
            JOptionPane.showMessageDialog(null, "Cadastro Efetuado com sucesso!");
            tfCodigo.setText("");
            tfNome.setText("");
        }
        if(e.getSource() == btMostrar){
            JOptionPane.showMessageDialog(null, cliente);
        }
        if(e.getSource() == btSair){
            System.exit(0);
        }
    }
}
