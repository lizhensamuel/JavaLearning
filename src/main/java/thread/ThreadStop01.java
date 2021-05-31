package   thread;

/**
 * 测试停止线程
 * 1.建议线程正常停止--->利用次数，不建议死循环
 * 2.建议使用标志位--->设置一个标志位
 * 3.不要使用stop或者destroy等过时或JDK不建议使用的方法
 */
public class ThreadStop01 implements Runnable{

    //1.设置一个标志位
    private boolean flag=true;

    @Override
    public void run() {
        int i=0;
        while(flag){
            System.out.println("run.....Thread"+i++);
        }
    }

    //2.设置一个公开的方法停止线程，转换标志位
    public void stop(){
        this.flag=false;
    }

    public static void main(String[] args) {
        ThreadStop01 threadStop01=new ThreadStop01();

        new Thread(threadStop01).start();

        for (int i = 0; i < 10000; i++) {
            System.out.println("main"+i);
            if(i==900){
                //调用自己写的stop方法，转换标志位，让线程自己停止
                threadStop01.stop();
                System.out.println("线程停止！！！");
            }
        }
    }
}
