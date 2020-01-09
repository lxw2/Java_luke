package Java_03_HashSet_Hashmap_treeset;

import java.util.Comparator;
import java.util.TreeSet;

public class treeSet_test {
    public static void main(String[] args) {
        //对创建出来的
        stu s1 = new stu("张三",23);
        stu s2 = new stu("李四",24);
        stu s3 = new stu("李四",24);
        stu s4 = new stu("赵六",23);
        stu s5 = new stu("林奇",54);
        stu s6 = new stu("七八",27);
        stu s7 = new stu("六九",98);
        //创建一个存放对象的Treeset集合用来存放stu对象
        TreeSet<stu> stuTreeSet = new TreeSet<>(new Comparator<stu>() {
            @Override
            public int compare(stu o1, stu o2) {
                //this == o1;
                //传入比较器的参数为o2
                if (o1.equals(o2))
                {
                    return 0;
                }
                int num  =o1.getAge()>o2.getAge()? 1:-1;
                return num;
            }
        });

        stuTreeSet.add(s1);
        stuTreeSet.add(s2);
        stuTreeSet.add(s3);
        stuTreeSet.add(s4);
        stuTreeSet.add(s5);
        stuTreeSet.add(s6);
        stuTreeSet.add(s7);
        for (stu s:stuTreeSet)
        {
            System.out.println(s.toString());
        }

    }
}
class mySettree
{
    public mySettree()
    {
        TreeSet<perso> people= new TreeSet<perso>();

        perso p1 = new perso("xianwei",18);
        perso p2 = new perso("zdadan",16);
        perso p3 = new perso("zhan",13);
        perso p4 = new perso("zhsan",13);
        perso p5 = new perso("zhan",13);
        perso p6 = new perso("zhzisan",13);
        perso p7 = new perso("linxi",24);
        perso p8 = new perso("lisi",23);

        people.add(p1);
        people.add(p2);
        people.add(p3);
        people.add(p4);
        people.add(p5);
        people.add(p6);
        people.add(p7);
        people.add(p8);

        for (perso p: people)
        {
            System.out.println(p.getName()+","+p.getAge());
        }
    }
}
class perso implements Comparable
{
    private String name;
    private int age;

    public perso(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public perso() {
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

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
class stu
{
    private String name = "";
    private int age ;

    public stu(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public stu() {
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
/*    @Override
    public int compareTo(Object o) {
        if(this.equals(o))
        {
            return 0;
        }
        stu s = (stu)o;
        int num = this.getAge()>((stu) o).getAge()? -1:1;
        return num;
    }*/

    @Override
    public String toString() {
        return "stu{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        stu stu = (stu) o;

        if (age != stu.age) return false;
        return name != null ? name.equals(stu.name) : stu.name == null;
    }


}
