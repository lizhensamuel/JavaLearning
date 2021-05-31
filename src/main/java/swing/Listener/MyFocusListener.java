package swing.Listener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class MyFocusListener extends JFrame {
    public MyFocusListener() {
        setBounds(100, 100, 200, 300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


        JPanel contentPane = new JPanel();
        contentPane.setLayout(null);
        add(contentPane);

        JTextField jt1 = new JTextField(10);
        jt1.setBounds(10, 10, 66, 21);
        contentPane.add(jt1);

        JTextField jt2 = new JTextField(10);
        jt2.setBounds(10, 41, 66, 21);
        contentPane.add(jt2);

        JTextField jt3 = new JTextField(10);
        jt3.setBounds(10, 72, 66, 21);
        contentPane.add(jt3);


        jt1.addFocusListener(new MyFocusListener2());//使用自定义的监听实现类
        jt2.addFocusListener(new MyFocusListener2());//使用自定义的监听实现类
        jt3.addFocusListener(new MyFocusListener2());//使用自定义的监听实现类

        setVisible(true);
    }

    class MyFocusListener2 implements FocusListener {//自定义的焦点监听实现类

        @Override
        public void focusGained(FocusEvent e) {
            JTextField tmp = (JTextField) e.getSource();//获取触发事件的组件
            tmp.setBorder(BorderFactory.createLineBorder(Color.GREEN));//给获取焦点的文本框设置绿色边框

        }

        @Override
        public void focusLost(FocusEvent e) {
            JTextField tmp = (JTextField) e.getSource();//获取触发事件的组件
            tmp.setBorder(BorderFactory.createLineBorder(Color.RED));//给失去焦点的文本框设置红色边框
        }
    }

    public static void main(String[] args) {
        new MyFocusListener();
    }
}
