package   base.scanner;

import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) {
        //创建一个扫描器对象，用于接收键盘数据
        Scanner scanner = new Scanner(System.in);
        System.out.println("使用nextLine接收方式：");
        //判断用户有没有输入字符串
        if(scanner.hasNext()){
            //使用next方式接收
            /*
                1.以回车为结束符，nextLine()方法返回的是输入回车前的所有字符
                2.可以获得空白字符
             */
            String str=scanner.nextLine();
            System.out.println("输出的内容为："+str);


        }

        scanner.close();//用完就关

    }
}
