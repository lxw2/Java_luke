package Java_01_abstract;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Cardlayout_test {
    public static void main(String[] args)
    {
        new myCardLayout();
    }
}
class myCardLayout extends JFrame
{
    //初始化一个窗体容器,以及一个卡片布局容器
    private CardLayout cardlayout;
    public myCardLayout()
    {

        /*
        * 1.创建窗体容器,添加一个Jpanel的面板,并赋予面板卡片布局管理
        * 2.添加一个文本显示区域JLabel到Jpanel面板中.并添加不同的text
        * 3.在窗体容器的下方添加按钮,进行切换操作
        * 4.用for循环添加按钮,给按钮赋予text,并且用else if语句进行判断,不同的功能
        * 6.窗体初始化
        * */
        //获得一个窗体容器
        Container container = getContentPane();
        //新建一个卡片容器
        cardlayout = new CardLayout();
        //创建一个平板容器
        JPanel jpanel = new JPanel();
        jpanel.setLayout(cardlayout);
        container.setLayout(new BorderLayout());
        //将带有卡片布局的平板添加到窗体容器中
        container.add(jpanel,BorderLayout.CENTER);
        //创健一个数组用来存放JLabel的文本
        String[] TextName = {"卡片A","卡片B","卡片C"};
        //调用for循环将textName赋予给对应的JLabel
        for(int i=0;i< TextName.length;i++)
        {
            final JLabel jtext = new JLabel(TextName[i],SwingConstants.CENTER);
            jtext.setFont(new Font("",Font.BOLD,16));
            jtext.setName(TextName[i]);
            //将赋予好文本的JLabel添加到带有卡片布局的面板jpanel中去
            jpanel.add(jtext,TextName[i]);
        }
        //创建一个面板用来存放按钮,采用流布局
        JPanel buttonpane = new JPanel();
        buttonpane.setLayout(new FlowLayout());
        container.add(buttonpane,BorderLayout.SOUTH);
        //然后是按钮操作,添加7个按钮,分别是第一张,上一张,卡片A...
        //创建一个存放按钮名字的数组
        String[] buttonName = {"第一个","上一个","卡片A","卡片B","卡片C","下一个","最后一个"};
        //调用for循环给新建的按钮赋值
        for (int i = 0;i<buttonName.length;i++)
        {
            //新家一个按钮对象,并赋值
            Button button = new Button(buttonName[i]);
            button.setName(buttonName[i]);
            //给按钮添加点击事件[

            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    //创建一个变量获取button的text,用来判断
                    String buttonName1 = button.getName();
                    //开始通过if...else if去判断
                    if (buttonName1.equals("第一个"))
                    {
                        System.out.println("第一张");
                        cardlayout.first(jpanel);
                    }
                    else if (buttonName1.equals("上一个"))
                    {
                        cardlayout.previous(jpanel);
                    }
                    else if(buttonName1.equals("卡片A"))
                    {
                        cardlayout.show(jpanel,"卡片A");
                    }
                    else if(buttonName1.equals("卡片B"))
                    {
                        cardlayout.show(jpanel,"卡片B");
                    }
                    else if(buttonName1.equals("卡片C"))
                    {
                        cardlayout.show(jpanel,"卡片C");
                    }
                    else if(buttonName1.equals("下一个"))
                    {
                        cardlayout.next(jpanel);
                    }
                    else if(buttonName1.equals("最后一个"))
                    {
                        cardlayout.last(jpanel);
                    }
                }
            });
            //将按钮添加到流布局面版中去
            buttonpane.add(button);
        }
        //窗体初始化
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(100,200,400,400);
        setVisible(true);



    }
}
