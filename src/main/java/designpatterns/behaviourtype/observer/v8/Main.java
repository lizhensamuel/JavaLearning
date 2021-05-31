package   designpatterns.behaviourtype.observer.v8;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Samuel
 * @date: 2021-05-16 19:37
 * 有很多时候，观察者需要根据事件的具体情况来进行处理
 * 大多时候，我们处理事件的时候，需要事件源对象
 * 事件也可以形成继承体系
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
        wakeUpEvent event=new wakeUpEvent(System.currentTimeMillis(),"bed",this);

        for(Observer o:observers){
            o.actionOnWakeUp(event);
        }
    }

}

interface Observer{
    void actionOnWakeUp(wakeUpEvent event);

}

abstract class Event<T>{
    abstract T getSource();
}

//事件类 fire Event
class wakeUpEvent extends Event<Child>{
    long timestamp;
    String loc;
    Child source;

    public wakeUpEvent(long timestamp,String loc,Child source){
        this.timestamp=timestamp;
        this.loc=loc;
        this.source=source;
    }

    @Override
    Child getSource() {
        return source;
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

