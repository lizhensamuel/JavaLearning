package   designpatterns.behaviourtype.mediator;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import java.awt.event.ActionEvent;
import java.util.List;

/**
 * @author: Samuel
 * @date: 2021-05-16 16:43
 */
public class Mediator {
    //引用UI组件
    private List<JCheckBox> checkBoxList;
    private JButton selectAll;
    private JButton selectNone;
    private JButton selectIverse;

    public Mediator(List<JCheckBox> checkBoxList,JButton selectAll,JButton selectNone,JButton selectIverse){
        this.checkBoxList=checkBoxList;
        this.selectAll=selectAll;
        this.selectNone=selectNone;
        this.selectIverse=selectIverse;

        //绑定事件
        this.checkBoxList.forEach(checkBox->{
            checkBox.addChangeListener(this::onCheckBoxChanged);
        });
        this.selectAll.addActionListener(this::onSelectAllClicked);
        this.selectNone.addActionListener(this::onSelectNoneClicked);
        this.selectIverse.addActionListener(this::onSelectInverseClicked);
    }

    //当checkbox有变化时
    public void onCheckBoxChanged(ChangeEvent event){
        boolean allChecked=true;
        boolean allUnchecked=true;
        for(JCheckBox checkBox:checkBoxList){
            if(checkBox.isSelected()){
                allUnchecked=false;
            }else {
                allChecked=false;
            }
        }
        selectAll.setEnabled(!allChecked);
        selectNone.setEnabled(!allUnchecked);
    }

    //当点击select all时
    public void onSelectAllClicked(ActionEvent event){
        checkBoxList.forEach(checkBox->checkBox.setSelected(true));
        selectAll.setEnabled(false);
        selectNone.setEnabled(true);
    }

    //当点击select none时
    public void onSelectNoneClicked(ActionEvent event){
        checkBoxList.forEach(checkBox->checkBox.setSelected(false));
        selectAll.setEnabled(true);
        selectNone.setEnabled(false);
    }

    //当点击select inverse时
    public void onSelectInverseClicked(ActionEvent event){
        checkBoxList.forEach(checkBox->checkBox.setSelected(!checkBox.isSelected()));
        onCheckBoxChanged(null);
    }


}
