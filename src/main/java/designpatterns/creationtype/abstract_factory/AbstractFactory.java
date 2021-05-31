package  designpatterns.creationtype.abstract_factory;

/**
 * @author: Samuel
 * @date: 2021-05-13 19:34
 */
public abstract class AbstractFactory {
    abstract Food createFood();
    abstract Vehicle createVehicle();
    abstract Weapon createWeapon();
}
