package   thread;

/**
 * 创建线程的方法二：实现Runnable接口
 * 1.实现runnable接口，重写run方法
 * 2.将执行线程丢入runnable接口实现类
 * 3.调用start()方法
 */
public class ThreadCreate02 implements Runnable{

    //run方法线程体
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("我在看代码---"+i);
        }
    }

    public static void main(String[] args) {
        //创建runnable接口实现类对象
        ThreadCreate02 threadCreate02 =new ThreadCreate02();

        //创建线程对象，通过线程对象来开启我们的线程，代理
        Thread thread=new Thread(threadCreate02);
        //启动线程
        thread.start();
        //以上两行代码可以简写成
        //new Thread(threadDemo02).start();

        for (int i = 0; i < 1000; i++) {
            System.out.println("我在学习多线程---"+i);
        }
    }
}
