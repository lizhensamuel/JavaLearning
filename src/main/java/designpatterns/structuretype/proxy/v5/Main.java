package   designpatterns.structuretype.proxy.v5;


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
 */
public class Main {
    public static void main(String[] args) {
        new TankLogProxy(
                new TankTimeProxy(
                        new Tank())
        ).move();
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

class TankTimeProxy implements Movable{
    Movable m;

    public TankTimeProxy(Movable m){
        this.m=m;
    }

    @Override
    public void move() {
        long start=System.currentTimeMillis();
        m.move();
        long end=System.currentTimeMillis();
        System.out.println("tank moved: "+(end-start)+" ms");
    }
}

class TankLogProxy implements Movable{
    Movable m;

    public TankLogProxy(Movable m){
        this.m=m;
    }

    @Override
    public void move() {
        System.out.println("tank start moving...");
        m.move();
        System.out.println("tank stoped!");
    }
}
