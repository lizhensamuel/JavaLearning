package swing.jtextarea;

import javax.swing.*;
import java.awt.*;

public class Demo extends JFrame {
    public Demo(){
        setBounds(0,0,300,300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(null);
//        JTextArea area=new JTextArea("这是文本域");
        JTextArea area=new JTextArea();
        area.setText("这是文本域");//设定文本内容
//        area.setRows(10);//设定行数
//        area.setColumns(10);//设定列数
        area.append(" 添加的内容");//添加内容
        area.insert("插入内容",10);//在第10个字符后处插入内容

        area.setFont(new Font("微软雅黑",Font.BOLD,15));
        //area.setBounds(0,0,280,300);
        area.setLineWrap(true);
//        area.setWrapStyleWord(true);

        JScrollPane js=new JScrollPane(area);
        js.setBounds(0,0,300,300);
        js.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        js.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);


        add(js);


        setVisible(true);
    }

    public static void main(String[] args) {
        new Demo();
    }
}
