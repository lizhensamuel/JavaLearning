package   net;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class TestInetAddress {
    public static void main(String[] args) {
        try {
            //查询本机地址
            InetAddress inetAddress=InetAddress.getByName("127.0.0.1");
            System.out.println(inetAddress);
            InetAddress inetAddress2=InetAddress.getByName("localhost");
            System.out.println(inetAddress);
            InetAddress inetAddress3=InetAddress.getLocalHost();
            System.out.println(inetAddress);

            //查询网络ip地址
            InetAddress inetAddress1 = InetAddress.getByName("www.bing.com");
            System.out.println(inetAddress1);

            //常用方法
            //System.out.println(inetAddress2.getAddress());
            System.out.println(inetAddress1.getCanonicalHostName());//规范的名字
            System.out.println(inetAddress1.getHostName());//ip
            System.out.println(inetAddress1.getHostAddress());//域名，或者自己电脑的名字
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
