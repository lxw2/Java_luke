package Java_09_Guessgame_print;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Guessgame {
    public static void main(String[] args) throws IOException {
        //创建一个random数值
        new proDemo();

    }
    public static void star()
    {
        Random ran = new Random();
        int num = ran.nextInt(100);
        int number;
        //创建一个输入对象
        while(true)
        {
            System.out.println("请输入一个数值");
            Scanner scanner = new Scanner(System.in);
            number = scanner.nextInt();
            if (number>num)
            {
                System.out.println("你输入的数值过大");
            }
            else if (number<num)
            {
                System.out.println("你输入的数值过小");
            }
            else {
                System.out.println("恭喜你猜对了");
                break;
            }
        }

    }
}
class proDemo
{
    public proDemo() throws IOException {
        //新建一个pro集合
        Properties prop = new Properties();
        //创建一个输入流
        FileReader fr = new FileReader("IDEA\\word.txt");

        //将文件中的数值读取到集合中
        prop.load(fr);
        //读取键
        String num = (String) prop.get("count");
        int number = Integer.parseInt(num);
        if(number>=3)
        {
            System.out.println("请从充钱");
        }
        else
        {
            number++;
            Guessgame.star();
        }
        //将数据重写会集合中
        prop.setProperty("count",number+"");
        //创建一个字符输出流
        FileWriter fw = new FileWriter(new File("IDEA\\word.txt"));
        prop.store(fw,null);
        fw.close();
    }
}
