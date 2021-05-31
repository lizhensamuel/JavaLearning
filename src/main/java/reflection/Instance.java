package   reflection;


import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

//通过反射，动态地创建对象
public class Instance {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        //通过Class对象创建实例
        Person person0=new Person();
        Class c1=Class.forName("  reflection.Person");
        Person person=(Person) c1.newInstance();//实例化的类必须要无参构造器才行
        System.out.println(person0);
        System.out.println(person);

        System.out.println("==================");

        //通过构造器创建实例,此时可以没有无参构造器
        Constructor constructor=c1.getDeclaredConstructor(String.class,int.class,int.class);
        Person person1=(Person) constructor.newInstance("Samuel",10,10);
        System.out.println(person1);

        System.out.println("=================");

        //通过反射调用一个普通方法
        Person person2=(Person) c1.newInstance();
        Method setName=c1.getDeclaredMethod("setName", String.class);
        //invoke：激活
        //invoke(对象，“方法的值”)
        setName.invoke(person2,"敲里吗");
        System.out.println(person2.getName());

        System.out.println("================");

        //通过反射操作属性
        Person person3=(Person) c1.newInstance();
        Field name=c1.getDeclaredField("name");
        name.set(person3,"23333");//name是public 访问没问题
        System.out.println(person3.getName());

        //不能直接操作私有属性，操作私有属性需要关闭程序的安全检测即将属性或方法的setAccessible设置为true
        Field id=c1.getDeclaredField("id");
        id.setAccessible(true);//设置访问权限开启后，会提高运行效率但是会降低程序安全性
        id.set(person3,10);//id是private 直接访问会报错
        System.out.println(person3.getId());




    }
}

