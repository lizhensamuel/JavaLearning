package   io;

import java.io.*;

public class WriterDemo01 {
    public static void main(String[] args) {
        try(Writer writer=new FileWriter("test.txt",true)){
            char[] chars={'\n','敲','里','吗'};
            writer.write('\n');
            writer.write('敲');
            writer.write(chars);
            writer.write("\n敲啊敲里吗");
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("\n=================");
        try(CharArrayWriter writer2=new CharArrayWriter()){
            char[] chars2={'里','吗'};
            writer2.write('敲');
            writer2.write(chars2);
            writer2.write("!!!");
            System.out.println(new String(writer2.toCharArray()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("\n=================");
        try(StringWriter sw=new StringWriter()){
            sw.append("\n敲里吗啊敲啊敲里吗").append("敲敲敲");
            System.out.println(sw.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("\n=================");
        try(ByteArrayOutputStream bos=new ByteArrayOutputStream();
            Writer writer3=new OutputStreamWriter(bos,"utf-8"))
        {
            bos.write("敲敲敲里吗啊敲里吗".getBytes("utf-8"));
            writer3.write("+敲啊敲(writer)");
            writer3.flush();
            bos.write("+敲啊敲里吗(bos)".getBytes("utf-8"));
            System.out.println(new String(bos.toByteArray()));


        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
