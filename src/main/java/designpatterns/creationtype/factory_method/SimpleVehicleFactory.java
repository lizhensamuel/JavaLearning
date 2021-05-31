package designpatterns.creationtype.factory_method;

/**
 * @author: Samuel
 * @date: 2021-05-13 18:58
 * 简单工厂实现了任意生产交通工具和任意定制生产过程
 * 但是简单工厂的可扩展性不好
 */
public class SimpleVehicleFactory {
    public Car createCar(){
        System.out.println("a car created!");
        return new Car();
    }

    public Bike createBike(){
        System.out.println("a bike created!");
        return new Bike();
    }


}
