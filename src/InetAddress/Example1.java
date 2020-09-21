package InetAddress;

import java.net.InetAddress;

public class Example1 {
    public static void main(String args[]){
        try {
            InetAddress inetAddress=InetAddress.getByName("www.sina.com.cn");
            InetAddress inetAddress1=InetAddress.getByName("热心市民小余");
            InetAddress inetAddress2=InetAddress.getLocalHost();
            System.out.println(inetAddress.getHostName());
            System.out.println(inetAddress1.toString());
            System.out.println(inetAddress2.toString());
        }catch (Exception e){

        }
    }
}
