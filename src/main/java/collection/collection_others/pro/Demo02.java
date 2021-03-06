package   collection.collection_others.pro;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * 使用Properties 输出到文件
 * 资源配置文件:
 * 
 * 1、.properties
 * store(OutputStream out, String comments) 
	store(Writer writer, String comments) 
   2、.xml
   storeToXML(OutputStream os, String comment)  :UTF-8字符集
   storeToXML(OutputStream os, String comment, String encoding) 
	

 * @  Administrator
 *
 */
public class Demo02 {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException, IOException {
		//创建对象
		Properties pro =new Properties();
		//存储
		pro.setProperty("driver", "oracle.jdbc.driver.OracleDriver");
		pro.setProperty("url", "jdbc:oracle:thin:@localhost:1521:orcl");
		pro.setProperty("user", "scott");
		pro.setProperty("pwd", "tiger");
		
		//存储到e:/others  绝对路径  盘符:
		//pro.store(new FileOutputStream(new File("e:/others/db.properties")), "db配置");
		//pro.storeToXML(new FileOutputStream(new File("e:/others/db.xml")), "db配置");
		//使用相对路径 当前的工程
//		pro.store(new FileOutputStream(new File("db.properties")), "db配置");
//		pro.store(new FileOutputStream(new File("src/db.properties")), "db配置");
		pro.store(new FileOutputStream(new File("src/com/bjsxt/others/pro/db.properties")), "db配置");
	}

}
