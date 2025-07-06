import javax.swing.*;

public class ComboTest {
    JFrame frm;
    JLabel lab1;
    JButton BJ;
    JPanel panel;
    JComboBox<String> box;

    public void planWindow(){
        frm = new JFrame("Combo Test");
        panel = new JPanel(null);
        frm.add(panel);

        lab1 = new JLabel("Choose your Favorite Subject.");
        lab1.setHorizontalAlignment(JLabel.CENTER);
        lab1.setSize(400,100);

        BJ = new JButton("choose");

        lab1.setBounds(48,28,200,30);
        BJ.setBounds(200,80,100,30);

        String subjects[]={"Math","Science","English","History","Genetics"};
        box = new JComboBox<>(subjects);
        box.setBounds(50,80,90,30);

        BJ.addActionListener(this);

        panel.add(lab1);
        panel.add(BJ);
        panel.add(box);

        frm.setSize(400,300);
        frm.setLo

    }
}
