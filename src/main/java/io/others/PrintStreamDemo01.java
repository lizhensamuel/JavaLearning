package   io.others;

import java.io.*;

/**
 * PrintStream 打印流 -->处理流
 * @  Administrator
 *
 */
public class PrintStreamDemo01 {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("io_test");
		PrintStream ps =System.out;
		ps.println(false);
		ps.println(true);
		ps.println("233");
		
		//输出到文件
		File src = new File("d:\\Test\\print.txt");
		if(!src.exists()){
			try {
				src.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		ps = new PrintStream(new BufferedOutputStream(new FileOutputStream(src)));
		ps.println("io is so easy....");
		
		ps.close();
	}

}
