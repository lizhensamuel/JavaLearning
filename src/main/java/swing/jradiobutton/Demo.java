package swing.jradiobutton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Demo extends JFrame {
    public Demo(){
        setBounds(100,100,180,110);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        JRadioButton left=new JRadioButton("向左走");
        left.setSelected(true);//默认选中
        JRadioButton right=new JRadioButton("向右走");
        add(left);
        add(right);

        ButtonGroup group=new ButtonGroup();//按钮组
        group.add(left);
        group.add(right);

        JButton b=new JButton("打印");
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(left.getText()+"按钮选中状态："+left.isSelected());
                System.out.println(right.getText()+"按钮选中状态："+right.isSelected());
                group.clearSelection();//清空按钮组选项
            }
        });

        add(b);



        setVisible(true);
    }

    public static void main(String[] args) {
        new Demo();
    }
}
