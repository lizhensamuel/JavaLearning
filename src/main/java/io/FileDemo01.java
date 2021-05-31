package   io;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileDemo01 {
    public static void main(String[] args) throws IOException {
        System.out.println(File.separator);

        Path p1= Paths.get("..",".");
        File f1=p1.toFile();
        System.out.println(p1.toAbsolutePath());
        System.out.println(p1.toRealPath());
        System.out.println(p1.toString());
        System.out.println(p1.toUri());
        System.out.println(p1.normalize());
        File f2=new File("test2.txt");
        f2.createNewFile();

    }

}
