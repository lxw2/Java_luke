package Java_09_Guessgame_print;

import java.io.*;
import java.util.Properties;
import java.util.Set;

public class test {
    public static void main(String[] args) throws IOException {
//        new test01();
//        new test022();
//new test03();
//        new test04();
        new test05();
    }
}
class test01
{
    /*/*
     * 我有一个文本文件copy.txt，我知道数据是键值对形式的，但是不知道内容是什么。
     * 请写一个程序判断是否有“lisi”这样的键存在，如果有就改变其值为100
     *
     * 分析：
     * 		A:把文本文件的数据加载到集合中
     * 		B:遍历集合，获取到每一个键
     * 		C:判断键的值是否有为lisi的
     * 			是：就修改其值为100
     * 			否：不搭理它
     * 		D:把集合中的数据存储到文本文件
     */
    public test01() throws IOException {
        //有键值对有限考虑Properites
        Properties properties = new Properties();//不用泛型
        //封装目的文件
        FileReader fr = new FileReader("IDEA\\COPY.txt");
        //将数据文件读取到集合中去
/*
        * void load(InputStream inStream)
                  从输入流中读取属性列表（键和元素对）。
         void load(Reader reader)
                  按简单的面向行的格式从输入字符流中读取属性列表（键和元素对）。
*/
        properties.load(fr);
        System.out.println(properties);
        //获取集合中的键值对象集合
        Set<Object> objects = properties.keySet();
        for (Object o:objects)
        {
            String key = (String)o;
            if (key.equals("lisi"))
            {
                System.out.println("有这个键值");
                properties.setProperty(key,"100");
            }
            else
            {
                System.out.println("没有这个键值");
            }
        }
        //将修改的结合输出到文件中取
        FileWriter fw = new FileWriter("IDEA\\COPY.txt");
        //调用Store的方法将集合输出
        properties.store(fw,null);

        //关闭资源
        fw.close();
    }
}

class test02 extends Thread
{

    @Override
    public void run() {
//        super.run();
        for (int i =0;i<100;i++)
        {
            System.out.println(getName()+","+i);
        }
    }

    public test02()
    {

    }
}
class test022
{
    public test022()
    {
       test02 t1 = new test02();
       test02 t2 = new test02();

       t1.start();
       t2.start();
    }
}

class test03
{

    public test03() {
        test02 t1 = new test02();
        test02 t2 = new test02();
        test02 t3 = new test02();

        t1.setName("关羽");
        t2.setName("张飞");
        t3.setName("刘备");

        t1.start();
        try {
            t1.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();
        try {
            t2.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t3.start();
    }



}

class ticket implements Runnable
{
    private int tick = 100;
    public ticket()
    {

    }

    @Override
    public void run() {
    /*    for (int x =0;x<tick;x++)
        {
            System.out.println(Thread.currentThread().getName()+":卖到第"+tick+"张票");
            tick--;
        }
        */
        while(true)
        {

            System.out.println(Thread.currentThread().getName()+":卖到第"+tick+"张票");
            tick--;
            if (tick < 0)
            {
                break;
            }
        }
    }
}
class test04
{
    public test04()
    {
        ticket ticke = new ticket();

        Thread t1 = new Thread(ticke,"窗口1");
        Thread t2 = new Thread(ticke,"窗口2");

        t1.start();
        t2.start();
    }
}

class test05
{
    public test05() throws IOException {
        ObjectOutputStream obs = new ObjectOutputStream(new FileOutputStream("IDEA\\COPY.txt"));
        obs.writeObject(new Object(){
            private String name ="林青霞";
            private int age =12;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getAge() {
                return age;
            }

            public void setAge(int age) {
                this.age = age;
            }

        });

        obs.close();
    }
}
