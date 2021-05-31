package   thread;

//测试生产者消费者模式--->管程法
//生产者，消费者，产品，缓冲区
public class PC {

    public static void main(String[] args) {
        SynContainer synContainer=new SynContainer();

        new Producer(synContainer).start();
        new Consumer(synContainer).start();
    }
}

//生产者
class Producer extends Thread{
    SynContainer container;

    public Producer(SynContainer synContainer){
        this.container=synContainer;
    }

    //生产
    @Override
    public void run() {
        for (int i = 1; i < 100; i++) {
            System.out.println("生产了第"+i+"个产品");
            container.push(new Produce(i));
        }
    }
}

//消费者
class Consumer extends Thread{
    SynContainer container;

    public Consumer(SynContainer synContainer){
        this.container=synContainer;
    }
    //消费
    @Override
    public void run() {
        for (int i = 1; i < 100; i++) {
            System.out.println("消费了第"+container.pop().id+"个产品");
        }
    }
}

//产品
class Produce{
    int id;//产品编号

    public Produce(int id){
        this.id=id;
    }
}

//缓冲区
class SynContainer{
    //容器大小
    Produce[] produces=new Produce[10];
    //容器计数器
    int count=0;

    //生产者放入产品
    public synchronized void push(Produce produce){
        //如果容器满了，就需要等待消费者消费
        if(count==produces.length){
            //通知消费者消费，生产等待
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        //如果没有满，我们就需要丢入产品
        produces[count]=produce;
        count++;
        //通知消费者消费
        this.notifyAll();
    }


    //消费者消费产品
    public synchronized Produce pop(){
        //判断能否消费
        if(count==0){
            //等待生产者生产，消费者等待
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //如果可以消费
        count--;
        Produce produce=produces[count];

        //消费完了，通知生产者生产
        this.notifyAll();
        return produce;

    }


}
