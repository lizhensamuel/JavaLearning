package   designpatterns.behaviourtype.mediator;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author: Samuel
 * @date: 2021-05-16 16:28
 * 构建一个简易的订餐选择系统：
 * 1.有4个支持多选的选框
 * 2."选择全部"按钮
 * 3."取消所选"按钮
 * 4."反选"按钮
 * 其复杂之处在于：
 * 1.当多选框变化时，它会影响”选择全部”和“取消所有”按钮的状态（是否可点击）
 * 2.当用户点击某个按钮时，例如“反选”，除了会影响多选框的状态，它又可能影响“选择全部”和“取消所有”按钮的状态
 * 可以通过引入中介，将多方会谈转换成两方会谈
 */
public class MediatorDemo {
    public static void main(String[] args) {
        new OrderFrame("汉堡","薯条","可乐","奶茶","鸡肉卷");
    }
}

class OrderFrame extends JFrame {
    public OrderFrame(String... names){
        setTitle("点餐");
        setSize(460,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c=getContentPane();
        c.setLayout(new FlowLayout(FlowLayout.LEADING,20,20));
        c.add(new JLabel("使用中介设计模式"));
        List<JCheckBox> checkboxList=addCheckBox(names);
        JButton selectAll=addButton("全选");
        JButton selectNone=addButton("取消全选");
        selectNone.setEnabled(false);
        JButton selectIverse=addButton("反选");
        new Mediator(checkboxList,selectAll,selectNone,selectIverse);
        setVisible(true);

    }

    private List<JCheckBox> addCheckBox(String... names){
        JPanel panel=new JPanel();
        panel.add(new JLabel("菜单"));
        List<JCheckBox> list=new ArrayList<>();
        for(String name:names){
            JCheckBox checkbox=new JCheckBox(name);
            list.add(checkbox);
            panel.add(checkbox);
        }
        getContentPane().add(panel);
        return list;
    }

    private JButton addButton(String label){
        JButton button=new JButton(label);
        getContentPane().add(button);
        return button;
    }

}
