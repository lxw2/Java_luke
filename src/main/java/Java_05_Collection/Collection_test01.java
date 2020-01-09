package Java_05_Collection;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Collection_test01 {
    public static void main(String[] args) {
        //创建集合对象
       /* List<String> list = new ArrayList<String>();

        //添加对象
        list.add("Hello");
        list.add("world");
        list.add("java");
        System.out.println(list);
        list.add("java");
        //输出集合对象


        System.out.println(list);
        //用迭代器的方法
        *//*Iterator<String> iterator = list.iterator();
        while (iterator.hasNext())
        {
            String s = iterator.next();
            System.out.println(s);
        }*//*
        //list.add
//        list.add(1,"javaee");
//        list.add(11,"javaee");//IndexOutOfBoundsException
        //list.remove
//        list.remove(1);
        //list.set

//        System.out.println(list.set(1,"sd"));//返回被替换的元素

        //list.get
//  System.out.println(list.get(1));
        //遍历集合
        for (int i = 0;i<list.size();i++)
        {
            System.out.println(list.get(i));
        }
        System.out.println(list);*/
        List<sTu> stu = new ArrayList<>();

    /*    sTu stu1 = new sTu("林青霞","24","40");
        sTu stu2 = new sTu("张三丰","24","42");
        sTu stu3 = new sTu("王祖贤","24","25");

        stu.add(stu1);
        stu.add(stu2);
        stu.add(stu3);
*/
        Iterator<sTu> iterator = stu.iterator();
                while(iterator.hasNext())
                {
                    sTu s = iterator.next();
                    System.out.println(s.getName()+","+s.getAge());
                }

                for (int i =0; i<stu.size();i++)
                {
                    System.out.println(stu.get(i).getName()+","+stu.get(i).getAge());
                }
    }
}
/*
class Student
{
    private String name;
    private String num;
    private String age;



    public Student(String name, String num, String age) {
        this.name = name;
        this.num = num;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Student()
    {

    }
}
*/

