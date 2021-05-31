package   designpatterns.behaviourtype.strategy;

/**
 * @author: Samuel
 * @date: 2021-05-13 15:46
 */
public class CatWeightComparator implements MyComparator<Cat>{
    @Override
    public int compare(Cat t1, Cat t2) {
        if(t1.weight<t2.weight) return -1;
        else if(t1.weight>t2.weight) return 1;
        else  return 0;
    }
}
