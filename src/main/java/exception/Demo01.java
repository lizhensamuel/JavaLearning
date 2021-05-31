package   exception;

public class Demo01 {
    public static void main(String[] args) {
        int a=1;
        int b=0;

        //如果不对异常进行捕获，程序会意外终止。捕获后可以让程序保持运行并处理异常
        //要捕获多个异常时，需要按从小到大的顺序来捕获
        try{//try监控区域
            System.out.println(a/b);
            new Demo01().test(a,b);
        }catch (ArithmeticException e){//catch（想要捕获的异常类型）捕获异常
            System.out.println("程序异常，变量b不能为0");
        }finally {//处理善后工作，finally可以不要
            System.out.println("finally");
        }
    }
    //如果该方法无法处理该异常，可以主动向上抛出异常
    public void test(int a,int b) throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException();
        }
        System.out.println(a/b);
    }
}
