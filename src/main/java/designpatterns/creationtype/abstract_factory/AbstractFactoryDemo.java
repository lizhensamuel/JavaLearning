package designpatterns.creationtype.abstract_factory;

/**
 * @author: Samuel
 * @date: 2021-05-13 19:18
 */
public class AbstractFactoryDemo {
    public static void main(String[] args) {
        AbstractFactory f = new ModernFactory();
        Vehicle car = f.createVehicle();
        car.go();
        Weapon gun = f.createWeapon();
        gun.shoot();
        Food bread = f.createFood();
        bread.printName();
    }
}
