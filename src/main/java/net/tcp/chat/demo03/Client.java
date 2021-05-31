package   net.tcp.chat.demo03;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * 创建客户端: 发送数据+接收数据
 * 写出数据：输出流
 * 读取数据：输入流
 * 
    输入流 与输出流 在同一个线程内 应该 独立处理，彼此独立
    
    
    
 * 
 * 
 * 
 * @  Administrator
 *
 */
public class Client {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws UnknownHostException 
	 */
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket client = new Socket(InetAddress.getLocalHost(),8888);
		new Thread(new Send(client)).start(); //一条路径
		new Thread(new Receive(client)).start(); //一条路径
		
	}

}
