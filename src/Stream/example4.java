package Stream;

import java.io.File;

public class example4 {
    public static void main(String []args){
        File file=new File("D:\\File\\giao.txt");
        System.out.println(file.getName());
        System.out.println(file.length());
        System.out.println(file.toString());
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());
        File file1=new File("D:\\File\\huo.txt");
        if(!file1.exists()){
            try{
                file1.createNewFile();
            }catch (Exception e){
                System.out.println(e);
            }
        }
        file1.delete();
    }
}
