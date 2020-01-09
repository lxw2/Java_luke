package Java_07_file_demo;

import java.io.File;

public class Filedemo {
    public static void main(String[] args) {

    }
}
class demo1
{
    /*
    * 需求:定义一个集合用来存放文件夹中的文件
    *
    * */
    public demo1()
    {
        File file = new File("D:\\");
        File[] files = file.listFiles();
        for (File file1:files)
        {
            if (file1.isDirectory())
            {

            }
        }
    }
}
