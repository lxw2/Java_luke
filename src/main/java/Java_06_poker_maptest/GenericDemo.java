package Java_06_poker_maptest;

import java.util.Scanner;

public class GenericDemo {
    public static void main(String[] args) {
/*        Collection collection = new ArrayList();

        Stdudent s1 = new Stdudent();
        teacher t1 = new teacher();

        collection.add("abc");
        collection.add(s1);
        collection.add(t1);
        collection.add(123);

        //调用增强for循环
        for(Object o : collection)
        {
        }*/
        Scanner scanner =new Scanner(System.in);
        String s = scanner.nextLine();
//        String[] toint = s.split("\\s");
        byte[] bytes = s.getBytes();
//        for (String a :toint)
//        {
//            System.out.println(a);
//        }
        int[] arr ={1,2,3};
        int sum = function("加法",bytes);
        System.out.println(sum);

    }
    public static int function(String s,byte...a)
    {
        int result = 0;
        if (s.equals("加法"))
        {
            for (Byte integer : a)
            {
                result+=(integer-48);

            }
        }
        return result;
    }


    //定义一个泛型的方法
    public static <T> void gen(T t,Object o)
    {
//        Stdudent s = new Stdudent();
//        if ( o instanceof s )
//        {
//        }
//        Boolean result =o instanceof Stdudent;
    }
}





class Stdudent
{
    private String name = "我是一个学生类";

    public Stdudent(String name) {
        this.name = name;
    }
    public Stdudent()
    {

    }

    @Override
    public String toString() {
        return "Stdudent{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class teacher
{
    private String name="我是一个老师类";

    @Override
    public String toString() {
        return "teacher{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public teacher(String name) {
        this.name = name;
    }

    public teacher() {
    }

    public void setName(String name) {
        this.name = name;
    }
}