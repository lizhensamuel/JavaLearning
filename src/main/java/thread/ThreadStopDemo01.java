package   thread;
//到底出了什么问题????????????!!!!!!!!!!!!!!!!!!
public class ThreadStopDemo01 {
    public static void main(String[] args) {
        Hello hello=new Hello();
        new Thread(hello).start();

//        for (int i = 10; i > 0; i--) {
//            System.out.println(i);
//        }
        hello.running=false;

    }
}

class Hello implements Runnable{
    public boolean running=true;

    @Override
    public void run() {
        while (running){
            System.out.println("hello!");
        }

    }
}
