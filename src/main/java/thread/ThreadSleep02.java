package   thread;

import java.text.SimpleDateFormat;
import java.util.Date;

//模拟倒计时
public class ThreadSleep02 {

    public static void main(String[] args) {
        //打印系统当前时间
        Date systemTime=new Date(System.currentTimeMillis());//获取系统当前时间
        while (true){
            try {
                Thread.sleep(1000);
                System.out.println(new SimpleDateFormat("HH:mm:ss").format(systemTime));
                systemTime=new Date(System.currentTimeMillis());//更新当前时间
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


    //模拟倒计时
    public static void tenDown() throws InterruptedException {
        int num=10;
        while (true){
            Thread.sleep(1000);
            System.out.println(num--);
            if(num<=0){
                break;
            }

        }
    }
}
