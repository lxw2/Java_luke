package Java_04_Date_tran.regex;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class regex_JF {
    public static void main(String[] args) {

        new myJFrame();
    }
}
class myJFrame extends JFrame
{
    String[]arr;
    private Container container = getContentPane();
    /*
    * 创建一个窗体
    * */
    public myJFrame()
    {
        //创建一块平板用来存放键盘监听

        //添加一块键盘面板
        container.add(creatkeybor(),BorderLayout.SOUTH);

        //添加一块匹配显示器
        JTextArea jTextArea1= new JTextArea(3,15);
        JTextArea jTextArea2= new JTextArea(3,15);
        JPanel jtext = new JPanel(new BorderLayout());
        jtext.add(jTextArea1,BorderLayout.CENTER);
        jtext.add(jTextArea2,BorderLayout.SOUTH);
        container.add(jtext,BorderLayout.CENTER);
        //创建一个开始和重置的按钮,进行焦点控制
        JButton button1 = new JButton("开始");
        JButton button2 = new JButton("重置");
        JPanel buttonpan = new JPanel(new FlowLayout());
        buttonpan.add(button1);
        buttonpan.add(button2);
        container.add(buttonpan,BorderLayout.NORTH);
        //对开始按钮进行动作事件的监听
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                keyborlisten();
                jTextArea1.setText("");
                arr = creatText();
                for (int i= 0;i<arr.length;i++)
                {
                    jTextArea1.append(arr[i]+" ");
                }
                {
                    setFocusable(true);
                    JPanel key = new JPanel();
                    key.addKeyListener(keyborlisten());

                    container.setLayout(new BorderLayout());
                    container.add(key,BorderLayout.WEST);

                }

            }
        });
        //对重置按扭进行监听
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextArea2.append("A ");

                System.out.println();
                if (!checktext(arr,jTextArea2))
                {
                    JOptionPane.showMessageDialog(null,"你输错了");
                }
            }
        });
        //对键盘进行监听
        //初始化
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        setBounds(100,100,500,350);
    }
    public JPanel creatkeybor()
    {
        //创建键盘面板
        JPanel keyborpane = new JPanel();
        keyborpane.setLayout(new BorderLayout());
        //创建按钮模拟键盘
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();
        p1.setLayout(new FlowLayout());
        p2.setLayout(new FlowLayout());
        p3.setLayout(new FlowLayout());
        //创建键盘名称数组
        String[] num = {"Q", "W", "E", "R", "T", "Y", "U", "I", "O", "P", "A", "S", "D", "F", "G", "H", "J", "K", "L", "Z", "X", "C", "V", "B", "N", "M"};
        for (int i = 0; i < num.length; i++) {
            if (i < 10) {
                JButton button = new JButton(num[i]);
                p1.add(button);
            } else if (i>=10&&i<19) {
                JButton button = new JButton(num[i]);
                p2.add(button);
            }else if (i>=19)
            {
                JButton button = new JButton(num[i]);
                p3.add(button);
            }
        }
        //创建一块键盘面板存放所有键盘
        keyborpane.add(p1,BorderLayout.NORTH);
        keyborpane.add(p2,BorderLayout.CENTER);
        keyborpane.add(p3,BorderLayout.SOUTH);
        return keyborpane;
    }
    public KeyListener keyborlisten ()
    {
        setFocusable(true);
        KeyListener k = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                switch (e.getKeyCode()) {
                    case KeyEvent.VK_A:
                        System.out.println("A被按下了");
                        break;
                    case KeyEvent.VK_B:
                        System.out.println("B被按下了");
                        break;
                    case KeyEvent.VK_C:
                        System.out.println("C被按下了");
                        break;
                    case KeyEvent.VK_D:
                        System.out.println("D被按下了");
                        break;
                    case KeyEvent.VK_E:
                        System.out.println("E被按下了");
                        break;
                    case KeyEvent.VK_F:
                        System.out.println("F被按下了");
                        break;
                    case KeyEvent.VK_G:
                        System.out.println("G被按下了");
                        break;
                    case KeyEvent.VK_H:
                        System.out.println("H被按下了");
                        break;
                    case KeyEvent.VK_I:
                        System.out.println("I被按下了");
                        break;
                    case KeyEvent.VK_J:
                        System.out.println("J被按下了");
                        break;
                    case KeyEvent.VK_K:
                        System.out.println("K被按下了");
                        break;
                    case KeyEvent.VK_L:
                        System.out.println("L被按下了");
                        break;
                    case KeyEvent.VK_M:
                        System.out.println("M被按下了");
                        break;
                    case KeyEvent.VK_N:
                        System.out.println("N被按下了");
                        break;
                    case KeyEvent.VK_O:
                        System.out.println("O被按下了");
                        break;
                    case KeyEvent.VK_P:
                        System.out.println("P被按下了");
                        break;
                    case KeyEvent.VK_Q:
                        System.out.println("Q被按下了");
                        break;
                    case KeyEvent.VK_R:
                        System.out.println("R被按下了");
                        break;
                    case KeyEvent.VK_S:
                        System.out.println("S被按下了");
                        break;
                    case KeyEvent.VK_T:
                        System.out.println("T被按下了");
                        break;
                    case KeyEvent.VK_U:
                        System.out.println("U被按下了");
                        break;
                    case KeyEvent.VK_V:
                        System.out.println("V被按下了");
                        break;
                    case KeyEvent.VK_W:
                        System.out.println("W被按下了");
                        break;
                    case KeyEvent.VK_X:
                        System.out.println("X被按下了");
                        break;
                    case KeyEvent.VK_Y:
                        System.out.println("Y被按下了");
                        break;
                    case KeyEvent.VK_Z:
                        System.out.println("Z被按下了");
                        break;
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        };

        return k;
    }
    public String[] creatText()
    {
        /*
        * 创建文本显示的方法
        * 将提前准备好的字符串数组逐个显示在文本显示区域面板中
        *
        * */
        //定义一个字符串数组
        String a = "A A v f e t h f c x s e t D G x r G V X A R f y h b S f G d X";
        String[] arr = a.split("\\s+");
        return arr;
    }
    public boolean checktext(String[] arr, JTextArea jTextArea)
    {
        String a = jTextArea.getText();
        String [] b=a.split("\\s+");
        System.out.println();
        for (int f= 0;f<b.length;f++)
        {
            System.out.print(b[f]+" ");
        }
        //判断输入的文本是否正确
        for (int i = 0;i<b.length;i++)
        {
            if (b[i].equals(arr[i]))
            {

            }
            else {
                return false;
            }
        }
        return true;
    }

}
