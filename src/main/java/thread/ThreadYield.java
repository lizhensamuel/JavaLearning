package   thread;

//测试线程礼让
//礼让不一定成功，看cpu情况
public class ThreadYield {
    public static void main(String[] args) {
        MyYield myYield=new MyYield();

        new Thread(myYield,"a").start();
        new Thread(myYield,"b").start();
    }

}

class MyYield implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"线程开始执行");
        Thread.yield();//线程礼让
        System.out.println(Thread.currentThread().getName()+"线程停止执行");
    }
}
