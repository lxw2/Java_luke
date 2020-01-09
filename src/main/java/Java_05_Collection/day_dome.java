package Java_05_Collection;


/*1:让该类实现Comparable接口 重写comparTo方法
        2:自定义比较器类 实现Comparator接口 重写compar方法

        注意:在自定义比较规则的时候 要注意规则的主次顺序*/


import java.util.Comparator;
import java.util.TreeSet;

/*
* :ConcurrentModificationException
	并发修改异常
* */
public class day_dome {
    public static void main(String[] args) {

        //创建一个treeSet集合
        TreeSet<sTu> stu = new TreeSet<sTu>(new Comparator<sTu>() {
            @Override
            //以总分为标准排行
            public int compare(sTu o1, sTu o2) {
                //判断二人的总分
                int num = (o1.sum()-o2.sum())>0? -1:1;
                int num2= o1.sum()-o2.sum() == 0? (o1.getChinese()>o2.getChinese()? 1:-1):num;
                return num2;
            }
        });
        //对象初始化
        sTu s1 = new sTu(20,78,65,"林青霞",23);
        sTu s2 = new sTu(87,98,65,"张三丰",23);
        sTu s3 = new sTu(87,38,65,"王祖贤",23);
        sTu s4 = new sTu(87,78,70,"左冷禅",23);
        sTu s5 = new sTu(87,70,78,"没曹风",23);
        sTu s6 = new sTu(87,78,54,"瓦利德",23);
        sTu s7 = new sTu(87,78,54,"爱哭的",23);
        //将对象添加到集合之中
        stu.add(s1);
        stu.add(s2);
        stu.add(s3);
        stu.add(s4);
        stu.add(s5);
        stu.add(s6);
        stu.add(s7);
        //用增强for进行遍历
        for (sTu sTu : stu) {
            System.out.println(sTu);
        }
        for (int a  = 0;a<10; )
        {
           int i = 0;
        }
        for (int a = 0;a<10;a++)
        System.out.println(a);
    }
}
/*创建一个学生类,每个学生携带者语文成绩,英语成绩,数学成绩,名字,年龄的属
*/
class sTu
{
    private int math;
    private int chinese;
    private int english;

    private String name;
    private int age;

    public sTu(int math, int chinese, int english, String name, int age) {
        this.math = math;
        this.chinese = chinese;
        this.english = english;
        this.name = name;
        this.age = age;
    }

    public sTu() {
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getChinese() {
        return chinese;
    }

    public void setChinese(int chinese) {
        this.chinese = chinese;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
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

    public int sum ()
    {
        return getChinese()+getEnglish()+getMath();
    }

    @Override
    public String toString() {
        return "sTu{" +
                "math=" + math +
                ", chinese=" + chinese +
                ", english=" + english +
                ", name='" + name + '\'' +
                ", age=" + age +
                ",sum="+sum()+
                "'}'";
    }
}