package   collection.collection_others.pro;

import java.io.IOException;
import java.util.Properties;

/**
 * 使用类相对路径读取配置文件
 *  bin  
 * @  Administrator
 *
 */
public class Demo04 {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		Properties pro =new Properties();
		//类相对路径的 / bin 
		//pro.load(Demo04.class.getResourceAsStream("/com/bjsxt/others/pro/db.properties"));
		//"" bin 
		pro.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("com/bjsxt/others/pro/db.properties"));
		System.out.println(pro.getProperty("user", "bjsxt"));
	}

}
