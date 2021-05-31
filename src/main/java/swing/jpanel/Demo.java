package swing.jpanel;

import javax.swing.*;
import java.awt.*;

public class Demo extends JFrame {
    public Demo(){
        setBounds(100,100,500,300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        setLayout(new GridLayout(2,2,10,10));

        JPanel p1=new JPanel();
        p1.setLayout(new GridLayout(1,3,10,10));
        JPanel p2=new JPanel(new BorderLayout());
        JPanel p3=new JPanel(new GridLayout(1,2,10,10 ));
        JPanel p4=new JPanel(new GridLayout(2,1,10,10));

        //添加边框
        p1.setBorder(BorderFactory.createTitledBorder("面板1"));//添加标题边框
        p2.setBorder(BorderFactory.createTitledBorder("面板2"));//添加标题边框
        p3.setBorder(BorderFactory.createTitledBorder("面板3"));//添加标题边框
        p4.setBorder(BorderFactory.createTitledBorder("面板4"));//添加标题边框

        p1.add(new JButton("p1"));
        p1.add(new JButton("p1"));
        p1.add(new JButton("p1"));
        p1.add(new JButton("p1"));
        p1.setBackground(Color.RED);

        p2.add(new JButton("p2"),BorderLayout.CENTER);
        p2.add(new JButton("p2"),BorderLayout.NORTH);
        p2.add(new JButton("p2"),BorderLayout.WEST);
        p2.add(new JButton("p2"),BorderLayout.EAST);
        p2.add(new JButton("p2"),BorderLayout.SOUTH);
        p2.setBackground(Color.BLUE);

        p3.add(new JButton("p3"));
        p3.add(new JButton("p3"));
        p3.setBackground(Color.YELLOW);

        p4.add(new JButton("p4"));
        p4.add(new JButton("p4"));
        p4.setBackground(Color.GREEN);

        add(p1);
        add(p2);
        add(p3);
        add(p4);


        setVisible(true);
    }

    public static void main(String[] args) {
        new Demo();
    }
}
