package swing.jtextfield;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Demo extends JFrame {
    public Demo(){
        setBounds(10,10,250,100);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

//        JTextField jt=new JTextField(20);
//        JTextField jt=new JTextField("23333");
        JTextField jt=new JTextField();
        jt.setColumns(20);//设置文本框长度，20个字符。
        jt.setText("2333");//设置初始文本
        jt.setFont(new Font("黑体",Font.PLAIN,20));//设置字体格式
        add(jt);

        JButton b=new JButton("确认");
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("获取文本框中的值："+jt.getText());//获取文本框中的文本值
                jt.setText("");//清空内容
                jt.requestFocus();//获取焦点，即获取光标
            }
        });
        add(b);


        setVisible(true);
    }

    public static void main(String[] args) {
        new Demo();
    }
}
