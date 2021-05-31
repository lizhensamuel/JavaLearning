package designpatterns.structuretype.proxy.v7;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Random;


/**
 * @author: Samuel
 * @date: 2021-05-17 9:31
 * 问题：想要记录坦克的移动时间
 * 最简单的办法：修改代码，记录时间
 * 如果不能改变源码呢？
 * 使用继承？继承增加了耦合，不好
 * 使用代理
 * 代理有各种类型
 * 问题：如何实现代理的各种组合？继承？装饰器？
 * 代理的对象改成Movable类型，越来越像装饰器模式
 * 如果有stop方法需要代理...
 * 如果想让LogPorxy可以重用，不仅可以代理Tank，还可以代理任何其他可以代理的类型(Object)，该怎么做
 * (日志记录，时间计算是很多地方都会用到的)
 * 分离代理行为与被代理对象
 * 使用JDK的动态代理
 * 横切代码与业务逻辑代码分离 AOP
 * 通过反射观察生成的代理对象
 * 还能用Instrument实现动态代理
 * JDK反射生成代理必须面向接口，这是由Proxy的内部实现决定的
 *
 *
 */
public class Main {
    public static void main(String[] args) {
        System.getProperties().put("jdk.proxy.ProxyGenerator.saveGeneratedFiles", "true");
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles","true");
        Tank tank=new Tank();

        //reflection 通过二进制字节码分析类的属性和方法
        Movable m=(Movable) Proxy.newProxyInstance(Tank.class.getClassLoader(),
                new Class[]{Movable.class},
                new TimeProxy(tank)
        );
        m.move();
    }
}

interface Movable{
    void move();
}

class Tank implements Movable {
    //模拟坦克移动了一段时间
    @Override
    public void move() {
        System.out.println("tank moving...");
        try {
            Thread.sleep(new Random().nextInt(10000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class TimeProxy implements InvocationHandler{
    Movable m;

    public TimeProxy(Movable m) {
        this.m = m;
    }

    public void before(){
        System.out.println("method start...");
    }

    public void after(){
        System.out.println("method stop...");
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object o=method.invoke(m,args);
        after();
        return o;
    }
}


