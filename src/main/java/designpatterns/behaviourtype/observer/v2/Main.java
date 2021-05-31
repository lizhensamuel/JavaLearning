package   designpatterns.behaviourtype.observer.v2;

/**
 * @author: Samuel
 * @date: 2021-05-16 19:04
 * 使用面向对象，也是傻等
 */
public class Main {
    public static void main(String[] args) {
        Child child=new Child();
        while (!child.isCry()){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Observing...");
        }
    }
}

class Child{
    private boolean cry=false;
    public boolean isCry(){return cry;}

    public void wakeUp(){
        cry=true;
        System.out.println("WakeUp!Start cry!!!");
    }
}

