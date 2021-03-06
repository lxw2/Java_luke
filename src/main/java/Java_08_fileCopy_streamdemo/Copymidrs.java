package Java_08_fileCopy_streamdemo;

import java.io.*;

public class Copymidrs {
    public static void main(String[] args) throws IOException {
//        new copys();
//        new copys02();
        new copy03();
    }

}

class copys {
    public copys() throws IOException {
        /*
         * 需求:复制一个单级文件夹
         * 封装复制源文件为File对象
         * 封装目的源文件路径File对象
         * 读取源文件的数据,并判断目的路径有没有该文件
         * 如果没有,创建一个目录.
         * 创建一个集合接收源文件里面的文件
         * 如果是目录就新建目录,如果是文件就新建文件
         * */
        //创建一个File的对象
        File file = new File("D:\\学习\\abc");//file:D:\学习\abc
        //创建一个目的文件
        File file2 = new File(file.getName());
        //读取源文件的数据,并判断目的路径有没有该文件
        if (!file2.exists()) {
            System.out.println("目录创建成功!");
            file2.mkdir();
        }
        File[] files = file.listFiles();
        for (File f : files) {
          /*  if (f.isDirectory())
            {
                toDir(f,endfile);
            }
            else
            {
                tofile(f,endfile);
            }*/
        }


        toDir(file, file2);

    }

    public static void toDir(File file, File end) throws IOException {
        File endfile = new File(end.getAbsolutePath());//IDEA/abc
        //创建字节输出流对象,将目的文件路径封装进去
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(endfile));
        //创建该目录并且遍历该目录,获得文件列表,然后在判断


    }

    public static void tofile(File star, File end) throws IOException {
        File endfile = new File(end.getAbsolutePath());
        //创建字节输入流对象,将复制元文件封装进去并进行判断
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(star));

        //直接创建文件
        if (!endfile.exists()) {
            endfile.createNewFile();
        }
        //创建字节输出流对象,将目的文件路径封装进去
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(endfile));
        //读取文件数据
        byte[] bytes = new byte[1024];
        int len;
        while ((len = bis.read(bytes)) != -1) {
            bos.write(bytes, 0, len);
        }
        bos.close();
        bis.close();

    }

}

class copys02 {
    public copys02() throws IOException {
        //把D:\抱治百病\多级文件目录测试----->的文件复制到当前模块文件中
        File srcfile = new File("D:\\抱治百病\\多级文件目录测试");
        //封装一个目的地的file对象
        File destfile = new File("D:\\学习\\bigData");
        //判断目的地是是否有该文件夹
        creatDir(srcfile, destfile);
        //获取srcfile的文件列表集合
//        File[] files = srcfile.listFiles();
        //调用创建文件的方法
//        creatFile(srcfile,destfile);


    }

    public static void creatFile(File srcfile,File destfile) throws IOException {
        File[] files = srcfile.listFiles();
        //遍历该数组
        for (File f : files) {
            if (f.isDirectory()) {
                //如果f是目录的话,调用创建目录的方法
                creatDir(srcfile, f);
            } else {
                //如果是文件的话,直接调用复制文件的方法
                copying(f,destfile);
            }
        }
    }

    private static void copying(File f, File destfile) throws IOException {
        //创建字符输入输出流
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(f));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destfile));

        //读写数据
        byte[] bytes = new byte[1024];
        int len;
        while ((len = bis.read(bytes)) != -1) {
            bos.write(bytes, 0, len);
        }
    }

    //复制文件夹
    public static void creatDir(File srcfile, File destfile) throws IOException {
        //首先判断srcfile是否为文件夹
//        File newfile =null;
        if (srcfile.isDirectory()) {
            //获取srcFile的name
            String name = srcfile.getName();
            //封装一个新的目的对象file
            File newfile = new File(destfile.getAbsolutePath(), name);
            if (!newfile.exists()) {
                newfile.mkdir();
            }

            File[] files = srcfile.listFiles();
            //遍历该数组
            for (File f : files) {
                //如果f是目录的话,调用创建目录的方法
                creatDir(f, newfile);
            }
        } else {

            //如果是文件的话,直接调用复制文件的方法
            File nextfile = new File(destfile,srcfile.getName());
            copying(srcfile, nextfile);
        }
    }
}

class copy03
{
    public copy03() throws IOException {
        ////把D:\抱治百病\多级文件目录测试----->的文件复制到当前模块文件中
        File srcfile = new File("D:\\抱治百病\\多级文件目录测试");
        //封装一个目的的文件夹
        File destfile = new File("D:\\学习\\bigData");
        //判断复制源文件是否为目录
        //在判断目的文件是否有同名的文件或者目录
        creatDir(srcfile,destfile);
    }

    public static void creatDir(File srcfile, File destfile) throws IOException {
        //进行判断
        if(srcfile.isDirectory()) {
            System.out.println("1");
            //判断目的是否存在同名----->封装一个新的目的文件对象
            String name = srcfile.getName();
            File newfile = new File(destfile.getAbsolutePath(), name);
            if (!newfile.exists()) {
                //不存在的话创建该目录
                newfile.mkdir();
            }
            //创建一个数组存放file对象的,进行遍历检查
            File[] files = srcfile.listFiles();
            //遍历循环文件
            for (File f : files) {
                creatDir(f, newfile);
            }

//        if (srcfile.isDirectory()) {
//            //获取srcFile的name
//            String name = srcfile.getName();
//            //封装一个新的目的对象file
//            File newfile = new File(destfile.getAbsolutePath(), name);
//            if (!newfile.exists()) {
//                newfile.mkdir();
//            }
//
//            File[] files = srcfile.listFiles();
//            //遍历该数组
//            for (File f : files) {
//                //如果f是目录的话,调用创建目录的方法
//                creatDir(f, newfile);
//            }
//        }

//    }else
//        {
//            //因为这个目的路径是上个文件的路径,所以需要重新封装一个File的对象
//            File dfile = new File(destfile,srcfile.getName());
//            //直接调用文件复制功能
//            copying(srcfile,dfile);
//
//        }
        }else {

            //如果是文件的话,直接调用复制文件的方法
            File nextfile = new File(destfile,srcfile.getName());
            creatfile(srcfile, nextfile);
        }
    }

    public static void creatfile(File srcfile, File dfile) throws IOException {
        System.out.println("12");
        //封装两个字节输入输出流
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcfile));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(dfile));
        //读取写入数据
        byte[] bytes = new byte[1024];
        int len;
        while((len = bis.read(bytes))!=-1)
        {
            bos.write(bytes,0,len);
        }

        //关闭流
//        bos.close();
//        bis.close();
    }
    private static void copying(File f, File destfile) throws IOException {
        //创建字符输入输出流
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(f));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destfile));

        //读写数据
        byte[] bytes = new byte[1024];
        int len;
        while ((len = bis.read(bytes)) != -1) {
            bos.write(bytes, 0, len);
        }
    }
}