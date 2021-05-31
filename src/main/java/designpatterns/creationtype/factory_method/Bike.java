package designpatterns.creationtype.factory_method;

/**
 * @author: Samuel
 * @date: 2021-05-13 18:56
 */
public class Bike implements Moveable {
    @Override
    public void go() {
        System.out.println("bike go...");
    }
}
