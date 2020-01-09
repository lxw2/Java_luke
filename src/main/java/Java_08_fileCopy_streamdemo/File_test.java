package Java_08_fileCopy_streamdemo;

import java.io.*;

public class File_test {
    public static void main(String[] args) throws IOException {
/*        //定义一个字符串
        String s="中国";

        byte[] gys = s.getBytes("GBK");

        //通过使用指定字符集来构造

        String ss =new String(gys,"GBK");
        System.out.println(ss);*/


//====================================
/*
*
         Reader:字符输入流的----->抽象类

        InputStreamReader 继承了  Reader------>指定字符集

        Writer:字符输出流的----->抽象类

        OutputStreamWriter 继承了Writer------->指定字符集
        * */
//============================================================
        //默认的字符编码
//        FileOutputStream fos = new FileOutputStream("IDEA\\word.txt");
//        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fos);
    /*    OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream("IDEA\\word.txt"));
        outputStreamWriter.write("中国");

        outputStreamWriter.close();


        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream("IDEA\\word.txt"));
        int ch;
        while((ch = inputStreamReader.read())!=-1)
        {
            System.out.print((char)ch);

        }
        inputStreamReader.close();*/
    //================================================
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("IDEA\\word.txt"));

        //写入一个字符
//        osw.write(97);
//        //字符流写入数据不能直接写入,需要通过一个flush()刷新流,通过刷新流,将数据刷入
//        osw.write(98);
//        osw.flush();


        //写入一个字符数组
//        char[] chas={'a','a','a','a','a','a'};
//        osw.write(chas,0,chas.length);
//        osw.write(chas,1,3);


        //写入一个字符串
        String ss = "abcde";
        osw.write(ss);
        osw.write(ss,1,3);
        //释放数据之前会先执行一次刷新
        osw.close();




    }
}
