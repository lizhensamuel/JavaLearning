package swing.jcomobbox;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Demo extends JFrame {
    public Demo(){
        setBounds(100,100,190,120);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Container c=getContentPane();
        c.setLayout(null);

//        JComboBox<String> comboBox=new JComboBox()
//        comboBox.addItem("身份证");//向下拉列表添加数据
//        comboBox.addItem("学生证");
//        comboBox.addItem("工作证");

//        String items[]={"数组元素1","数组元素2","数组元素3"};
//        JComboBox<String> comboBox=new JComboBox(items);//使用String数组添加下拉列表元素

        JComboBox<String> comboBox=new JComboBox();
        String items[]={"身份证","学生证","工作证"};
        ComboBoxModel cm=new DefaultComboBoxModel(items);//创建下拉列表模型
        comboBox.setModel(cm);//向列表中添加数据模型

        JButton b=new JButton("打印");
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("选中的索引："+comboBox.getSelectedIndex());//获取选中的索引
                System.out.println("选中的值："+comboBox.getSelectedItem());//获取选中的值
            }
        });

        b.setBounds(100,10,60,20);
        c.add(b);

        comboBox.setEditable(true);//是否可以编辑

        comboBox.setBounds(10,10,80,31);
        c.add(comboBox);


        setVisible(true);
    }

    public static void main(String[] args) {
        new Demo();
    }
}
