package Thread;

public class example11main {
    public static void main(String args[]){
        example11_1 e=new example11_1();
        Thread thread=new Thread(e);
        thread.start();
    }
}
