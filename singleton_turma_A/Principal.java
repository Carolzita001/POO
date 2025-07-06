public class Principal {
    public static void main(String[] args){
        singleten s1 = singleten.getInstance();
        System.out.println(s1);
        singleten s2 = singleten.getInstance();
        System.out.println(s2);
        s1.finalize();
        try{
            Thread.sleep(3000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        singleten s3 = singleten.getInstance();
        System.out.println(s3);
    }
}
