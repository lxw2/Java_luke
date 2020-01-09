package Java_08_fileCopy_streamdemo;

import java.io.*;

public class File_test02 {
    public static void main(String[] args) throws IOException {
        //字符输入流读取数据
//        InputStreamReader isr = new InputStreamReader(new FileInputStream("IDEA\\word.txt"));
//
///*        int ch;
//        while((ch = isr.read())!=-1)
//        {
//            System.out.println((char)ch);
//        }*/
////用字符数组来打印
//        char[] chs = new char[1024];
//        int s;
//        while((s = isr.read(chs))!=-1)
//        {
//            System.out.println(new String(chs,0,chs.length));
//        }



        FileReader fr = new FileReader("IDEA\\word.txt");

//        FileWriter fw = new FileWriter("IDEA\\Student.txt");

//        int ch ;
//        while((ch = fr.read())!=-1)
//        {
//            fw.write(ch);
//        }
        //释放资源
//        BufferedWriter bw = new BufferedOutputStream(new FileOutputStream() {
//        }"IDEA\\Student.txt");
//        BufferedReader br = new BufferedReader(fr);
//
//        int ch ;
//        while ((ch = br.read())!=-1)
//        {
//            bw.write(ch);
//        }

//        char[] chs = new char[1024];
//        int len;
//        while ((len = br.read(chs))!=-1)
//        {
//            bw.write(chs,0,chs.length);
//        }

        BufferedReader br = new BufferedReader(new FileReader("IDEA\\word.txt"));

        String ch;
        while ((ch = br.readLine())!=null)

        {
            System.out.println(ch);
        }




br.close();
//        fw.close();
//        fr.close();
//        isr.close();
    }
}
