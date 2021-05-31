package designpatterns.creationtype.factory_method;

/**
 * @author: Samuel
 * @date: 2021-05-13 17:33
 */
public class FactoryMethodDemo {
    public static void main(String[] args) {
        Moveable m=new CarFactory().create();
        m.go();
        m=new BikeFactory().create();
        m.go();
    }
}
