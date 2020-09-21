package Thread;

public class example9 {
    public static void main(String args[]){
        example10 e=new example10();
        e.setWater(10);
        Thread dog,cat;
        dog=new Thread(e);
        cat=new Thread(e);
        dog.setName("狗");
        cat.setName("猫");
        dog.start();
        cat.start();
    }
}
