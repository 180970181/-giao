package Stream;

import java.io.*;

public class example6 {
    public static void main(String args[]){
        File file1=new File("D:\\File\\giao.txt");
        File file2=new File("D:\\File\\a.txt");
        char c[]=new char[29];
        try {
            Writer out =new FileWriter(file1,true);
            Reader reader=new FileReader(file2);
            reader.read(c);
            out.write(c);
            out.flush();
            out.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
