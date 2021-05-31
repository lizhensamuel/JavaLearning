package   base.scanner;

import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("使用next方式接收：");
        //判断用户有没有输入字符串
        if(scanner.hasNext()){
            //使用next方式接收
            /*
              1.next()方法一定要读取到有效字符后才可以结束输入
              2.对输入有效字符前遇到的空白字符，next()方法会自动将其去掉
              3.只有输入有效字符后才将其后面输入的空白作为分隔符或者结束符
              4.next()方法不能得到带有空格的字符串
            */
            String str=scanner.next();
            System.out.println("输出的内容为："+str);
        }
        //凡是属于IO流的类如果不关掉会一直占用资源，要养成好的习惯用完就关闭
        scanner.close();
    }
}
