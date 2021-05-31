package   thread;

/**
 * 第一种线程实现方法：
 * 1.自定义线程继承Thread类
 * 2.重写run()方法，编写线程体
 * 3.创建线程对象，调用start()方法启动线程
 */
public class ThreadCreate01 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 2000; i++) {
            System.out.println("执行自定义线程"+i);
        }
    }

    public static void main(String[] args) {
        ThreadCreate01 threadCreate01 =new ThreadCreate01();
        //线程开启后不一定立刻执行，由cpu调度执行
        threadCreate01.start();
        for (int i = 0; i < 2000; i++) {
            System.out.println("在main方法中执行"+i);
        }
    }
}

