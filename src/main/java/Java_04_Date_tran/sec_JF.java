package Java_04_Date_tran;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class sec_JF extends JFrame {
    public static void main(String[] args) {
        new sec_JF();
    }

    public sec_JF() {
        //创建一个窗体
        Container container = getContentPane();
        //创建一个文本显示区域
        JLabel jl = new JLabel("我是秒表");
        JTextField jTextField = new JTextField("");
        //窗体初始化
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        setBackground(Color.CYAN);
        setBounds(100, 100, 200, 200);
        //创建一个平板
        JPanel jp = new JPanel();
        jp.setLayout(new BorderLayout());
        //创建一个按钮
        JButton button = new JButton("开始");
        //给按钮添加事件
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
/*                int num = 0;
                Date date = new Date();
                System.out.println(date);
                long star = tu();
                System.out.println(star);
                while (true) {
                    long end = tu();
                    for (int i = 0; i < 10000; i++) ;
                    if ((end - star) > 1000) {

                        System.out.println(num);
                        star = end;
                        num++;
                    }

                    jTextField.setText("13");
                }*/
            Date date = new Date();
            System.out.println(date);
            long star = tu();
            int num = 0;
            String num1 ="";
            while (num<100)
            {
//                long end = tu();
//                System.out.println(end-star);
//                if ((end - star) ==1000)
//                {
//                    num1 = num+"";
//                    star = end;
//                }
                for (int i =0;i<100000;i++)
                {
                    for (int a = 0;a<100;a++)
                    {

                    }
                }

                jTextField.setText(num+"");
                num++;
            }
            }
        });

        //把组件添加
        jp.add(jTextField, BorderLayout.CENTER);
        jp.add(button, BorderLayout.SOUTH);
        container.add(jp);
    }



    public long tu() {
        long now = new Date().getTime();
        return now;
    }
}

