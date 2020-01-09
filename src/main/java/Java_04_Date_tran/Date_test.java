package Java_04_Date_tran;

import java.util.Date;

public class Date_test {
    public static void main(String[] args) {
        new datedemo();
    }
}
class datedemo
{

    public  datedemo()
    {
        //创建一个秒类

        Date date = new Date();
        System.out.println(date);
        date.getTime();
        long star =tu();
        System.out.println(star);
        int num = 0;
        while (true)
        {
            long end = tu();
            for(int i = 0;i<10000;i++);
            if((end - star) == 1000 )
            {
                System.out.println("第"+num+"秒");
                star = end;
                num++;
            }
        }

    }
    public long tu()
    {
        long now = new Date().getTime();
        return now;
    }



}
