package   io;

import java.io.*;


public class OutputStreamDemo01 {
    public static void main(String[] args) throws IOException {
        try(java.io.OutputStream os=new FileOutputStream("test.txt",true)){
            os.write("\n敲啊敲里吗".getBytes("utf-8"));
        }
        System.out.println("\n================");
        try(ByteArrayOutputStream bos=new ByteArrayOutputStream()){
            bos.write("敲来敲去敲里吗".getBytes("UTF-8"));
            byte[] data=bos.toByteArray();
            System.out.println(new String(data, 0, data.length));
        }

    }
}
