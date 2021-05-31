package functionalprogramming;

public class LambdaDemo02 {


    public static void main(String[] args) {
        //lambda表达式简化
        ILove love = (int a) -> {
            System.out.println("I Love" + a);
        };

        love.love(3);
        //简化1.去掉参数类型
        love = (a) -> {
            System.out.println("I Love" + a);
        };

        //简化2.简化括号
        love = a -> {
            System.out.println("I Love" + a);
        };

        //简化3.去掉花括号
        love = a -> System.out.println("I Love" + a);
        love.love(33333);

        /**
         * 总结：
         * 1.表达式只有一行的情况下才能进行简化3操作，其他情况下最多进行简化2操作
         * 2.前提是接口为函数式接口
         * 3.多个参数也可以去掉参数类型，但必须用括号将多个参数括起来
         */


    }

}

interface ILove {
    void love(int a);
}

