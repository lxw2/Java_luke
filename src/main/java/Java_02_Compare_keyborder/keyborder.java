package Java_02_Compare_keyborder;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class keyborder extends JFrame {
    private keylist te;

    public static void main(String[] args) {
//        new keyborder().test();
        new myJF();
    }

    public void test() {
        te = new keylist();
        this.addKeyListener(te);
        this.add(te);
        setBounds(0, 0, 1, 2);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}

class myJF extends JFrame {
    keylist key;
    mouselist mouselist;
    public myJF() {
        //创建一个容器
        Container container = getContentPane();
        container.setLayout(new BorderLayout());
        //创建一个显示窗口
        //将窗口添加到布局的CENTER
        //获取CENTER
        container.add(key.jScrollPane,BorderLayout.CENTER);
        mouselist =new mouselist();
        JPanel p4 = new JPanel();
        p4.setLayout(new BorderLayout());
        p4.add(mouselist.p1,BorderLayout.NORTH);
        p4.add(mouselist.p2,BorderLayout.CENTER);
        p4.add(mouselist.p3,BorderLayout.SOUTH);
        container.add(p4,BorderLayout.SOUTH);
        //添加键盘面板
        key = new keylist();
        this.addKeyListener(key);
        this.add(key,BorderLayout.WEST);
        setResizable(false);
        //窗体初始化

        setLayout(new BorderLayout());
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(100, 100, 600, 300);
        setVisible(true);
    }
}

class keylist extends JPanel implements KeyListener {
    JTextArea jt = new JTextArea();
    JScrollPane jScrollPane = new JScrollPane(jt);
    JLabel jLabel = new JLabel();
    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub

    }


    //正在监听器中设置方法让后台反馈
    public void keyPressed(KeyEvent e) {
        // TODO Auto-generated method stub

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
        // TODO Auto-generated method stub

    }


}

class mouselist extends JFrame {
    JPanel p1 = new JPanel();
    JPanel p2 = new JPanel();
    JPanel p3 = new JPanel();
    public mouselist() {
        //创建一块面板存放按钮

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
    }
}