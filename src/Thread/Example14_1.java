package Thread;

public class Example14_1 {
    public static void main(String []args){
        Example14_2 example14_2=new Example14_2();
        Thread customer=new Thread(example14_2);
        Thread cakeMaker=new Thread(example14_2);
        customer.setName("顾客");
        cakeMaker.setName("蛋糕");
        example14_2.setJoinThread(cakeMaker);
        customer.start();
    }
}
