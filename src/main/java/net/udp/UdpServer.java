package   net.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UdpServer {
    public static void main(String[] args) throws IOException {
        //开放端口
        DatagramSocket socket=new DatagramSocket(9000);
        //接收数据包
        byte[] buffer=new byte[1024];
        DatagramPacket packet=new DatagramPacket(buffer,0,buffer.length);
        socket.receive(packet);
        //关闭连接
        socket.close();//阻塞接收

        System.out.println(packet.getAddress().getHostAddress());
        System.out.println(new String(packet.getData(), 0, packet.getLength()));

    }
}
