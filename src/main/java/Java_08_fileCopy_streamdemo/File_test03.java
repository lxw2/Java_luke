package Java_08_fileCopy_streamdemo;

import java.io.*;
import java.util.*;

public class File_test03 {
    public static void main(String[] args) throws IOException {
//        new ArraytoFile();
//        new FiletoArray();
        new Demo();
    }

}
class ArraytoFile
{
    public ArraytoFile() throws IOException {
        //创建arraylist集合
        ArrayList<String> array = new ArrayList<>();
        array.add("hello");
        array.add("world");
        array.add("java");

        //c创建一个字符流输出对象
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("IDEA\\word.txt"));

        for (String s : array)
        {
            bufferedWriter.write(s);
            bufferedWriter.newLine();

        }

        bufferedWriter.close();
    }

}
class FiletoArray
{
    public FiletoArray() throws IOException {
        BufferedReader bf = new BufferedReader(new FileReader("IDEA\\word.txt"));

                //新建一个Array数组
        ArrayList<String> arrayList = new ArrayList<>();

        //读取文件的数据
        String line;
        while ((line = bf.readLine())!=null)

        {
            arrayList.add(line);
        }

        for (String i: arrayList)
        {
            System.out.println(i);
        }
        bf.close();
    }
}

class Student
{
    private String name;
    private int age;
    private String local;

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

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public Student() {
    }

    public Student(String name, int age, String local) {
        this.name = name;
        this.age = age;
        this.local = local;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (age != student.age) return false;
        if (name != null ? !name.equals(student.name) : student.name != null) return false;
        return local != null ? local.equals(student.local) : student.local == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        result = 31 * result + (local != null ? local.hashCode() : 0);
        return result;
    }

    @Override
    public String
    toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", local='" + local + '\'' +
                '}';
    }
}

class Demo
{
    //创建一个数组,创建student对象,并将对象添加到Set集合中
    //创建一个字符输出流
    //遍历集合,将集合的属性输出到指定的文件中,age是int型的不能直接输出到文件,需要通过String的valueof将其转换为字符串
    //关闭资源
    //创建一个字符输入流,查询文件中的内容是否符合
    //关闭资源
    public Demo() throws IOException {
        HashSet<Student> stuSet = new HashSet<>();
        //创建学生对象,Student----public Student(String name, int age, String local)
        Student stu1 = new Student("林青霞",23,"广州");
        Student stu2 = new Student("张曼玉",22,"广东");
        Student stu3 = new Student("张三风",23,"汕头");
        Student stu4 = new Student("风情杨",23,"湛江");
        Student stu5 = new Student("司机",23,"云南");
        Student stu6 = new Student("刘岩",23,"福建");
        Student stu7 = new Student("胡歌",23,"台湾");

        stuSet.add(stu1);
        stuSet.add(stu2);
        stuSet.add(stu3);
        stuSet.add(stu4);
        stuSet.add(stu5);
        stuSet.add(stu6);
        stuSet.add(stu7);

        //遍历集合,查看是否添加成功
        System.out.println(stuSet);
        //创建字符输出流----使用BufferedWriter
        BufferedWriter buw = new BufferedWriter(new FileWriter("IDEA\\Student.txt"));
        //使用增强for遍历集合,将集合中的学生对象输出到文件中去
        for (Student student : stuSet)
        {
            buw.write(student.getName()+"\t");
            buw.write(student.getAge()+"\t");
            buw.write(student.getLocal());
            buw.newLine();
            buw.flush();
        }

        //读取文件中的信息,检查是否添加成功
        BufferedReader bur = new BufferedReader(new FileReader("IDEA\\Student.txt"));

        String line;
        //使用特有的方法读取数据
        while ((line = bur.readLine())!=null)
        {
            System.out.println(line);

        }
        //重新读取文件,随机抽取出一名幸运学生来回答问题
        /*
        创建一个用来接收数据的集合list(带索引)
        创建输入流对象,将输入流对象添加到list数组中去
        创建一个随机第数值大小为list数组的长度之间
        将文件中的数据读入到集合中去
        用随机索引调用出随机的学生信息,并输出

        * */
        BufferedReader burr = new BufferedReader(new FileReader("IDEA\\Student.txt"));
        //创建一个list集合
        List<String> stuinfor = new ArrayList<>();
        //读入文件中的数据到集合中去
        String stud;
        while((stud = burr.readLine())!= null)
        {
            //用list取添加 学生的名字
            //先获取到第一个空格的引索值,然后通过截取0~引索值的位置为学生的名字并将其添加到集合中去
           String a = stud.substring(0,stud.indexOf("\t"));
            stuinfor.add(a);
        }
//        System.out.println(stuinfor);
        //创建一个随机的数值
        Random random = new Random();
        int a = stuinfor.size();
        int num = random.nextInt(a);
//输出
        System.out.println("这位幸运的学生是:"+stuinfor.get(num));

        //关闭输出流
        buw.close();
        //关闭输入流
        bur.close();
        burr.close();

    }
}