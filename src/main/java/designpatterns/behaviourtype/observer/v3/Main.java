package   designpatterns.behaviourtype.observer.v3;

/**
 * @author: Samuel
 * @date: 2021-05-16 19:13
 *
 * 加入观察者
 */
public class Main {
    public static void main(String[] args) {
        Child c=new Child();
        c.wakeUp();
    }
}

class Child{
    private boolean cry=false;
    private Dad d=new Dad();

    public boolean isCry(){return cry;}
    public void wakeUp(){
        cry=true;
        d.feed();
    }
}

class Dad{
    public void feed(){
        System.out.println("dad feeding...");
    }
}