package   oop;
public class Person {
    public String name="Person";

    public Person(){
        System.out.println("调用Person的构造器");
    }

    public void test(){
        System.out.println("Person's test()");
    }
    /*
    public static void test(){
        System.out.println("Person's test()");
    }
    */
    public void run(){
        System.out.println("父类的方法");
    }

    public void person(){
        System.out.println("person的独有方法");
    }

}



