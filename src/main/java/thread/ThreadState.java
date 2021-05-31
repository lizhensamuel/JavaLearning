package   thread;

//观察线程状态
public class ThreadState {
    public static void main(String[] args) throws InterruptedException {
        Thread thread=new Thread(()->{
            for (int i = 0; i < 5; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("....................");
            }
        });

        //观察启动前状态状态
        Thread.State state=thread.getState();
        System.out.println(state);//NEW

        //观察启动后状态
        thread.start();
        state=thread.getState();
        System.out.println(state);

        while (state!= Thread.State.TERMINATED){//只要线程不终止，就一直输出线程状态
            Thread.sleep(100);
            state=thread.getState();//更新状态
            System.out.println(state);//输出状态
        }


    }
}
