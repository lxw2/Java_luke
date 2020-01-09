package Java_08_fileCopy_streamdemo;

import java.io.File;

public class dimo {
    public static void main(String[] args) {
        File file =new File("D:\\学习\\bigData");
        methon(file);

    }
    public static void methon(File file)
    {
        File[] files = file.listFiles();
        System.out.println("文件夹的长度:"+files.length);
        if (files.length!=0)
        {
            for (File file1 : files)
            {
                if (file1.isDirectory())
                {
                    System.out.println("文件夹"+file1.getAbsolutePath());
                    methon(file1);
                }
                else
                {
                    System.out.println("文件"+file.getAbsolutePath());
                }
            }
        }
    }
}
