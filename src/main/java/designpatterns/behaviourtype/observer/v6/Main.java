package   designpatterns.behaviourtype.observer.v6;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Samuel
 * @date: 2021-05-16 19:37
 * 将事件本身抽象成一个类
 */
public class Main {
    public static void main(String[] args) {

    }
}

class Child{
    private boolean cry=false;
    private List<Observer> observers=new ArrayList<>();

    {
        observers.add(new Dad());
        observers.add(new Mum());
        observers.add(new Dog());
    }

    public boolean isCry(){return cry;}

    public void wakeUp(){
        cry=true;
        wakeUpEvent event=new wakeUpEvent(System.currentTimeMillis(),"bad");

        for(Observer o:observers){
            o.actionOnWakeUp(event);
        }
    }

}

interface Observer{
    void actionOnWakeUp(wakeUpEvent event);

}

//事件类 fire Event
class wakeUpEvent{
    long timestamp;
    String loc;

    public wakeUpEvent(long timestamp,String loc){
        this.timestamp=timestamp;
        this.loc=loc;
    }
}

class Dad implements Observer{
    public void feed(){
        System.out.println("dad feeding...");
    }


    @Override
    public void actionOnWakeUp(wakeUpEvent event) {
        feed();
    }
}

class Mum implements Observer{
    public void hug(){
        System.out.println("mum huging...");
    }

    @Override
    public void actionOnWakeUp(wakeUpEvent event) {
        hug();
    }
}

class Dog implements Observer{
    public void wang(){
        System.out.println("dog wang...");
    }

    @Override
    public void actionOnWakeUp(wakeUpEvent event) {
        wang();
    }
}

