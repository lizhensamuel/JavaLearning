package swing.jscrollpane;

import javax.swing.*;
import java.awt.*;

public class Demo extends JFrame {
    public Demo(){
        setBounds(300,300,500,500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        JTextArea jtr=new JTextArea(10,10);
        JScrollPane js=new JScrollPane(jtr);
        add(js);






        setVisible(true);
    }

    public static void main(String[] args) {
        new Demo();
    }
}
