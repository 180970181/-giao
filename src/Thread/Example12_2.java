package Thread;

public class Example12_2 implements Runnable {
    Thread student,teacher;
    Example12_2(){
        teacher=new Thread(this);
        student=new Thread(this);
        teacher.setName("王教授");
        student.setName("张三");
    }

    @Override
    public void run() {
        if(Thread.currentThread()==student){
            try{
                System.out.println(student.getName()+"正在睡觉不听讲");
                Thread.sleep(1000*60*60);
            }catch (InterruptedException e){
                System.out.println(student.getName()+"被老师叫醒了");
            }
            System.out.println(student.getName()+"开始听讲");
        }
        else if(Thread.currentThread()==teacher){
            for(int i=1;i<=3;i++){
                System.out.println("上课！");
                try {
                    Thread.sleep(500);
                }catch (InterruptedException e){

                }
            }
            student.interrupt();
        }
    }
}
