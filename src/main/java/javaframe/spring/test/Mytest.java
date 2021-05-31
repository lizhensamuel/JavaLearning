package javaframe.spring.test;

import javaframe.spring.bean.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: Samuel
 * @date: 2021-06-05 13:50
 * @description: javaframe.spring.test
 */
public class Mytest {
    public static void main(String[] args) {
        /**
         * ApplicationContext：表示IOC容器的入口，想要获取对象则必须创建该类
         * 该类有两个读取配置文件的实现类：
         * 1.ClassPathXmlApplicationContext:表示从classpath读取数据
         * 2.FileSystemXmlApplicationContext:表示从当前文件系统读取数据
         * PS:容器中的对象在容器创建完成后就已经把对象创建好了！
         */
        ApplicationContext context=new ClassPathXmlApplicationContext("ioc.xml");
        //获取具体的bean实例对象，需要进行强制类型转换
//        Person person =(Person) context.getBean("person");
        //通过id获取对象，该方法不需要强制类型转换
//        Person person1 = context.getBean("person3", Person.class);
//        System.out.println(person1);
        //通过类型获取对象,但如果存在一个以上相同类型的对象，将无法完成获取工作
//        Person person2 = context.getBean(Person.class);
//        System.out.println(person2);
        Person person3=context.getBean("person",Person.class);
        System.out.println(person3);

    }
}