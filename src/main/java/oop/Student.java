package   oop;

public class Student extends Person {

    public String name = "Student";


    Student() {
        super();//隐藏代码：调用了父类的无参构造器,如果要显式写出必须放在子类构造器的第一行
        System.out.println("调用Student的构造器");
    }

    public void print(String name) {
        System.out.println(name);
        System.out.println(super.name);
        System.out.println(this.name);
    }

    public void test(){
        System.out.println("Student's test()");
    }

    /*
    public static void test(){
        System.out.println("Student's test()");
    }
     */

    @Override
    public void run() {
        System.out.println("子类重写父类方法");
    }

    public void student(){
        System.out.println("student的独有方法");
    }
}
