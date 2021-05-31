package designpatterns.creationtype.factory_method;

/**
 * @author: Samuel
 * @date: 2021-05-13 19:13
 */
public class BikeFactory {
    public Moveable create(){
        System.out.println("a bike created!");
        return new Bike();
    }
}
