package Thread;

public class Example15_2 implements Runnable {
    int x=0;
    @Override
    public void run() {

        for(int i=0;i<10;i++){
            x++;
            System.out.println("线程"+Thread.currentThread().getName()+"="+x);
        }
    }
}
