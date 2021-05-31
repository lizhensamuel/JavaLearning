package swing.layout;

import javax.swing.*;
import java.awt.*;


public class MyFlowLayout extends JFrame {
    public MyFlowLayout(){
        setBounds(100,100,300,200);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Container c=getContentPane();
        c.setLayout(new FlowLayout(FlowLayout.RIGHT/*LEFT,RIGHT,CENTER,左对齐，右对齐，居中对齐。*/
        ,20/*水平间距*/,20/*垂直间距*/

        ));//给容器设置流布局。

        for(int i=0;i<10;i++){
            c.add(new JButton("按钮"+i));//循环添加按钮组件
        }


        setVisible(true);
    }

    public static void main(String[] args) {
        new MyFlowLayout();
    }
}
