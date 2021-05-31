package   designpatterns.behaviourtype.strategy;

/**
 * @author: Samuel
 * @date: 2021-05-13 15:42
 */
public class DogComparator implements MyComparator<Dog>{

    @Override
    public int compare(Dog t1, Dog t2) {
        if(t1.food<t2.food) return -1;
        else if(t1.food>t2.food) return 1;
        else return 0;
    }
}
