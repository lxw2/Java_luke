package Java_04_Date_tran;

import javax.swing.*;
import java.awt.*;

public class JLabelinJTextArea {
    public static void main(String[] args) {
        new myJText();
    }
}
//创建一个text文本区域,存放一块不可编辑的文本区域
class myJText extends JFrame
{
    public myJText()
    {
        //获取容器
        Container container = getContentPane();
        //获取一个文本区域//初始化
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setBounds(100,100,400,300);
        setVisible(true);
        JPanel jp = new JPanel();
        jp.setLayout(new BorderLayout());
//        JTextArea ja = new JTextArea("我是文本属于");
        JTextField jf = new JTextField("我选取不到");
        jf.setFocusable(false);
        JLabel jl = new JLabel("我在容器里面");
        jl.setBackground(Color.WHITE);
        //创建一个滚动窗口a
        JScrollPane js  = new JScrollPane();
        jp.add(jl,BorderLayout.NORTH);
        jp.add(jf,BorderLayout.CENTER);
        //将组件添加到船体
        js.add(jp);
        container.add(jp,BorderLayout.CENTER);


    }
}

