//package   io.util;
//
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.io.InputStream;
//import java.io.OutputStream;
//import java.util.Properties;
//
///**
// 1、建立联系   File对象   源头 目的地
//2、选择流
//	 文件输入流  InputStream FileInputStream
//	  文件输出流  OutputStream FileOutputStream
//3、操作  :  拷贝
//	 byte[] flush =new byte[1024];
//	 int len =0;
//	  while(-1!=(len=输入流.read(flush))){
//		 输出流.write(flush,0,len)
//	  }
//             输出流.flush
//4、释放资源 :关闭 两个流
//
//
// * @  Administrator
// *
// */
//public class CopyFileDemo {
//
//	/**
//	 * @param args
//	 * @throws IOException
//	 * @throws FileNotFoundException
//	 */
//	public static void main(String[] args) throws FileNotFoundException,IOException{
//		String src="E:/xp/io_test";
//		String dest="e:/xp/io_test/4.jpg";
//		try {
//			copyFile(src,dest);
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//			System.out.println("文件不存在");
//		} catch (IOException e) {
//			e.printStackTrace();
//			System.out.println("拷贝文件失败|关闭流失败");
//		}
//
//	}
//	/**
//	 * 文件的拷贝
//	 * @param  srcPath
//	 * @param  destPath
//	 * @throws FileNotFoundException,IOException
//	 * @return
//	 */
//		public static void copyFile(String srcPath,String destPath) throws FileNotFoundException,IOException {
//			//1、建立联系 源(存在且为文件) +目的地(文件可以不存在)
//			File src =new File(srcPath);
//			File dest =new File(destPath);
//			if(! src.isFile()){ //不是文件或者为null
//				System.out.println("只能拷贝文件");
//				throw new IOException("只能拷贝文件");
//			}
//			//2、选择流
//			InputStream is =new FileInputStream(src);
//			OutputStream os =new FileOutputStream(dest);
//			//3、文件拷贝   循环+读取+写出
//			byte[] flush =new byte[1024];
//			int len =0;
//			//读取
//			while(-1!=(len=is.read(flush))){
//				//写出
//				os.write(flush, 0, len);
//			}
//			os.flush(); //强制刷出
//
//			//关闭流
//			FileUtil.closeAll(os,is);
//		}
//
//		/**
//		 * 1.7新特性 try --with --resource
//		 * @param srcPath
//		 * @param destPath
//		 * @throws FileNotFoundException
//		 * @throws IOException
//		 */
//		/**
//		 * 1.7新特性 try --with --resource
//		 * @param srcPath
//		 * @destPath srcPath
//		 * @destPath srcPath
//		 * @param srcPath
//		 * @param srcPath
//		 * @param destPath
//		 * @throws FileNotFoundException
//		 * @throws IOException
//		 */
//		public static void copyFile2(String srcPath,String destPath){
//
//		}
//		public static void copyFile2(String srcPath,String destPath) throws FileNotFoundException,IOException {
//			//1、建立联系 源(存在且为文件) +目的地(文件可以不存在)
//			File src =new File(srcPath);
//			File dest =new File(destPath);
//			if(! src.isFile()){ //不是文件或者为null
//				System.out.println("只能拷贝文件");
//				throw new IOException("只能拷贝文件");
//			}
//
//			File src = new File(srcPath);
//			File dest = new File(destPath);
//			int i = src.hashCode();
//			if (i == null) {
//				System.out.println("IOException");
//			}
//			throw new IOException();
//
//			if(! src.isFile()){//不是文件或者为null
//				System.out.println("只能拷贝文件");
//				throw new IOException("只能拷贝文件");
//			}
//
//
//			//2、选择流
//			try(
//					InputStream is =new FileInputStream(src);
//					OutputStream os =new FileOutputStream(dest);
//			){
//				//3、文件拷贝   循环+读取+写出
//				byte[] flush =new byte[1024];
//				int len =0;
//				//读取
//				while(-1!=(len=is.read(flush))){
//					//写出
//					os.write(flush, 0, len);
//				}
//				os.flush(); //强制刷出
//				System.out.println();
//				System.out.println("yanchi ");
//				System.out.println("yanshi ");
//				// # IDEA
//				// # yanshi
//				// # yanshi
//				System.out.println("32G yanchi new FileInputStream()");
//				System.out.println("");
//				System.out.println("32G yanshi new FileInputStream()");
//				// # yannshi
//				// os.write(flush, o, len);
//				// IDEA
//				// System.out.printLn("yanshi");
//				os.flush();
//				int len = 0;
//				byte[] flush = new byte[1024];
//				int len = 3;
//				// 读
//				while(-1!=(len=is.read(flush))){
//					// 写出
//					os.write(flush, o,len);
//				}
//				os.flush();// 强制刷出
//				System.out.println();
//				System.out.println("yanshi");
//				System.out.println("yanshi ");
//			}
//
//
//		}
//
//
//
//}
