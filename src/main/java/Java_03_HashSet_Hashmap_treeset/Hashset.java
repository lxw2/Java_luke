package Java_03_HashSet_Hashmap_treeset;


import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Hashset {
    public static void main(String[] args) {
        //创建一个Treeset集合
        TreeSet<Student> students = new TreeSet<Student>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                //通过对象的传值来比较选择的数
                int num = 1;
                switch (Student.index)
                {
                    case "English":num = o1.getEnglish()>o2.getEnglish()? 1:-1;
                    break;
                    case "Chinese":num = o1.getChinese()>o2.getChinese()? 1:-1;
                    break;
                    case "math":num = o1.getMath()>o2.getMath()? 1:-1;
                    break;
                    case "mulit":num = o1.getMulit()>o2.getMulit()? 1:-1;
                    break;
                }
                return num;
            }
        });
        //创建学生对象
        Student stu1 = new Student(89.5,76.0,34.5,"张三",25);
        Student stu2 = new Student(90.0,72.0,55.5,"李四",25);
        Student stu3 = new Student(89.5,99.0,65.5,"亏无",25);
        Student stu4 = new Student(82.5,79.0,53.5,"司机",25);
        Student stu5 = new Student(81.5,73.0,12.5,"四点",25);
        Student stu6 = new Student(89.5,72.0,33.5,"设定",25);
        Student stu7 = new Student(24.5,90.0,67.5,"林肯",25);
        Student stu8 = new Student(86.5,56.0,67.5,"贝爷",25);
        Student stu9 = new Student(89.5,72.0,55.2,"张设",25);
        Student stu10 = new Student(45.5,23.0,76.5,"第三",25);
         Scanner sc = new Scanner(System.in);
        System.out.println("请输入你要按照那个成绩排序:");
        Student.index = sc.nextLine();
        students.add(stu1);
        students.add(stu2);
        students.add(stu3);
        students.add(stu4);
        students.add(stu5);
        students.add(stu6);
        students.add(stu7);
        students.add(stu8);
        students.add(stu9);
        students.add(stu10);



        for (Student s : students)
        {
            System.out.println(s.toString());
        }
    }
}
class hashtest
{
    public hashtest()
    {
        //创建一个hash集合用来存放随机数//由于hashSet他不允许存放重复的数值
        HashSet<String> hash = new HashSet<>();
        while (hash.size()<10)
        {
            int num = (int) (Math.random()*10+1);
            String s = new String();
            s=s.valueOf(num);
            hash.add(s);

        }
        for (String i:hash)
        {

            System.out.println(i);
        }
    }
}
class Student
{
    //定义三个成绩属性,以及一个总成绩,姓名,年龄,以及一个引索遍历
    private double English ;
    private double math ;
    private double Chinese ;
    private double mulit ;
    private String name;
    private int age;
    static public String index ;

    public void settIndex(String index)
    {
        this.index=index;
    }
    public double getEnglish() {
        return English;
    }

    public void setEnglish(double english) {
        English = english;
    }

    public double getMath() {
        return math;
    }

    public void setMath(double math) {
        this.math = math;
    }

    public double getChinese() {
        return Chinese;
    }

    public void setChinese(double chinese) {
        Chinese = chinese;
    }

    public double getMulit() {
        return mulit;
    }

    public void setMulit(double mulit) {
        this.mulit = mulit;
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

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public Student(double english, double math, double chinese, String name, int age) {
        English = english;
        this.math = math;
        Chinese = chinese;
        this.name = name;
        this.age = age;
        this.mulit =english+math+chinese;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "sTu{" +
                "English=" + English +
                ", math=" + math +
                ", Chinese=" + Chinese +
                ", mulit=" + mulit +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}