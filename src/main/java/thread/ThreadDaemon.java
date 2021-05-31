package   thread;


//守护线程
public class ThreadDaemon {

    public static void main(String[] args) {
        You you=new You();
        God god=new God();

        Thread thread=new Thread(god);
        thread.setDaemon(true);//默认是false表示用户线程，正常线程都是用户线程
        thread.start();

        new Thread(you).start();
    }
}

class You implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 36500; i++) {
            System.out.println("开心地活着"+i);
        }
        System.out.println("==========你挂了！=========");
    }
}

class God implements Runnable{

    @Override
    public void run() {
        while (true) {
            System.out.println("上帝保佑着你");
        }
    }
}
