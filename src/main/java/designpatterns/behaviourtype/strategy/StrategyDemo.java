package   designpatterns.behaviourtype.strategy;

import java.util.Arrays;

/**
 * @author: Samuel
 * @date: 2021-05-13 14:39
 *
 *
 */
public class StrategyDemo {
    public static void main(String[] args) {
        Cat[]a={new Cat(3,3),new Cat(4,4),new Cat(1,1)};
        //Dog[]a={new Dog(4),new Dog(3),new Dog(7),new Dog(9)};
        Sorter<Cat> sorter=new Sorter<>();
        sorter.sort(a,new CatHeightComparator());
        System.out.println(Arrays.toString (a));
    }
}
