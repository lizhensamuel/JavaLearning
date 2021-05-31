package swing.image;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class Demo extends JFrame {
    public Demo(){
        setBounds(100,100,500,350);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Container c=getContentPane();

        JLabel l=new JLabel("这是一个展示图片的标签");//使用标签展示图片
        //以“/”开头表示从项目根路径下去获取文件即classPath目录，不以“/”开头的表示以该类对象所在位置为根路径来进行查找，即.class文件所在目录。
//        URL url=Demo.class.getResource("/images/口罩.jpg");//获取图片url路径
//        Icon icon=new ImageIcon(url);//获取相应路径下的图片文件
        Icon icon=new ImageIcon("Swing/images/口罩.jpg");//默认从项目根路径开始，获取相应路径下的图片文件
        l.setIcon(icon);//添加图片
//        l.setSize(20,20);//设定标签大小,不会改变图片大小。
        c.add(l);


        setVisible(true);
    }

    public static void main(String[] args) {
        new Demo();
    }
}
