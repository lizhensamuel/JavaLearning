package swing.jlist;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Demo extends JFrame {
    public Demo(){
        setBounds(100,100,250,150);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(null);

        String items[]={"元素1","元素2","元素3","元素4","元素5","元素6","元素7","元素8","元素9"};
//        JList<String> jl=new JList(items);



        DefaultListModel<String> model=new DefaultListModel<>();//列表框的数据模型
        for(String temp:items){
            model.addElement(temp);//向数据模型中添加元素
        }
        JList<String> jl=new JList();
        model.addElement("添加新元素");//数据模型添加新元素

        jl.setModel(model);//列表框载入数据模型

        /**
         * SINGLE_SELECTION:单选
         * SINGLE_INTERVAL_SELECTION:只能选择连续相邻的元素
         * MULTIPLE_INTERVAL_SELECTION:随便选
         */
        jl.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);//设置选择模式


        JScrollPane js=new JScrollPane(jl);//为列表框添加滚动条
        js.setBounds(10,10,100,100);
        add(js);

        JButton b=new JButton("确认");
        b.setBounds(120,90,70,25);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //获取列表框中选中的所有元素
                java.util.List<String> values=jl.getSelectedValuesList();
                for(String temp:values){
                    System.out.println(temp);
                }
                System.out.println("--------end-------");
            }
        });

        add(b);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Demo();
    }
}
