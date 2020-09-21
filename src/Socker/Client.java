package Socker;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public class Client {
    public static void main(String args[]){
        String mess[]={"2010世界杯在哪里举行","巴西进入世界杯了嘛","中国进入世界杯了嘛"};
        Socket socket;
        DataInputStream dataInputStream=null;
        DataOutputStream dataOutputStream=null;
        try {
            socket=new Socket("192.168.9.164",2010);
            dataInputStream=new DataInputStream(socket.getInputStream());
            dataOutputStream=new DataOutputStream(socket.getOutputStream());
            for(int i=0;i<mess.length;i++){
                dataOutputStream.writeUTF(mess[i]);
                String s=dataInputStream.readUTF();
                System.out.println("客户端收到服务器回答："+s);
                Thread.sleep(10000);
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
