package swing.layout;

import sun.nio.cs.ext.GB18030;

import javax.swing.*;
import java.awt.*;

public class MyGridBagLayout {
    JFrame f = new JFrame();//主窗体
    Container c;//主容器

    void createFrame() {
        c = f.getContentPane();
        c.setLayout(new GridBagLayout());
        f.setSize(800, 600);
        f.setLocationRelativeTo(null);//默认居中
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    void init() {
        GridBagConstraints g1 = new GridBagConstraints();
        g1.gridx = 0;
        g1.gridy = 0;
        c.add(new JButton("组件1"), g1);

        GridBagConstraints g2 = new GridBagConstraints();
        g2.gridx = 1;
        g2.gridy = 1;
        c.add(new JButton("组件2"), g2);

        GridBagConstraints g3 = new GridBagConstraints();
        g3.gridx = 2;
        g3.gridy = 2;
        c.add(new JButton("组件3"), g3);


    }

    void createButton() {
        for (int i = 0; i < 9; i++) {
            GridBagConstraints g1 = new GridBagConstraints();
            g1.gridx = i;
            g1.gridy = 0;
            c.add(new JButton("组件"), g1);

            GridBagConstraints g2 = new GridBagConstraints();
            g2.gridx = 0;
            g2.gridy = i;
            c.add(new JButton("组件"), g2);
        }
    }

    void init2() {
        GridBagConstraints g1 = new GridBagConstraints();
        g1.gridx = 1;
        g1.gridy = 1;
        c.add(new JButton("组件1"), g1);

        GridBagConstraints g2 = new GridBagConstraints();
        g2.gridx = 2;
        g2.gridy = 2;
        g2.gridwidth = 2;
        g2.gridheight = 1;
        c.add(new JButton("组件2"), g2);

        GridBagConstraints g3 = new GridBagConstraints();
        g3.gridx = 4;
        g3.gridy = 4;
        g3.gridwidth = 2;
        g3.gridheight = 2;
        c.add(new JButton("组件3"), g3);
    }

    void init3() {
        GridBagConstraints g1 = new GridBagConstraints();
        g1.gridx = 1;
        g1.gridy = 1;
        g1.gridwidth = 2;
        g1.gridheight = 2;
        g1.fill = GridBagConstraints.NONE;//默认
        c.add(new JButton("none"), g1);

        GridBagConstraints g2 = new GridBagConstraints();
        g2.gridx = 3;
        g2.gridy = 1;
        g2.gridwidth = 2;
        g2.gridheight = 2;
        g2.fill = GridBagConstraints.HORIZONTAL;//水平填充
        c.add(new JButton("horizontal"), g2);

        GridBagConstraints g3 = new GridBagConstraints();
        g3.gridx = 5;
        g3.gridy = 1;
        g3.gridwidth = 2;
        g3.gridheight = 2;
        g3.fill = GridBagConstraints.VERTICAL;//垂直填充
        c.add(new JButton("vertical"), g3);

        GridBagConstraints g4 = new GridBagConstraints();
        g4.gridx = 7;
        g4.gridy = 1;
        g4.gridwidth = 2;
        g4.gridheight = 2;
        g4.fill = GridBagConstraints.BOTH;//上下左右都填充
        c.add(new JButton("both"), g4);
    }

    void init4() {
        GridBagConstraints g1 = new GridBagConstraints();
        g1.gridx = 1;
        g1.gridy = 1;
        g1.gridwidth = 2;
        g1.gridheight = 2;
//        g1.anchor=GridBagConstraints.NORTH;
//        g1.anchor=GridBagConstraints.SOUTH;
//        g1.anchor=GridBagConstraints.EAST;
//        g1.anchor=GridBagConstraints.WEST;
//        g1.anchor=GridBagConstraints.NORTHEAST;
//        g1.anchor=GridBagConstraints.NORTHWEST;
//        g1.anchor=GridBagConstraints.SOUTHEAST;
        g1.anchor = GridBagConstraints.SOUTHWEST;
        c.add(new JButton("@"), g1);

        g1.fill = GridBagConstraints.BOTH;
        g1.anchor = GridBagConstraints.CENTER;
        JPanel p = new JPanel();
        p.setBackground(Color.GREEN);
        c.add(p, g1);
    }

    void init5() {
        GridBagConstraints g1 = new GridBagConstraints();
        g1.gridx = 1;
        g1.gridy = 1;
        g1.gridwidth = 2;
        g1.gridheight = 2;
        g1.insets = new Insets(5, 10, 5, 10);//上左下右
        c.add(new JButton("none"), g1);
    }

    void init6() {
        GridBagConstraints g1 = new GridBagConstraints();
        g1.gridx = 2;
        g1.gridy = 2;
        g1.ipadx = 10;
        g1.ipady = 10;
        c.add(new JButton("组件"), g1);

        GridBagConstraints g2 = new GridBagConstraints();
        g2.gridx = 4;
        g2.gridy = 2;
        g1.ipadx = -10;
        g1.ipady = -10;
        c.add(new JButton("组件"), g2);
    }

    void init7(){
        GridBagConstraints g1 = new GridBagConstraints();
        g1.gridx = 2;
        g1.gridy = 2;
        g1.weightx=10;
        g1.weighty=10;
        c.add(new JButton("组件"), g1);
    }

    public static void main(String[] args) {
        MyGridBagLayout m = new MyGridBagLayout();
        m.createFrame();
        m.createButton();
//        m.init();
//        m.init2();
//        m.init3();
//        m.init4();
//        m.init5();
//        m.init6();
        m.init7();
        m.f.setVisible(true);
    }
}
