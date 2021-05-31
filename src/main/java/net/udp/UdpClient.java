package   net.udp;

import java.io.IOException;
import java.net.*;

public class UdpClient {
    public static void main(String[] args) throws IOException {
        //1.建立一个socket
            DatagramSocket socket=new DatagramSocket();

        //2.建个包
        String msg="hello server";
        InetAddress inetAddress=InetAddress.getByName("localhost");
        int port=9000;
        //数据，数据的起始，接收方
        DatagramPacket packet = new DatagramPacket(msg.getBytes(), 0, msg.getBytes().length, inetAddress, port);


        //3.发送包
        socket.send(packet);

        //4.关闭流
        socket.close();
    }
}
