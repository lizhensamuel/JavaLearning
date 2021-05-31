package swing.jframe;


import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Demo extends JFrame{//让Demo类也成为一个窗体
    public Demo(){//推荐这种初始化方式
        setVisible(true);//设置窗体可见
        setTitle("窗体标题");//设置窗体标题
        /**
         * 窗体关闭规则
         * EXIT_ON_CLOSE:隐藏窗口并停止程序
         * DO_NOTHING_ON_CLOSE:无任何操作
         * HIDE_ON_CLOSE:隐藏窗体但不停止程序
         * DISPOSE_ON_CLOSE:释放窗体资源
         */
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(300,300);//设置窗体大小，单位：像素
        setLocation(200,200);//设置坐标，单位：像素
        setBounds(200,200,300,300);//设置窗体坐标和大小，单位：像素
        Toolkit toolkit=Toolkit.getDefaultToolkit();
        Image i=toolkit.getImage("Swing\\images\\口罩.jpg");
        setIconImage(i);

        Container c=getContentPane();//获取窗体容器
        c.setBackground(Color.white);//设置背景颜色
        JLabel l=new JLabel("这是一个窗体");
        c.add(l);//添加组件
//        c.remove(l);//删除组件
        c.validate();//验证容器中的组件，相当于刷新
//        setContentPane(c);//重新载入容器，也能起到刷新作用，刷新推荐用validate()方法。

        setResizable(false);//设置窗体是否可以改变大小
//        getX();//获取横坐标
//        getY();//获取纵坐标

    }


    public static void main(String[] args) {
//        JFrame f=new JFrame("窗体标题");//创建窗体对象
//        f.setVisible(true);//设置窗体可见
//        /**
//         * 窗体关闭规则
//         * EXIT_ON_CLOSE:隐藏窗口并停止程序
//         * DO_NOTHING_ON_CLOSE:无任何操作
//         * HIDE_ON_CLOSE:隐藏窗体但不停止程序
//         * DISPOSE_ON_CLOSE:释放窗体资源
//         */
//        f.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
//        f.setSize(300,300);//设置窗体大小，单位：像素
//        f.setLocation(200,200);//设置坐标，单位：像素
//        f.setBounds(200,200,300,300);//设置窗体坐标和大小，单位：像素
//
//        Container c=f.getContentPane();//获取窗体容器
//        c.setBackground(Color.white);//设置背景颜色
//        JLabel l=new JLabel("这是一个窗体");
//        c.add(l);//添加组件
//        c.remove(l);//删除组件
//        c.validate();//验证容器中的组件，相当于刷新
//        f.setContentPane(c);//重新载入容器，也能起到刷新作用，刷新推荐用validate()方法。
//
//        f.setResizable(false);//设置窗体是否可以改变大小
//        f.getX();//获取横坐标
//        f.getY();//获取纵坐标


        new Demo();
    }
}
