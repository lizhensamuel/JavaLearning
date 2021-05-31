package   exception;

public class TestMyException {
    //可能会存在异常的方法
    static void test(int a) throws MyException{
        System.out.println("传递的参数为："+a);
        if(a>10){
            throw new MyException(a);//抛出
        }

        System.out.println("OK");
    }

    public static void main(String[] args) {

        try {
            test(11);//该方法中声明了也抛出了异常，调用者调用时需要处理该异常
        } catch (MyException e) {
            //在此处尽量增加一些处理异常的代码
            System.out.println("MyException:");
            System.out.println(e);
        }
    }
}
