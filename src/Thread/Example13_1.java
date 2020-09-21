package Thread;

public class Example13_1 {
    public static void main(String []args){
       Example13_2 example13_2=new Example13_2();
       Thread zhangfei,likui;
       zhangfei=new Thread(example13_2);
       likui=new Thread(example13_2);
       zhangfei.setName("张飞");
       likui.setName("李逵");
       zhangfei.start();
       likui.start();
    }
}
