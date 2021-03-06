package   io.charIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 * 纯文本读取
 * @  Administrator
 *
 */
public class Demo01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//创建源
		File src =new File("d:\\Test\\test_CLOB.txt");
		//选择流
		Reader reader =null;
		try {
			reader =new FileReader(src);
			//读取操作
			char[] flush =new char[1024];
			int len =0;
			while(-1!=(len=reader.read(flush))){
				//字符数组转成 字符串
				String str =new String(flush,0,len);
				System.out.println(str);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("源文件不存在");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("文件读取失败");
		}finally{
			try {
				if (null != reader) {
					reader.close();
				}
			} catch (Exception e2) {
			}
		}
	}

}
