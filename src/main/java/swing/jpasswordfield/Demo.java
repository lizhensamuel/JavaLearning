package swing.jpasswordfield;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Demo extends JFrame {
    public Demo(){
        setBounds(100,100,300,100);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        setLayout(new FlowLayout());
//        JPasswordField jp=new JPasswordField(20);
        JPasswordField jp=new JPasswordField();
        jp.setColumns(20);//设置密码框长度
//        jp.setFont(new Font("Arial",Font.BOLD,18));
        jp.setEchoChar('$');//设置回显字符

        jp.addActionListener(new ActionListener() {//添加动作监听，在密码框中是回车
            @Override
            public void actionPerformed(ActionEvent e) {
                char[] ch=jp.getPassword();//获取密码的字符数组
                System.out.println(new String(ch));
            }
        });
        add(jp);



        setVisible(true);
    }

    public static void main(String[] args) {
        new Demo();
    }
}
