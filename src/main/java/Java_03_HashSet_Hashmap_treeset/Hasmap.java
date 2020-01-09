package Java_03_HashSet_Hashmap_treeset;

import java.util.*;

public class Hasmap {
    public static void main(String[] args) {
        new mymap();
    }
}
class match
{
    //创建一个map集合
    public match()
    {

        Map<String,String> hp = new HashMap<String, String>();
        int index =0;
        String[] arr = {"谢霆锋","张三","李四","亏无","设定","第的"};
        /*while (hp.size() < 6)
        {
            hp.put("index",arr[index]);
        }*/
        hp.put("001","谢霆锋");
        hp.put("002","谢霆锋");
        hp.put("003","谢霆锋");
        Set<String> key = hp.keySet();
        Collection<String> value =  hp.values();
        for (String ke: key)
        {
            System.out.println(ke);
        }
        for (String ke :value)
        {
            System.out.println(ke);
        }
    }

}
class emp
{
    //声明类的成员变量
    String num;
    String name;

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public emp(String num, String name) {
        this.num = num;
        this.name = name;
    }

    public emp()
    {

    }
}
class mymap
{
    public mymap()
    {
        //创建一个HashMAP集合,用来存放emp对象
        HashMap<String ,String> map = new HashMap<>();
        //创建emp的子类对象,并初始化
        emp e1 = new emp("004","谢霆锋");
        emp e2 = new emp("012","张三丰");
        emp e3 = new emp("043","林青霞");
        emp e4 = new emp("021","梁静茹");
        emp e5 = new emp("005","狂三");

        //将对象添加到集合里面去
        map.put(e1.getNum(),e1.getName());
        map.put(e3.getNum(),e2.getName());
        map.put(e2.getNum(),e3.getName());
        map.put(e5.getNum(),e4.getName());
        map.put(e4.getNum(),e4.getName());
        //创建一个set集合用来接收map集合里面的key集合
        Set<String> set = map.keySet();
        //创建一个map的迭代器
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext())
        {
            String i = iterator.next();
            String name = map.get(i);
            System.out.println(i+","+name);
        }
        //===============
        //创建一个有序的Treemap
        TreeMap<String ,String > map1 = new TreeMap<>();
        map1.putAll(map);
        //创建一个set集合用来存放

        Iterator iterator1 = map1.entrySet().iterator();

        System.out.println(map1.entrySet().toString());
//        while (iterator1.hasNext())
//        {
//
////            System.out.println(s);
//        }
    }

}