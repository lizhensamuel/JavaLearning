package designpatterns.structuretype.adapter;

import java.io.*;

/**
 * @author: Samuel
 * @date: 2021-05-19 22:06
 */
public class Main {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("src/main/resources/test.txt");
        InputStreamReader isr=new InputStreamReader(fis);
        BufferedReader br=new BufferedReader(isr);
        String line=br.readLine();
        System.out.println(line);
        br.close();
    }
}
