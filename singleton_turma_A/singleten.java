import java.text.SimpleDateFormat;
import java.util.Date;
public class singleten{
    private String dataBase;
    private String porta;
    private String status;
    private String momento;
    private static singleten instance = null;

    private singleten(String dataBase, String porta, String status, String momento){
        this.dataBase = dataBase;
        this.porta = porta;
        this.status = status;
        this.momento = momento;
    }

    public void finalize(){
        instance = null;
    }
    //onde esta sendo instanciado
    public static singleten getInstance(){
        if (instance == null) instance=new singleten("BD-clientes", "3301", "conectado",
                new SimpleDateFormat("HH:mm:ss").format(new Date()));
        return instance;
    }

    public String getDataBase() {
        return dataBase;
    }

    public static void setInstance(singleten instance) {
        singleten.instance = instance;
    }

    public String getMomento() {
        return momento;
    }

    public void setMomento(String momento) {
        this.momento = momento;
    }

    public void setDataBase(String dataBase) {
        this.dataBase = dataBase;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPorta() {
        return porta;
    }

    public void setPorta(String porta) {
        this.porta = porta;
    }

    @Override
    public String toString() {
        return "singleten{" +
                "dataBase='" + dataBase + '\'' +
                ", porta='" + porta + '\'' +
                ", status='" + status + '\'' +
                ", momento='" + momento + '\'' +
                '}';
    }
}
