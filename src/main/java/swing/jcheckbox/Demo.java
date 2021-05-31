package swing.jcheckbox;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Demo extends JFrame {
    public Demo(){
        setBounds(100,100,180,110);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        JCheckBox c1=new JCheckBox("1");
        JCheckBox c2=new JCheckBox("2");
        JCheckBox c3=new JCheckBox("3");

        add(c1);
        add(c2);
        add(c3);

        c1.setSelected(true);//默认选中

        JButton b=new JButton("打印");
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(c1.getText()+"选中状态为："+c1.isSelected());
                System.out.println(c2.getText()+"选中状态为："+c2.isSelected());
                System.out.println(c3.getText()+"选中状态为："+c3.isSelected());
            }
        });

        add(b);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Demo();
    }
}
