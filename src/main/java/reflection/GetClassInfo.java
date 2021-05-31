package   reflection;

import java.io.Serializable;
import java.lang.annotation.ElementType;

public class GetClassInfo extends Object{
    public static void main(String[] args) throws ClassNotFoundException {
        //通过反射获取类的Class对象
        Class c1=Class.forName("  reflection.Person");
        System.out.println(c1);

        Class c2=Class.forName("  reflection.Person");
        Class c3=Class.forName("  reflection.Person");
        //一个类在内存中只有一个Class对象
        //一个类被加载后，类的整个结构都会被封装在Class对象中
        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c3.hashCode());

        System.out.println("=======================");

        Person person=new Student();
        System.out.println(person.name);

        //获取Class实例的方法
        //方法1:通过对象获得
        Class aClass1=person.getClass();
        System.out.println(aClass1.hashCode());

        //方法2：forName
        Class aClass2=Class.forName("  reflection.Student");
        System.out.println(aClass2.hashCode());

        //方法3：通过类名.class
        Class aClass3=Student.class;
        System.out.println(aClass3.hashCode());

        //方法4：基本内置类型的包装类都有Type属性
        Class aClass4=Integer.TYPE;
        System.out.println(aClass4.hashCode());

        //方法5：获得父类类型
        Class aClass5=aClass1.getSuperclass();
        System.out.println(aClass5.hashCode());

        System.out.println("=================");

        //可以由Class对象的类型
        Class aClass0=Object.class;//class类
        Class aClass01=Comparable.class;//接口类型
        Class aClass02=String[].class;//一维数组
        Class aClass03=int[][].class;//二维数组
        Class aClass04=Override.class;//注解类型
        Class aClass05= ElementType.class;//枚举类型
        Class aClass06=Integer.TYPE;//基本数据类型
        Class aClass07=void.class;//void类型
        Class aClass08=Class.class;//Class类型

        System.out.println(aClass0);
        System.out.println(aClass01);
        System.out.println(aClass02);
        System.out.println(aClass03);
        System.out.println(aClass04);
        System.out.println(aClass05);
        System.out.println(aClass06);
        System.out.println(aClass07);
        System.out.println(aClass08);

        System.out.println("----------------");
        //只要元素类型和维度一样，就是同一个Class
        int[] a=new int[10];
        int[] b=new int[100];
        System.out.println(a.getClass().hashCode());
        System.out.println(b.getClass().hashCode());
        int[][] aa=new int[10][];
        int[][] bb=new int[100][];
        System.out.println(aa.getClass().hashCode());
        System.out.println(bb.getClass().hashCode());





    }
}

class Person implements Serializable,Runnable{
    public String name;
    private int id;
    private int age;

    public Person() {

    }

    public Person(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                '}';
    }

    @Override
    public void run() {

    }
}

class Student extends Person{
    public Student() {
        this.name="学生";
    }
}

class Teacher extends Person{
    public Teacher(){
        this.name="老师";
    }
}
