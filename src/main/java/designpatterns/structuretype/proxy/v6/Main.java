package   designpatterns.structuretype.proxy.v6;


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
 */
public class Main {
    public static void main(String[] args) {
        Tank tank=new Tank();

        //reflection 通过二进制字节码分析类的属性和方法

        Movable m=(Movable) Proxy.newProxyInstance(Tank.class.getClassLoader(),
                new Class[]{Movable.class},
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("method"+method.getName()+"start...");
                        Object o=method.invoke(tank,args);
                        System.out.println("method"+method.getName()+"end!");
                        return o;
                    }
                }
        );

        m.move();
    }
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

interface Movable{
    void move();
}

