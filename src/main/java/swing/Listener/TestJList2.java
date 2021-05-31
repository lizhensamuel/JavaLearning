package swing.Listener;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;

/**
 * Created by Muil at 2020/4/30 20:25
 */

public class TestJList2 extends JFrame implements ListSelectionListener {
    JPanel p;
    JLabel jl;
    JList l;
    DefaultListModel model;

    public TestJList2(){
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(100,100,500,500);
        setVisible(true);
        p=new JPanel();
        jl=new JLabel();
        l=new JList();
        model=new DefaultListModel();
        add(p);
        p.add(jl);
        p.add(l);
        l.setModel(model);
        p.setBounds(100,100,300,300);
        p.setVisible(true);
        p.setBackground(Color.red);
        jl.setBounds(200,250,100,50);
        jl.setBackground(Color.blue);
        l.setBounds(200,200,100,100);
        l.setBackground(Color.black);
        l.addListSelectionListener(this);
        model.addElement(" ");
//        String[] data={"敲里吗","想屁吃","想桃子"};
//        for(String temp:data){
//            model.addElement(temp);
//        }

    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        if(l.equals(e.getSource())){
            jl.setText((String)(l.getSelectedValue()));
        }
    }

    public static void main(String[] args) {
        new TestJList2();
    }


}
