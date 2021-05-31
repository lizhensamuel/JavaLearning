package designpatterns.creationtype.factory_method;

/**
 * @author: Samuel
 * @date: 2021-05-13 19:03
 * 用该工厂可以实现任意定制交通工具和任意d;定制生产过程
 *
 */
public class CarFactory {
    public Moveable create() {
        System.out.println("a car created!");
        return new Car();
    }
}
