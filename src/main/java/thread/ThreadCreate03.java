package   thread;

import java.util.concurrent.*;

/**
 * 线程创建方法三：实现Callalbe接口
 * 1.实现Callable接口，需要定义返回值
 * 2.重写call方法，需要抛出异常
 * 3.创建目标对象
 * 4.创建执行服务
 * 5.提交执行
 * 6.获取结果
 * 7.关闭服务
 * 好处：
 * 1.可以定义返回值
 * 2.可以抛出异常
 * */
public class ThreadCreate03 implements Callable<Boolean> {
    private String url;//网络图片地址
    private String name;//保存的文件名

    public ThreadCreate03(String url, String name){
        this.url=url;
        this.name=name;
    }

    @Override
    public Boolean call() throws Exception {
        WebDownloader webDownloader=new WebDownloader();
        webDownloader.downloader(url,name);
        System.out.println("下载了文件名为"+name);
        return true;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ThreadCreate03 t1=new ThreadCreate03("https://tse1-mm.cn.bing.net/th/id/OET.28391f9011eb4a1fb6f5efc93d12c233?w=272&h=135&c=7&rs=1&o=5&pid=1.9","1.jpg");
        ThreadCreate03 t2=new ThreadCreate03("https://tse1-mm.cn.bing.net/th/id/OET.0c1b35d21ce94cfcb19b41f3fdfa2d54?w=272&h=135&c=7&rs=1&o=5&pid=1.9","2.jpg");
        ThreadCreate03 t3=new ThreadCreate03("https://tse1-mm.cn.bing.net/th/id/OET.b43373f19dec45aaa61bd09fad4d1f40?w=272&h=135&c=7&rs=1&o=5&pid=1.9","3.jpg");

        //创建执行服务
        ExecutorService ser= Executors.newFixedThreadPool(3);

        //提交执行
        Future<Boolean> r1=ser.submit(t1);
        Future<Boolean> r2=ser.submit(t2);
        Future<Boolean> r3=ser.submit(t3);

        //获取结果
        boolean rs1=r1.get();
        boolean rs2=r2.get();
        boolean rs3=r3.get();

        System.out.println(rs1);
        System.out.println(rs2);
        System.out.println(rs3);

        //关闭服务
        ser.shutdownNow();
    }
}
