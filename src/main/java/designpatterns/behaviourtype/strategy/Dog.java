package   designpatterns.behaviourtype.strategy;

/**
 * @author: Samuel
 * @date: 2021-05-13 15:12
 */
public class Dog implements MyComparable<Dog>{
    int food;

    public Dog(int food){
        this.food=food;
    }

    @Override
    public int compareTo(Dog d) {
        if(this.food<d.food) return -1;
        else if(this.food>d.food) return 1;
        else return 0;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "food=" + food +
                '}';
    }
}
