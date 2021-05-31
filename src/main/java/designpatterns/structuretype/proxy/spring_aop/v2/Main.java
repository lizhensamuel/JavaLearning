package designpatterns.structuretype.proxy.spring_aop.v2;


import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
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
        ApplicationContext context=new ClassPathXmlApplicationContext("app_auto.xml");
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

@Aspect
class TimeProxy{
    @Before("execution(void designpatterns.structuretype.proxy.spring_aop.v2.Tank.move())")
    public void before(){
        System.out.println("method start..."+System.currentTimeMillis());
    }
    @After("execution(void designpatterns.structuretype.proxy.spring_aop.v2.Tank.move())")
    public void after(){
        System.out.println("method stop..."+System.currentTimeMillis());
    }
}
