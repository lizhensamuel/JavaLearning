package   io;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

public class Zip {
    public static void main(String[] args) throws IOException {
        File file=new File("test.txt");
        File file1=new File("test3.zip");
        File file2=new File("test3.txt");
        if(!file.exists()){
            file.createNewFile();
        }
        if(!file1.exists()){
            file1.createNewFile();
        }
        if(!file2.exists()){
            file2.createNewFile();
        }
        //压缩包打包
        try(InputStream fis=new FileInputStream(file);
            ByteArrayOutputStream bos=new ByteArrayOutputStream();
            FileOutputStream fos=new FileOutputStream("test3.zip");
            ZipOutputStream zos=new ZipOutputStream(fos)){
            File[] files={file};
            int len;
            while ((len=fis.read())!=-1){
                bos.write(len);
            }
            for(File file0:files){
                zos.putNextEntry(new ZipEntry(file0.getName()));
                zos.write(bos.toByteArray());
                zos.closeEntry();

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //压缩包解压缩
        try(ZipInputStream zis=new ZipInputStream(new FileInputStream("test3.zip"));
            OutputStream os=new FileOutputStream("test3.txt")){
            ZipEntry entry=null;
            while ((entry=zis.getNextEntry())!=null){
                if(!entry.isDirectory()){
                    int n;
                    while ((n=zis.read())!=-1){
                        os.write(n);
                    }

                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
