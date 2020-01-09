package Java_07_file_demo;


import java.io.*;
import java.util.ArrayList;

public class file01 {

    public static void main(String[] args) throws IOException {
//        new myfile();
//        new myoutStream();
//        new outSteam01();
//        new myInputstream();
//        new copyFile();
//
//  new myBuff();
        new copyavi();
    }


}

class myfile {
    public myfile() throws IOException {
//        File file  = new File("java.txt");
//        System.out.println(file);
        //需求一>我要在工作弓箭中船舰一个文件java.txt
//        File file = new File("java.txt");
//        System.out.println(file.createNewFile());
        //在默认的空间下创建一个多级目录
//        File file2 = new File("../TEST//aaa");
//        File file2 = new File("..//aaa");
        File file2 = new File("IDEA\\Student.txt");
        System.out.println(file2.createNewFile());
//        //在创建的目录下创建一个文件
//        File file = new File(file2.getAbsolutePath()+"\\java.txt");
//        System.out.println(file.createNewFile());
//        System.out.println(file2.isDirectory());
//        System.out.println(file2.isFile());
//        System.out.println(file2.exists());
//        System.out.println(file2.getAbsolutePath());
//        System.out.println(file2.getPath());
//        System.out.println(file2.getName());
//        System.out.println(file2.getParent());
//        System.out.println("======================");
/*        File file = new File("D:\\学习");
        String[] list = file.list();
        System.out.println(list);

        File[] files = file.listFiles();
        for (File file1:files)
        {
            if (file1.isFile())
            {
                System.out.println(file1);
            }
        }*/
//        System.out.println(file2.delete());


    }


}

class myoutStream {
    public myoutStream() throws IOException {
        //创建一个File对象,将获取d盘下的目录
        File file = new File("D:\\学习\\bigData");
        ArrayList<ArrayList<File>> array = null;
        File[] files = file.listFiles();
        for (File f : files) {
            methon(f, array);
        }
        for (ArrayList a : array) {
            for (Object f : a) {
                System.out.println(f);
            }
            System.out.println("==========");
        }

        /*
         * 如果目标路径没有该文件将为自动调用系统功能创建文件
         * */

        //关闭资源
    }

    public void methon(File fpath, ArrayList<ArrayList<File>> di) {
        // 传一个Map集合用来存放文件内部的目录集合
        //按照顺序将文件夹中的目录文件添加到对应的键值对
        //put<key,ArrayList>传入第一个目录中的文件
        //ArrayList将该目录下的所有对象添加到自己
        ArrayList<ArrayList<File>> dir = null;
        ArrayList<File> filelist = new ArrayList<>();
//         dir = new ArrayList<>();
        if (fpath.isDirectory()) {
            File[] files = fpath.listFiles();
            for (File f : files) {
                if (f.isDirectory()) {
                    dir.add(filelist);
                    methon(f, dir);
                } else {
                    filelist.add(f);
                    System.out.println(f.getName());
                }

            }

        } else {
            filelist.add(fpath);
            System.out.println(fpath.getName());
        }
    }

}

class outSteam01 {
    public outSteam01() {
        FileOutputStream fileOutputStream = null;
        try {
            File file = new File("IDEA\\word.txt");

            fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write("abc".getBytes());


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

        }

    }
}

class myInputstream {
    public myInputstream() throws IOException {
        //创建一个字节输入流对象
        FileInputStream fip = new FileInputStream("IDEA\\word.txt");

/*        //调用字节输入流对象的读数据的方法
        int read = fip.read();
        System.out.println(read);
        System.out.println((char)read);

        //第二次读取数据
        read = fip.read();
        System.out.println(read);
        System.out.println((char) read);
        //在多读取两次
        read = fip.read();
        System.out.println(read);
        System.out.println((char) read);
        read = fip.read();
        System.out.println(read);
        System.out.println((char) read);*/

        //=============>用循环改进读取数据
        int by;
        /*
            by = fip.read()-->读数据
            by  fip.read()--->把读取的数据赋值给了by
            by!=-1 ---->判断读取到的数据是否是-1
         */
        while ((by = fip.read()) != -1) {
            System.out.print((char) by);
        }
        //释放资源
        fip.close();
    }
}

class copyFile {
    public copyFile() throws IOException {
        FileInputStream fip = new FileInputStream("IDEA\\word.txt");

        //创建一个输出流
        FileOutputStream fop = new FileOutputStream("IDEA\\Student.txt");

        //读写数据(一次读取一个字节,一次写入一个字节)
/*        int by;
        while ((by = fip.read()) != -1) {
            fop.write(by);
        }*/

       /* //使用数组读取数据
        //创建已给数组容器
        byte[] bys = new byte[5];
        //第一次读取数据
        int len = fip.read(bys);
        System.out.println(len);
        System.out.println(new String(bys,0,len));
//len得到的是实际读取到的数据的长度
         len = fip.read(bys);
        System.out.println(len);
        System.out.println(new String(bys,0,len));
        //读取长度为-1:len = -1时,读取结束*/

        byte[] bys = new byte[1024];
        int len;
        while((len=fip.read(bys))!=-1)
        {
            System.out.println(new String(bys,0,len));
        }



//释放资源
        fip.close();
        fop.close();
    }
}

class myBuff {
    public myBuff() throws IOException {
        //创建字节缓冲流

/*
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("IDEA\\word.txt"));
        //写数据调用底层的字节输出流
        bufferedOutputStream.write("hello\r\n".getBytes());
        bufferedOutputStream.write("world\r\n".getBytes());

        bufferedOutputStream.close();
*/
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("IDEA\\word.txt"));
        //读取数据
    /*    int by;
        while ((by = bufferedInputStream.read())!=-1)
        {
            System.out.print((char)by);
        }*/
        //使用字节数组读取数据
        byte[] bytes = new byte[1024];
        int len;
        while ((len = bufferedInputStream.read(bytes)) != -1) {
            System.out.println(new String(bytes, 0, len));
        }

        bufferedInputStream.close();


    }
}

class copyavi
{
    public copyavi() throws IOException {
        //开始记录事件
        long startime = System.currentTimeMillis();

        //复制视频
//        methon1();
//        methon2();
//        methon3();
        methon4();

        //记录结束事件
        long endtime = System.currentTimeMillis();
        System.out.println("共耗时"+(endtime-startime)+"毫秒");
    }

    private static void methon1() throws IOException {
        //创建一个输入输出流的对象
        FileInputStream fip = new FileInputStream("IDEA\\word.txt");
        FileOutputStream fop = new FileOutputStream("IDEA\\Student.txt");

        int by ;
        while ((by = fip.read())!=-1)
        {
            fop.write((char)by);
        }
        fip.close();
        fop.close();

    }

    public static void methon2() throws IOException {
        FileInputStream fip = new FileInputStream("IDEA\\word.txt");
        FileOutputStream fop = new FileOutputStream("IDEA\\Student.txt");

        byte[]  bytes = new byte[1024];
        int by ;
        while ((by = fip.read(bytes))!=-1)
        {
            fop.write((char)by);

        }
        fip.close();
        fop.close();
    }
    public static void methon3() throws IOException {
        //字节缓冲流,一次读取一个字节
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("IDEA\\word.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("IDEA\\word.txt"));

        //进行读写数据
        int by;
        while((by = bis.read())!=-1)
        {
            System.out.println((char)by);
        }
    }
    public static void methon4() throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("IDEA\\word.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("IDEA\\word.txt"));

            //创建一个字节数组
        byte[] bytes = new byte[1024];
        int by;
        while((by = bis.read(bytes))!=-1)
        {
            System.out.println((char)by);
        }
    }
}

