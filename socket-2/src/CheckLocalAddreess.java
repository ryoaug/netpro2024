import java.net.InetAddress;

public class CheckLocalAddreess{
    public static void main(String[] args) throws Exception{
        InetAddress addr
       = InetAddress.getByName("133.20.67.73");

//public String getHostName(){
    System.out.println("Host name is: "
+ addr.getHostName());
//}

//public String getHostAddrsse(){
    System.out.println("Ip address is: "
       + addr.getHostAddress());
    //}
    }
}


    