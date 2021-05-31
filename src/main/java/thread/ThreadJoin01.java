package   thread;

//测试join
public class ThreadJoin01 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("线程vip来了"+i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        //启动自己的线程
        ThreadJoin01 threadJoin01=new ThreadJoin01();
        Thread thread=new Thread(threadJoin01);
        thread.start();

        //主线程
        for (int i = 0; i < 500; i++) {
            if(i==200){
                thread.join();//插队
            }
            System.out.println("mian"+i);
        }

    }
}
