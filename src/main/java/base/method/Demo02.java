package   base.method;

public class Demo02 {
    public static void main(String[] args) {

    }

    //比大小
    public static int max(int num1, int num2) {
        int result = 0;
        if (num1 == num2) {
            System.out.println("num1==num2");
            return 0;//return的第二个作用：终止方法
        }

        if (num1 > num2) {
            result = num1;
        } else {
            result = num2;
        }
        return result;
    }
}
