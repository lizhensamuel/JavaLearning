package   thread;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;

//练习Thread，实现多线程同步下载图片
public class ThreadTest01 extends Thread{
    private String url;//图片地址
    private String name;//保存的文件名

    public ThreadTest01(String url, String name){
        this.url=url;
        this.name=name;
    }
    //下载图片的线程执行体
    @Override
    public void run() {
        WebDownloader webDownloader=new WebDownloader();
        webDownloader.downloader(url,name);
        System.out.println("下载了文件："+name);
    }

    public static void main(String[] args) {
        ThreadTest01 t1=new ThreadTest01("https://tse1-mm.cn.bing.net/th/id/OET.28391f9011eb4a1fb6f5efc93d12c233?w=272&h=135&c=7&rs=1&o=5&pid=1.9","1.jpg");
        ThreadTest01 t2=new ThreadTest01("https://tse1-mm.cn.bing.net/th/id/OET.0c1b35d21ce94cfcb19b41f3fdfa2d54?w=272&h=135&c=7&rs=1&o=5&pid=1.9","2.jpg");
        ThreadTest01 t3=new ThreadTest01("https://tse1-mm.cn.bing.net/th/id/OET.b43373f19dec45aaa61bd09fad4d1f40?w=272&h=135&c=7&rs=1&o=5&pid=1.9","3.jpg");
        //理想情况图片1、2、3按顺序依次下载
        t1.start();
        t2.start();
        t3.start();
        //结果是下载顺序每次都不同，说明是同时执行下载的

    }
}

//下载器
class WebDownloader{
    //下载方法
    public void downloader(String url,String name){
        try {
            FileUtils.copyURLToFile(new URL(url),new File(name));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("IO异常，downloader方法出现问题");
        }
    }
}

