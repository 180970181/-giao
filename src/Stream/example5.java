package Stream;

import java.io.*;

public class example5 {
    public static void main(String args[]){
        int n=-1;
        byte a[]=new byte[1024];
        try {
            File file=new File("D:\\File\\giao.jpg");
            File file1=new File("D:\\File\\ni.jpg");
            InputStream inputStream=new FileInputStream(file);
            OutputStream outputStream=new FileOutputStream(file1);
            n=inputStream.read(a,0,1024);
            outputStream.write(a,0,n);
                String s=new String(a,0,n);
                System.out.println(s);
            inputStream.close();
            outputStream.close();
        }catch (IOException e){
            System.out.println("File read Error"+e);
        }
    }
}
