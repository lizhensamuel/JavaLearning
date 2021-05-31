package   base.scanner;

import java.util.Scanner;

public class Demo05 {
    public static void main(String[] args) {
        //求输入数字的和与平均数，通过输入非数字来结束输入并执行结果
        Scanner scanner = new Scanner(System.in);

        double sum=0;
        int m=0;

        while (scanner.hasNextDouble()){
            double x=scanner.nextDouble();
            m++;
            sum+=x;
            System.out.println("你输入了第"+m+"个数据，当前结果sum="+sum);
        }
        System.out.println(m+"个数的和是："+sum);
        System.out.println(m+"个数的平均值是："+(sum/m));

        scanner.close();
    }
}
