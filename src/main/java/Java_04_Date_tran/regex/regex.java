package Java_04_Date_tran.regex;

import java.util.Scanner;

public class regex {
    public static void main(String[] args) {
        new Big();
    }
}
class Big
{
    /*
    * 定义一个匹配数组
    * 定义一个键入对象Scanner
    * 用一个变量名进行接收
    * 把接收操作添加到while循环中用一个变量作为一个引索值进行匹配搜索
    * 比较char类型是否相等
    *
    * 输入第n个值,调用匹配第n个值进行比较,如果对返回true  否则放回false
    * */
    public Big()
    {
        //定义一个数组
        String[] ch = {"A","B","C","D","E"};
        //创建输入对象
        Scanner sc = new Scanner(System.in);
        //定义一个遍历的变量
        int num = 0;
        //调用while循环,定义一个变量名去接收输入的值
        while(num < ch.length)
        {
            System.out.println("请输入一个数:");

            String a = sc.nextLine();
            System.out.println("你输入的是:"+a);
            System.out.println("应该输入的是"+ch[num]);
            if (a.equals(ch[num]))
            {
                System.out.println("你输入的是对的!");
                num++;
            }else {
                System.out.println("你输入错了");
                num++;
            }
        }
        System.out.println("游戏结束");
    }
}
