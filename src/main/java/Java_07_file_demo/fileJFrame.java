package Java_07_file_demo;

import javax.swing.*;
import java.awt.*;

public class fileJFrame {
    public static void main(String[] args) {

    }
}
/*
* 定义一个界面,选择路径,并新建一个文件
* */
class myJframe extends JFrame
{
    public myJframe()
    {
        Container container = getContentPane();

        setLayout(new BorderLayout());
        JPanel jp1 = new JPanel();

        //初始化
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        setBounds(100,100,200,300);

    }
}
class myJcombo extends AbstractListModel<String> implements ComboBoxModel<String>
{
    String[] path = null;
    public myJcombo()
    {

    }

    @Override
    public void setSelectedItem(Object anItem) {

    }

    @Override
    public Object getSelectedItem() {
        return null;
    }

    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public String getElementAt(int index) {
        return null;
    }
}