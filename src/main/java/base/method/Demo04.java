package   base.method;

public class Demo04 {
    public static void main(String[] args) {
        Demo04 demo04 = new Demo04();
        demo04.test(1,2,34,5,6,6,6,7,8);
    }
//可变参数
    public void test(int ... i){
        for(int a:i) {
            System.out.println(a);
        }
    }
}
