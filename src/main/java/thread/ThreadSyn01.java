package   thread;

//不安全的买票
public class ThreadSyn01 {

    public static void main(String[] args) {
        BuyTicket buyTicket=new BuyTicket();

        new Thread(buyTicket,"张三").start();
        new Thread(buyTicket,"李四").start();
        new Thread(buyTicket,"黄牛").start();
    }
}

class BuyTicket implements Runnable{

    private int ticketNums=10;
    boolean flag=true;//外部停止方式

    @Override
    public void run() {
        while (flag){
            try {
                buy();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    //synchronized同步方法，锁的是this
    private synchronized void buy() throws InterruptedException {
        //判断是否有票
        if(ticketNums<=0){
            flag=false;
            return;
        }
        //模拟延时
        Thread.sleep(100);

        //买票
        System.out.println(Thread.currentThread().getName()+"拿到了票"+ticketNums--);
    }
}
