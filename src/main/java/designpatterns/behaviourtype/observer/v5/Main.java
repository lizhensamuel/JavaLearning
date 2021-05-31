package   designpatterns.behaviourtype.observer.v5;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Samuel
 * @date: 2021-05-16 19:24
 * 分离观察者与被观察者
 */
public class Main {

}

interface Observer{
    void actionOnWakeUp();
}

class Child{
    private boolean cry=false;
    private List<Observer> observers=new ArrayList<>();

    {//(为什么要括起来才能使用observers.add())？？？
        observers.add(new Dad());
        observers.add(new Mum());
        observers.add(new Dog());
    }

    public boolean isCry(){return cry;}

    public void wakeUp(){
        cry=true;
        for(Observer o:observers){
            o.actionOnWakeUp();
        }
    }

}

class Dad implements Observer{
    @Override
    public void actionOnWakeUp() {
        System.out.println("dad feeding...");
    }
}

class Mum implements Observer{
    @Override
    public void actionOnWakeUp() {
        System.out.println("mum huging...");
    }
}

class Dog implements Observer{
    @Override
    public void actionOnWakeUp() {
        System.out.println("dog wang...");
    }
}
