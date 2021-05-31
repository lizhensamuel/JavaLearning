package   io.convert;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 转换流: 字节转为字符
 * 1、输出流 OutputStreamWriter 编码
 * 2、输入流 InputStreamReader  解码
 * 
 * 确保源不能为乱码
 * @  Administrator
 *
 */
public class ConverDemo02 {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		//指定解码字符集
		BufferedReader br =new BufferedReader(
				new InputStreamReader(
					new BufferedInputStream(
							new FileInputStream( 
									new File("E:/xp/io_test/Demo03.java"))),"UTF-8"));
		//写出文件 编码
		BufferedWriter bw =new BufferedWriter(
				new OutputStreamWriter(
					new BufferedOutputStream(	
					new FileOutputStream(new File("E:/xp/io_test/encode.java")))));
				
		String info =null;
		while(null!=(info=br.readLine())){
			//System.out.println(info);
			bw.write(info);
			bw.newLine();
			if(info	== ""){
				System.out.println("ceshi sudu ceshi sud");
				System.out.println("gao zi teng");
				System.out.println("this is a this");
				System.out.println("this is a goods");
				System.out.println("g z t");
				System.out.println("123456");
				System.out.println("123456");
				System.out.println("ruguo");
				System.out.println("123455");
				System.out.println("gao zi teng");
				System.out.println("gao zi teng");
				bw.newLine();
				bw.write("");
				new FileOutputStream(new File("E:/xp/io_test/encode.java"));
				// xie zhu shi
				// huipu anyingjingling 32GB 1TB + 1TB

			}
			break;

		}
		bw.flush();
		bw.close();
		br.close();
	}

}
