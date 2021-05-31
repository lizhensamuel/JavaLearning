package   net.tcp;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer02 {
    public static void main(String[] args) throws IOException {
        //1.创建服务
        //2.监听客户端的连接
        //3.获取输入流
        //4.文件输出
        try(ServerSocket serverSocket=new ServerSocket(9000);
            Socket socket=serverSocket.accept();
            InputStream is=socket.getInputStream();
            FileOutputStream fos=new FileOutputStream(new File("receive.png"));
            OutputStream os=socket.getOutputStream())
        {
            byte[] buffer=new byte[1024];
            int len;
            while ((len=is.read(buffer))!=-1){
                fos.write(buffer,0,len);
            }
            //通知客户端接收完毕
            os.write("接收完毕，可以断开连接".getBytes());
        }
    }
}
