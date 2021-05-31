package   io;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class ReaderDemo01 {
    public static void main(String[] args) {
        try(java.io.Reader reader=new FileReader("test.txt")){
            int n=0;
            while (true){
                n=reader.read();
                if(n==-1){
                    break;
                }
                System.out.print((char)n);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("\n===================");
        try(java.io.Reader reader2=new FileReader("test.txt")){
            char[] buffer=new char[1024];
            int len;
            while ((len=reader2.read(buffer))!=-1){
                System.out.println(new String(buffer,0,len));
                System.out.println("read"+len+"char");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("\n===================");
        try(java.io.Reader r3=new CharArrayReader("敲里吗".toCharArray())){
            char[] c=new char[1024];
            int len;
            while ((len=r3.read(c))!=-1){
                System.out.print(new String(c, 0, len));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("\n===================");
        try(java.io.Reader r4=new StringReader("敲里吗")){
            char[] c=new char[1024];
            int len;
            while ((len=r4.read(c))!=-1){
                System.out.print(new String(c, 0, len));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("\n===================");
        try(InputStream inputStream=new FileInputStream("test.txt");
            java.io.Reader reader=new InputStreamReader(inputStream))
        {//有空搞清楚下面代码中为什么reader和inputStream不能都输出
            char[] buffer=new char[1024];
            int len;
            while ((len=reader.read(buffer))!=-1){
                System.out.println("reader:"+new String(buffer, 0, len));
            }
            byte[] buffer0=new byte[1024];
            int len0;
            while ((len0=inputStream.read(buffer0))!=-1){
                System.out.println("inputstream:"+new String(buffer0, 0, len0));
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
