package swing.Listener;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;

public class TestJList implements ListSelectionListener {
    JLabel label;
    JList l;
    DefaultListModel model;

    @Override
    public void valueChanged(ListSelectionEvent e) {
        if(e.getSource().equals(l)){
            label.setText("事件触发成功");
        }
    }

    public  void newSomething(){
        JFrame frame=new JFrame();
        l=new JList<>();
        label=new JLabel();
        model=new DefaultListModel();
        model.removeAllElements();
        model.addElement("敲里吗");
        model.addElement("想屁吃");
        model.addElement("想桃子");
        frame.setBounds(100,100,500,500);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLayout(new FlowLayout());
        l.setSize(100,100);
        l.setModel(model);
        l.addListSelectionListener(this);
        frame.add(l);
        frame.add(label);
    }

    public static void main(String[] args) {
        TestJList t=new TestJList();
        t.newSomething();
    }
}
