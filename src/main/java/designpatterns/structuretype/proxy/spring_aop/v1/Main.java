package designpatterns.structuretype.proxy.spring_aop.v1;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Random;

/**
 * @author: Samuel
 * @date: 2021-05-19 10:41
 * spring aop test
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("app.xml");
        Tank t=(Tank) context.getBean("tank");
        t.move();
    }
}

class Tank{
    public void move(){
        System.out.println("tank moving...");
        try {
            Thread.sleep(new Random().nextInt(10000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class TimeProxy{
    public void before(){
        System.out.println("method start..."+System.currentTimeMillis());
    }

    public void after(){
        System.out.println("method stop..."+System.currentTimeMillis());
    }
}
