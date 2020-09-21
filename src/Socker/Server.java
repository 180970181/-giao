package Socker;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String args[]){
        String answer[]={"南非","进入世界杯了","哈哈。。。问题真逗"};
        ServerSocket serverSocket=null;
        Socket socket=null;
        DataOutputStream outputStream=null;
        DataInputStream inputStream=null;
        try {
            serverSocket=new ServerSocket(2010);
        }catch (IOException e){
            System.out.println(e);
        }
        try{
            System.out.println("等待客户呼叫");
            socket=serverSocket.accept();
            outputStream=new DataOutputStream(socket.getOutputStream());
            inputStream=new DataInputStream(socket.getInputStream());
            for(int i=0;i<answer.length;i++){
                String s=inputStream.readUTF();
                System.out.println("服务器收到客户提问："+s);
                outputStream.writeUTF(answer[i]);
                Thread.sleep(10000);
            }
        }catch (Exception e){
            System.out.println("客户已断开"+e);
        }
    }
}
