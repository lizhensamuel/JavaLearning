package swing.layout;

import javax.swing.*;
import java.awt.*;

public class MyBorderLayout extends JFrame {
    public MyBorderLayout(){
        setBounds(100,100,350,200);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Container c=getContentPane();
        c.setLayout(new BorderLayout());//设置为边界布局
        JButton b1=new JButton("中"),
                b2=new JButton("东"),
                b3=new JButton("西"),
                b4=new JButton("南"),
                b5=new JButton("北");
        c.add(b1,BorderLayout.CENTER);//中部添加按钮
        c.add(b2,BorderLayout.EAST);//东部添加按钮
        c.add(b3,BorderLayout.WEST);//西部添加按钮
        c.add(b4,BorderLayout.SOUTH);//南部添加按钮
        c.add(b5,BorderLayout.NORTH);//北部添加按钮

        c.add(new JButton("覆盖"),BorderLayout.CENTER);//新组件会覆盖旧组件



        setVisible(true);
    }

    public static void main(String[] args) {
        new MyBorderLayout();
    }
}
