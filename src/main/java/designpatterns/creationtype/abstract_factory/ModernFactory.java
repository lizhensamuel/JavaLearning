package    designpatterns.creationtype.abstract_factory;

/**
 * @author: Samuel
 * @date: 2021-05-13 19:43
 */
public class ModernFactory extends AbstractFactory{
    @Override
    Food createFood() {
        return new Bread();
    }

    @Override
    Vehicle createVehicle() {
        return new Car();
    }

    @Override
    Weapon createWeapon() {
        return new Gun();
    }
}
