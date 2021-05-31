package   thread;

//测试线程池

import java.util.concurrent.*;

public class ThreadPools {
    public static void main(String[] args) {

        //1.创建服务，创建线程池
        //newFixedThreadPool，参数为线程池大小
        ExecutorService service= Executors.newFixedThreadPool(10);
        service=Executors.newCachedThreadPool();//默认的动态调整线程数量的线程池
        //创建指定调整范围的动态调整线程池
        int min=4;
        int max=10;
        service=new ThreadPoolExecutor(min,max,60L, TimeUnit.SECONDS,new SynchronousQueue<Runnable>());
        //创建可反复执行任务的线程池
        ScheduledExecutorService ses=Executors.newScheduledThreadPool(4);
        //2.执行
        service.execute(new MyThread());
        service.execute(new MyThread());
        service.execute(new MyThread());
        service.execute(new MyThread());
        service.execute(new MyThread());

        //提交一次性任务,将会在指定延迟后只执行一次
        ses.schedule(new MyThread(),1,TimeUnit.SECONDS);

        //3秒后开始执行定时任务,每4秒执行一次(不论任务执行时间,固定每4秒执行一次)
        ses.scheduleAtFixedRate(new MyThread(),3,4,TimeUnit.SECONDS);

        //3秒后开始执行定时任务,间隔4秒执行一次(上一次任务完成后,等4秒再次执行)
        ses.scheduleWithFixedDelay(new MyThread(),3,4,TimeUnit.SECONDS);


        //3.关闭连接
        service.shutdown();
    }
}

class MyThread implements Runnable{

    @Override
    public void run() {

            System.out.println(Thread.currentThread().getName());

    }
}
