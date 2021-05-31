package   designpatterns.structuretype.proxy.v1;

import java.util.Random;

/**
 * @author: Samuel
 * @date: 2021-05-17 9:31
 * 问题：想要记录坦克的移动时间
 */
public class Main {
    public static void main(String[] args) {
        new Tank().move();
    }
}

class Tank implements Movable{
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
