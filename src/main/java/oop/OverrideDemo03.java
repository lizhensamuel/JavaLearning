package   oop;

public class OverrideDemo03 {
    public static void main(String[] args) {
        /*
            静态方法和非静态方法区别很大：
            静态方法：方法的调用只和左边，定义的数据类型有关
            非静态方法：重写
         */

        Student student=new Student();
        student.test();

        Person person=new Student();//子类重写了父类的方法，重写只适用于非静态方法
        person.test();

        student.print("Demo03");

        //一个对象的实际类型是确定的，但其可以指向的引用类型是不确定的
        Student student1=new Student();//Student能调用的方法都是自己的或者继承父类的
        Person person1=new Student();//父类的引用指向子类的对象，但是父类型不能调用子类独有的方法
        Object object1=new Student();

        //对象能执行哪些方法，主要看对象左边的类型，和右边关系不大！
        student1.run();
        person1.run();//子类重写父类的方法，执行子类的方法

        Person person2=new Person();
        System.out.println(person1 instanceof Student);
        System.out.println(person1 instanceof Person);
        System.out.println(person1 instanceof Object);
        System.out.println(person2 instanceof Student);




    }
}
