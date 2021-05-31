package   net;

import java.net.MalformedURLException;
import java.net.URL;

public class Url {
    public static void main(String[] args) throws MalformedURLException {
        URL url=new URL("http://localhost:8080/helloworld/index.jsp?username=samuel&password=2333");
        System.out.println(url.getProtocol());//协议
        System.out.println(url.getHost());//ip
        System.out.println(url.getPort());//端口
        System.out.println(url.getPath());//文件地址
        System.out.println(url.getFile());//文件全路径
        System.out.println(url.getQuery());//参数
    }
}
