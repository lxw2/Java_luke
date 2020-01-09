package Java_04_Date_tran;

import java.util.Scanner;

public class except_test02 extends Exception{
    public except_test02()
    {

    }
    public except_test02(String message)
    {
        super(message);
    }

}
class teacher{
    public void check(int score) throws except_test02 {
        if(score<0||score>100)
        {
            throw new except_test02("你给的分数有误,请给除正确的分数");
        }else {
            System.out.println("分数正常");
        }
    }
}
class demo
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的分数");
        int chec = sc.nextInt();
        try {
            new teacher().check(chec);
        } catch (Java_04_Date_tran.except_test02 except_test02) {
            except_test02.printStackTrace();
        }
    }
}
