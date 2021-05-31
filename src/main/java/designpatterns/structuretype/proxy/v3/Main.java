package   designpatterns.structuretype.proxy.v3;


import java.util.Random;

/**
 * @author: Samuel
 * @date: 2021-05-17 9:31
 * 问题：想要记录坦克的移动时间
 * 最简单的办法：修改代码，记录时间
 * 如果不能改变源码呢？
 * 使用继承？
 */
public class Main {
    public static void main(String[] args) {
        new Tank2().move();
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

class Tank2 extends Tank{
    @Override
    public void move() {
        long start=System.currentTimeMillis();
        super.move();
        long end=System.currentTimeMillis();
        System.out.println(end-start);
    }
}
