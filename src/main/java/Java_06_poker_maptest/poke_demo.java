package Java_06_poker_maptest;

import java.util.*;

public class poke_demo {
    public static void main(String[] args) {
        //定义两个数组
        String[] mag = {"♦","♠","♥","♣"};
        String[] add = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
        //定义一个map集合
        TreeMap<Integer,String> map = new TreeMap<Integer, String>();
        //用for循环,把数组添加到集合中
        int num =0;
        for (String s :add)
        {
            for (String st:mag)
            {
                map.put(num,st+s);
                num++;
            }
        }
        {
            map.put(num,"小王");
            num++;
            map.put(num,"大王");
        }
        System.out.println(map);
        //获取map的键值集合,并洗牌打乱
        Set<Integer> integers = map.keySet();
        System.out.println(integers);
        //创建一个arraylist的对象
        ArrayList<Integer> integers1 = new ArrayList<>();
        System.out.println(integers1);
        Iterator<Integer> integerIt = integers.iterator();
        int numm=0;
        while (integerIt.hasNext())
        {
            numm = integerIt.next();
            integers1.add(numm);
        }
        System.out.println(integers1);
       /* for (Integer o:integers)
        {
            System.out.println(integers1);
            integers1.add(o);
        }*/

        Collections.shuffle(integers1);
        //创建三个Treeset集合,用来存放三个玩家的引索值
        TreeSet<Integer> lqxSet = new TreeSet<>();
        TreeSet<Integer> lySet = new TreeSet<>();
        TreeSet<Integer> fqySet = new TreeSet<>();
        TreeSet<Integer> dpSet = new TreeSet<>();
        //通过for循环,将牌分给三个集合
        for(int i = 0;i<integers1.size();i++)
        {
            if (i>=integers1.size()-3)
            {
                int d = integers1.indexOf(i);
                dpSet.add(integers1.indexOf(i));
            }
             else if (i%3 == 0)
            {
                int d = integers1.indexOf(i);
                lqxSet.add(integers1.indexOf(i));
            }
            else if (i%3 == 1)
            {
                int d = integers1.indexOf(i);
                lySet.add(integers1.indexOf(i));
            }
            else if (i%3 == 2)
            {
                int d = integers1.indexOf(i);
                fqySet.add(integers1.indexOf(i));
            }
        }
        //将分配完的引索打印出来
        System.out.println(lqxSet);
        System.out.println(lySet);
        System.out.println(fqySet);
        System.out.println(dpSet);
        //创建一个方法,传入treemap以及引索

        methon(map,lqxSet,"林青霞");
        methon(map,lySet,"刘岩");
        methon(map,fqySet,"风清扬");
        methon(map,dpSet,"底牌");
    }
    public static void methon(TreeMap<Integer,String> map,TreeSet<Integer> a,String name)
    {
        System.out.print(name+"{");
        for (Integer d : a)
        {
            System.out.print(map.get(d)+",");
        }
        System.out.println("}");
    }
}
