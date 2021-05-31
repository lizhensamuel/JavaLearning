package swing.Listener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyButtonActionListener implements ActionListener {

        JPanel panel;
        JButton button;
        public static void main(String[] args) {
            MyButtonActionListener d = new MyButtonActionListener();
            d.go();
        }
        public void go() {
            JFrame frame = new JFrame();
            button = new JButton("红色");
            panel = new JPanel();
            panel.setSize(200,100);
            panel.add(button);
            button.addActionListener(this);//向按钮注册
            frame.setBackground(Color.red);
            frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            frame.add(panel);
            frame.setBounds(100, 200, 300, 300);
            frame.setVisible(true);
        }
        @Override
        public void actionPerformed(ActionEvent e) { //处理事件的方法
            if(e.getActionCommand()=="红色") {
                panel.setBackground(Color.red);
                button.setText("蓝色");
                //button.setEnabled(true);
            } else if(e.getActionCommand()=="蓝色") {
                panel.setBackground(Color.blue);
                button.setText("红色");
                //button.setEnabled(true);
            }
        }
}
