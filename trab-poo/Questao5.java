import java.util.Scanner;

class Data{
    private int dia;
    private int mes;
    private int ano;

    Data(){
        this(0, 0, 0);
    }
    Data(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public int getDia() {
        return dia;
    }
    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }
    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }


    public void TesteData(){
        Scanner scan = new Scanner(System.in);
        while (dia < 1 || dia > 30){
            System.out.print("Informe o dia: (1 - 30) ");
            dia = scan.nextInt();
        }
        while (mes < 1 || mes > 12){
            System.out.print("Informe o mês: (1 - 12) ");
            mes = scan.nextInt();
        }
        while (ano < 2000 || ano > 2025){
            System.out.print("Informe o ano: (2000 - 2025) ");
            ano = scan.nextInt();
        }
    }

    @Override
    public String toString() {
        return "DATA [" + dia + "/" + mes + "/" + ano + "]";
    }
}

public class Questao5{
    public static void main(String args[]){
        Data d1 = new Data();
        d1.TesteData();
        System.out.println(d1.toString());
    }
}