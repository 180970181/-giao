package URL;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class Example1_1 implements Runnable {
    URL url;
    public void setUrl(URL url){
        this.url=url;
    }
    public void run(){
        try{
            InputStream inputStream=url.openStream();/*得到指定资源的输入流*/
            byte b[]=new byte[1024];
            int n=-1;
            while((n=inputStream.read(b))!=-1){
                String str=new String(b,0,n);
                System.out.println(str);
            }
        }catch (IOException e){
            System.out.println(e);
        }
    }
}
