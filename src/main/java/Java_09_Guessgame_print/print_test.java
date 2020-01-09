package Java_09_Guessgame_print;

import java.io.*;

public class print_test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        PrintStream ps = new PrintStream(new FileOutputStream(new File("IDEA\\word.txt")),true);
       /* BufferedReader brr = new BufferedReader(new FileReader("D:\\学习\\bigData\\IDEA\\src\\Day08\\Copymidrs.java"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("IDEA\\COPY2.txt"));

        String s ;
        while ((s = brr.readLine())!=null)
        {
            bw.write(s);
            bw.newLine();
            bw.flush();
        }
        brr.close();
        bw.close();


        //创建字符输入流对象
        BufferedReader br = new BufferedReader(new FileReader("D:\\学习\\bigData\\IDEA\\src\\Day08\\Copy.java"));

        PrintWriter pw = new PrintWriter(new FileWriter("IDEA\\COPY.txt"),true);

        //读写数据
        String d ;
        while ((d = br.readLine())!=null)
        {
            //打印
            pw.println(d);
        }

        br.close();
        pw.close();*/
//       new obSdemo();
       new rbSdemo();
       /*
       * java.io.InvalidClassException: Day09.Student;
       * local class incompatible:
       * stream classdesc serialVersionUID = -7625725815461279168,
       * local class serialVersionUID = -5441807314276684414
       * */

    }
}

/*class obSdemo
{
    public obSdemo() throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("IDEA\\object.txt"));

        //创建学生对象
        Student str = new Student("林青霞",23);

        //
        oos.writeObject(str);

        oos.close();
    }


}*/

class rbSdemo
{
    public rbSdemo() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("IDEA\\object.txt"));

        //读取对象
        Object object =ois.readObject();
        Student a = (Student)object;
        System.out.println(a.getAge()+","+a.getName()+","+a.getBb());
        System.out.println(object);

        //关闭资源
        ois.close();
    }
}


class Student implements Serializable
{
    static final long serialVersionUID = 42L;
    private String name;

    private int age;
    private String bb = "ad";

    public String getBb() {
        return bb;
    }

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

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}


