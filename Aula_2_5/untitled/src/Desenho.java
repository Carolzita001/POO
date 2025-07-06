import javax.swing.*;
import java.awt.*;
import java.util.Calendar;

public class Desenho extends JComponent implements Runnable{
    private Calendar hora;
    Desenho(){
        new Thread(this).start();
    }

    public void paint(Graphics g){
        //g.drawString("00.00.00", 5, 20);
        g.setFont(new Font("Arial", Font.BOLD, 16));
        g.drawString(horas(), 5, 20);

    }

    public String horas(){
        hora = Calendar.getInstance();
        int hh = hora.get(Calendar.HOUR_OF_DAY);
        int mm = hora.get(Calendar.MINUTE);
        int ss = hora.get(Calendar.SECOND);

        return ((hh < 10) ? "0" : "") + hh + ":" +
                ((mm < 10) ? "0" : "") + mm + ":" +
                ((ss < 10) ? "0" : "") + ss;
    }
    @Override
    public void run(){
        while(true){
            try{
                thread.sleep(1000);
                repaint();
            }catch(InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
