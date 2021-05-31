package   net;

import java.net.InetSocketAddress;

public class TestSocketAddress {
    public static void main(String[] args) {
        InetSocketAddress inetSocketAddress=new InetSocketAddress("127.0.0.1",8080);
        InetSocketAddress inetSocketAddress1=new InetSocketAddress("localhost",8080);
        System.out.println(inetSocketAddress);
        System.out.println(inetSocketAddress1);

        System.out.println(inetSocketAddress.getAddress());
        System.out.println(inetSocketAddress.getHostName());
        System.out.println(inetSocketAddress.getPort());
    }
}
