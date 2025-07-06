import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;

public class Interface extends JFrame implements ActionListener{
    private JPanel pnBotoes, pnCardapio;
    private JLabel lbcardapio;
    private JButton btver, btalterar;
    private Semana semana; //Objeto que representa o cardápio semanal

    //Construtor da Janela Principal
    public Interface() {
        semana = new Semana(); //cria os cardápios vazios

        setTitle("Restaurante Universitário");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        Container tela = getContentPane();
        tela.setLayout(new BorderLayout());

        //inicializa os painéis
        pnBotoes = new JPanel();
        pnCardapio = new JPanel();

        //inicializa os componentes
        lbcardapio = new JLabel("Cardápio Semanal!");
        btver = new JButton("Cardápio");
        btalterar = new JButton("Alterar");

        btver.addActionListener(this);
        btalterar.addActionListener(this);

        pnBotoes.setLayout(new GridLayout(1, 3));
        pnBotoes.add(lbcardapio);
        pnBotoes.add(btver);
        pnBotoes.add(btalterar);

        pnCardapio.setBackground(Color.LIGHT_GRAY);
        pnCardapio.setLayout(new GridLayout(6, 1));

        tela.add(pnBotoes, BorderLayout.NORTH);
        tela.add(pnCardapio, BorderLayout.CENTER);

        setVisible(true); //Deixa a janela visível
    }

    //Metodo para exibir o cardápio
    private void exibirCardapio() {
        pnCardapio.removeAll(); //Limpa o painel

        String[] dias = {"Segunda", "Terça", "Quarta", "Quinta", "Sexta"};
        Cardápio[] cardapios = {
                semana.getSegunda(), semana.getTerca(), semana.getQuarta(),
                semana.getQuinta(), semana.getSexta()
        };

        for (int i = 0; i < dias.length; i++) {
            Cardápio c = cardapios[i];
            String texto = String.format(
                    "<html><b>%s:</b> Arroz: %s " + "Feijão: %s, Proteína: %s, Salada: %s, Fruta: %s, Bebida: %s</html>",
                    dias[i], c.getArroz(), c.getFeijão(), c.getProteína(),
                    c.getSalada(), c.getFruta(), c.getBebida()
            );
            pnCardapio.add(new JLabel(texto));
        }

        pnCardapio.revalidate();
        pnCardapio.repaint();
    }

    //Metodo para abrir e preeecher o dia escolhido
    private void abrirFormularioEdicao() {
        String[] dias = {"Segunda", "Terça", "Quarta", "Quinta", "Sexta"};

        //Escolher o dia para alterar
        int escolha = JOptionPane.showOptionDialog(
                this, "Escolha o dia para alterar:", "Selecionar Dia",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                null, dias, dias[0]
        );

        if (escolha < 0) return;

        Cardápio c = semana.obterCardapio(escolha + 1);

        JTextField tfArroz = new JTextField(c.getArroz(), 10);
        JTextField tfFeijao = new JTextField(c.getFeijão(), 10);
        JTextField tfProteina = new JTextField(c.getProteína(), 10);
        JTextField tfSalada = new JTextField(c.getSalada(), 10);
        JTextField tfFruta = new JTextField(c.getFruta(), 10);
        JTextField tfBebida = new JTextField(c.getBebida(), 10);

        JPanel panel = new JPanel(new GridLayout(0, 2));
        panel.add(new JLabel("Arroz:")); panel.add(tfArroz);
        panel.add(new JLabel("Feijão:")); panel.add(tfFeijao);
        panel.add(new JLabel("Proteína:")); panel.add(tfProteina);
        panel.add(new JLabel("Salada:")); panel.add(tfSalada);
        panel.add(new JLabel("Fruta:")); panel.add(tfFruta);
        panel.add(new JLabel("Bebida:")); panel.add(tfBebida);

        int result = JOptionPane.showConfirmDialog(this, panel, "Editar Cardápio - " + dias[escolha],
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

        if (result == JOptionPane.OK_OPTION) {
            c.setArroz(tfArroz.getText());
            c.setFeijão(tfFeijao.getText());
            c.setProteína(tfProteina.getText());
            c.setSalada(tfSalada.getText());
            c.setFruta(tfFruta.getText());
            c.setBebida(tfBebida.getText());
            exibirCardapio();
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btver) {
            exibirCardapio();
        } else if (e.getSource() == btalterar) {
            abrirFormularioEdicao();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Interface::new);
    }
}
