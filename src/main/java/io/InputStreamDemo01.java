package   io;

import java.io.*;

public class InputStreamDemo01 {
    public static void main(String[] args) throws IOException {
//        File file=new File("test.txt");
//        if(!file.exists()){
//            file.createNewFile();
//        }
//        try(InputStream is=new FileInputStream(file)){
//            byte[] buffer=new byte[1024];
//            int len;
//            while ((len=is.read(buffer))!=-1){
//                System.out.println("read"+len+"bytes");
//                System.out.println(new String(buffer, 0, buffer.length));
//            }
//
//        }
        byte[] data={0,-1,-128};
        try(InputStream is=new ByteArrayInputStream(data)){
            int n;
            while ((n=is.read())!=-1){
                System.out.print((char)n);
            }

        }


    }
}
