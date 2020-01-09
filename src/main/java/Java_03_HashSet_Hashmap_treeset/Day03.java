package Java_03_HashSet_Hashmap_treeset;

import java.util.Arrays;

public class Day03 {
    public static void main(String[] args) {
/*        new student().get().funtion();
        new outer().show(new person() {
            @Override
            public void funtion() {
                System.out.println("person被重写了");
            }
        }).funtion();*/
 /*       son s = new son();
        poke_demo d = new poke_demo();
        father f = d.methon(new father() {
            @Override
            public void iamfather() {
                System.out.println("我是一个新的fateher");
            }
        });
        f.iamfather();*/
/* int [] arr = {1,5,6,8,3,2,1,5,7,8};
//    new funtion().sort(arr);
        new funtion().selectSort(arr);*/

    boy b = new boy("叶修","23");
    boy c = new boy("叶修","23");
        System.out.println(b.equals(c));
        System.out.println(b);//直接输出引用对象的时候,如果不是字符串对象,他会默认输出字节文件地址以及hashcode地址值
        //print底层调用toString
           /*     public void println(Object x) {
                    String s = String.valueOf(x);
                    synchronized (this) {
                        print(s);
                        newLine();

                    public static String valueOf(Object obj) {
                    return (obj == null) ? "null" : obj.toString();
                }
            }
        }*/

    }
}

interface Eat
{
    void show(person person);
}
abstract class person
{
    abstract public void funtion();
    public person()
    {
        System.out.println("person的构造方法被调用了");
    }

}
class student extends person implements Eat
{
    String in = "";
    @Override
    public void funtion() {
        System.out.println("我调用了父类的方法");
    }
    public student get()
    {
        funtion();
        return this;
    }

    public void show(person p)
    {
        System.out.println("我调用了接口的方法");
    }
}
/*
* 内部类
* */
class outer
{
    public person show(person p)
    {
        System.out.println("匿名内部类被调用");
        return p;
    }
    class inner
    {
        public inner(){
            System.out.println("内部类的调用");
        };
    }
}
/*
* 类和接口通过多态的形式生成对象
* //接口生成对象
* 在方法中设定形参为接口类型名字
* 然后调用接口的实现类作为实参
*
* */
interface father
{
    void iamfather();
}
class son implements father
{
    public void iamfather()
    {
        System.out.println("我重写了父类的抽象方法");
    }
}
class demo
{
    public father methon(father a)
    {

        return a;
    }
}
/*
* 常用的math
* */
class funtion
{
    public void sort(int[] arr)
    {
        //调用array中的sort
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    /*
    * 选择排序法
    * 原理:假设数组的第一个数(也就是索引值为0的数值为最小的数),然后逐个跟数组的后几位作比较
    * 当发现比自己小的数值的时候,记录该索引值,遍历结束后,将该索引值所对应的数与第一个数进行交换操作
    * 重复遍历数组长度的n-1次,就可以完成排序
    *
    * */
    public void selectSort(int [] arr)
    {
        //对传进来的数组进行第一次遍历
        for (int i = 0;i<arr.length-1;i++)
        {
            int index = i;
            //第一遍的遍历是为了获得把第几个数拿出来跟其他数作比较
            for (int x = i+1;x<arr.length;x++)
            {

                //第二次遍历是为了把第一遍遍历取出来的数进行比较
                if(arr[index]>arr[x])
                {
                    //当作比较的数大于被比较的数时,将记录那个更小index值
                    index = x;
                }
            }
            //在进行交换之前要进行对引索值的判断,将比较数与被比较数相等的时候,跳过交换步骤
            if(i != index)
            {
                //经过内部的第一次遍历之后,第一最小值被筛选出来,接下来要进行交换
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
            }
        }
        printarr(arr);
    }
    public void printarr(int [] arr)
    {
        for (int i = 0; i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
/*
object类两个方法的重写
* */
class boy
{
    private String name;
    private String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public boy(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public boy() {
    }

    @Override
    public String toString() {
        return "boy{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        boy boy = (boy) o;

        if (name != null ? !name.equals(boy.name) : boy.name != null) return false;
        return age != null ? age.equals(boy.age) : boy.age == null;
    }


    }


class overwriter
{
    public overwriter()
    {

    }
}
