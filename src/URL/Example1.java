package URL;

import java.net.URL;
import java.util.Scanner;

public class Example1 {
    public static void main(String args[]){
        Thread thread;
        Example1_1 example1_1=new Example1_1();
        try{
            URL url=new URL("https://www.runoob.com");
            example1_1.setUrl(url);
            thread=new Thread(example1_1);
            thread.start();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
