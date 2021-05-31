package   thread;

//多个线程同时操作同一个对象
public class ThreadTest02 implements Runnable{

    private int ticketNum=10;

    @Override
    public void run() {
        while (true){
            if(ticketNum<=0){
                break;
            }
            //模拟延时
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"--->拿到了第"+ticketNum--+"张票");

        }
    }

    public static void main(String[] args) {
        ThreadTest02 threadTest02=new ThreadTest02();
        new Thread(threadTest02,"张三").start();
        new Thread(threadTest02,"李四").start();
        new Thread(threadTest02,"黄牛").start();
    }
}
