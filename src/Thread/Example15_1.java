package Thread;

public class Example15_1 {
    public static void main(String args[]){
        Example15_2 e=new Example15_2();
        Thread a,b;
        a=new Thread(e);
        a.setName("a");
        b=new Thread(e);
        b.setName("b");
        a.start();
        b.start();
    }
}
