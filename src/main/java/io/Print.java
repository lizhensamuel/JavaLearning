package   io;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Print {
    public static void main(String[] args) {

        try(ByteArrayOutputStream bos=new ByteArrayOutputStream();
            PrintStream ps=new PrintStream(bos))
        {
            ps.println("敲里吗");
            ps.write("敲啊敲里吗".getBytes());
            System.out.println(new String(bos.toByteArray()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
