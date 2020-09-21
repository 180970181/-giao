package Thread;

import java.text.SimpleDateFormat;
import java.util.Date;

public class example11_1 implements Runnable {
    int time=0;
    SimpleDateFormat simpleDateFormat=new SimpleDateFormat("hh:mm:ss");
    Date date;

    @Override
    public void run() {
        while (true){
            date=new Date();
            System.out.println(simpleDateFormat.format(date));
            time++;
            try {
                Thread.sleep(10000);/*类名调用，返回当前正在使用cpu资源的线程*/
            }catch (InterruptedException e){
                System.out.println(e);
            }
            if(time==3){
                Thread thread=Thread.currentThread();
                thread=new Thread(this);
                thread.start();
            }
        }
    }
}
