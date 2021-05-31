package swing.jlabel;

import javax.swing.*;
import java.awt.*;

public class Demo  extends JFrame {
    public Demo(){
        setBounds(100,100,200,100);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Container c=getContentPane();
        setVisible(true);

        JLabel l=new JLabel("这是一个标签");
//        l.setText("更改标签内容");
//        l.getText();//获取标签内容
        l.setFont(new Font("楷体",Font.BOLD,15));
        l.setForeground(Color.red);//更改前景色，即字体颜色
        c.add(l);
    }

    public static void main(String[] args) {
        new Demo();
    }
}
