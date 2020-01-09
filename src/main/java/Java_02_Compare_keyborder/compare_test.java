package Java_02_Compare_keyborder;

public class compare_test {
    public static void main(String[] args) {
//        new mySettree();
    }
}
// 创建一个set集合
/*
class mySettree
{
    public mySettree()
    {
        Collection<person> people= new TreeSet<person>();

        person p1 = new person("xianwei",18);
        person p2 = new person("zdadan",16);
        person p3 = new person("zhan",13);
        person p4 = new person("zhsan",13);
        person p5 = new person("zhan",13);
        person p6 = new person("zhzisan",13);
        person p7 = new person("linxi",24);
        person p8 = new person("lisi",23);

        people.add(p1);
        people.add(p2);
        people.add(p3);
        people.add(p4);
        people.add(p5);
        people.add(p6);
        people.add(p7);
        people.add(p8);

        for (person p: people)
        {
            System.out.println(p.getName()+","+p.getAge());
        }
    }
}
//创建一个person类
class person implements Comparable<person>
{
    //person实现了Comparable接口
    //创建构造方法
    //创建成员变量
    private String name ;
    private int age ;

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

    public person() {

    }
    public person(String name,int age) {
        setName(name);
        setAge(age);
    }

    @Override
    public  int compareTo(person person)
    {
        int num = this.age - person.getAge();
        int num2 = num == 0? this.name.compareTo(person.name) : num;
        return num2;
    }
}
*/
