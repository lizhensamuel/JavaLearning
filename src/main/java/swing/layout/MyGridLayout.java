package swing.layout;

import javax.swing.*;
import java.awt.*;

public class MyGridLayout extends JFrame {
    public MyGridLayout(){
        setBounds(100,100,300,300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Container c=getContentPane();
        c.setLayout(new GridLayout(7,3,5,5));//设置为网格布局，7行3列，水平间距为5像素，垂直间距也是5像素

        for(int i=0;i<20;i++){
            c.add(new JButton("按钮"+i));
        }


        setVisible(true);
    }

    public static void main(String[] args) {
        new MyGridLayout();
    }
}
