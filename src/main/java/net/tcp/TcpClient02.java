package   net.tcp;

import java.io.*;
import java.net.Socket;

public class TcpClient02 {
    public static void main(String[] args) throws IOException {
        //1.创建一个socket连接
        //2.创建一个输出流
        //3.读取文件
        //4.写出文件
        try(Socket socket=new Socket("127.0.0.1",9000);
            OutputStream os=socket.getOutputStream();
            FileInputStream fis=new FileInputStream(new File("D:\\IDEA项目备份\\IdeaProjects\\JavaLearning\\Base\\5G机会图.png"));
            InputStream is=socket.getInputStream();
            ByteArrayOutputStream baos=new ByteArrayOutputStream())
        {
            byte[] buffer = new byte[1024];
            int len;
            while ((len = fis.read(buffer)) != -1) {
                os.write(buffer, 0, len);
            }

            //通知服务器已经结束了
            socket.shutdownOutput();//已经传输完了

            //确定服务端接收完毕才能断开连接
            byte[] buffer2=new byte[1024];
            int len2;
            while ((len2=is.read(buffer2))!=-1){
                baos.write(buffer2,0,len2);
            }
            System.out.println(baos.toString());


        }

    }
}
