package    designpatterns.creationtype.abstract_factory;

/**
 * @author: Samuel
 * @date: 2021-05-13 19:44
 */
public class MagicFactory extends AbstractFactory{
    @Override
    Food createFood() {
        return new Mushroom();
    }

    @Override
    Vehicle createVehicle() {
        return new Bike();
    }

    @Override
    Weapon createWeapon() {
        return new MagicStick();
    }
}
