package   designpatterns.behaviourtype.observer.v9;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author: Samuel
 * @date: 2021-05-16 20:16
 */
public class TestFrame extends Frame {
    public static void main(String[] args) {
        new TestFrame().launch();
    }
    public void launch(){
        java.awt.Button b=new java.awt.Button("press me");
        b.addActionListener(new MyActionListener());
        b.addActionListener(new MyActionListener2());
        this.add(b);
        this.pack();

        this.setLocation(400,400);
        this.setVisible(true);
    }

    //观察者1
    private class MyActionListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            System.out.println("button pressed!");
        }
    }
    //观察者2
    private class MyActionListener2 implements ActionListener{
        public void actionPerformed(ActionEvent e){
            System.out.println("button pressed2!");
        }
    }
}
