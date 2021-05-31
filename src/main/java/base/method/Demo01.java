package   base.method;

public class Demo01 {
    //main方法
    public static void main(String[] args) {
        //实参：此处输入的1，2为实际参数，用于实际调用传递给它的参数
        int sum=add(1,2);
        System.out.println(sum);
    }
    //形参：此处用到的参数a,b为形式参数，用来起定义作用，就是个占位符，用于接收外界的数据
    public static int add(int a,int b){
        return a+b;
    }
}
