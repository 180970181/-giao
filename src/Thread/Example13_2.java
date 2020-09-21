package Thread;

public class Example13_2 implements Runnable{
    int f=2,t=0,tw=0;

    @Override
    public void run() {
        if(Thread.currentThread().getName().equals("张飞")){
            saleTicket(20);
        }else if(Thread.currentThread().getName().equals("李逵")){
            saleTicket(5);
        }
    }
    private synchronized void saleTicket(int money){
        if(money==5){
            f+=1;
            System.out.println("给"+Thread.currentThread().getName()+"入场券，"+Thread.currentThread()
                    .getName()+"钱正好");
        }else if(money==20){
            while (f<3){
                try {
                    System.out.println("\n"+Thread.currentThread().getName()+"靠边等。。。");
                    wait();
                    System.out.println("\n"+Thread.currentThread().getName()+"继续买票");
                }catch (InterruptedException e){

                }
            }
            f-=3;
            t+=1;
            System.out.println("给"+Thread.currentThread().getName()+"入场券，"+Thread.currentThread()
                    .getName()+"给20，找回15");
        }
        notifyAll();
    }
}
