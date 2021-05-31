package   designpatterns.behaviourtype.observer.v4;

/**
 * @author: Samuel
 * @date: 2021-05-16 19:17
 * 加入多个观察者
 */
public class Main {
    public static void main(String[] args) {
        Child child=new Child();
        child.wakeUp();
    }
}

class Child{
    private boolean cry=false;
    private Dad dad=new Dad();
    private Mum mum=new Mum();
    private Dog dog=new Dog();

    public boolean isCry(){return cry;}

    public void wakeUp(){
        cry=true;
        dad.feed();
        dog.wang();
        mum.hug();
    }
}

class Dad{
    public void feed(){
        System.out.println("dad feeding...");
    }

}

class Mum{
    public void hug(){
        System.out.println("mum huging...");
    }
}

class Dog{
    public void wang(){
        System.out.println("dog wang...");
    }
}