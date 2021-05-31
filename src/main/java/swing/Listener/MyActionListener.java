package swing.Listener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyActionListener extends JFrame {
    public MyActionListener() {

        setBounds(100,100,500,300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        JPanel centerP = new JPanel();
        add(centerP);
        JPanel southP = new JPanel();

        JLabel console = new JLabel("动作显示面板");
        southP.add(console);
        add(southP, BorderLayout.SOUTH);

        JButton btn = new JButton("按钮");
        centerP.add(btn);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                console.setText("按钮被点击");
            }
        });




        JTextField jt = new JTextField(10);
        centerP.add(jt);
        jt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object obj=e.getSource();//这是动作事件捕捉的动作
                JTextField jttmp=(JTextField)obj;
                System.out.println(jttmp.getText());
                console.setText("文本框中按了回车");
            }
        });


        JCheckBox jc = new JCheckBox("多选框");
        centerP.add(jc);
        jc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                console.setText("多选框被点击了");
            }
        });


        JRadioButton jr = new JRadioButton("单选框");
        centerP.add(jr);
        jr.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                console.setText("单选框被点击了");
            }
        });


        String values[] = {"选项1", "选项2", "选项3"};
        JComboBox jb = new JComboBox(values);
        centerP.add(jb);
        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                console.setText("下拉列表被点击了");
            }
        });



        validate();//重新验证一下容器中的组件

    }

    public static void main(String[] args) {
        new MyActionListener();
    }
}
