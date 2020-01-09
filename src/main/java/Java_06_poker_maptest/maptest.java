package Java_06_poker_maptest;

import java.util.*;

public class maptest {
    public static void main(String[] args) {
        char[] test = {'a','c','d','a','d','d','c','a','d','d','d','a'};
        //需求,做一个map集合,获取每个字母出现的次数
        //a = 4;
        //定义一个map的集合
        Map<Character,Integer> map = new HashMap<>();
        //map集合需要传入一个Key以及一个value值
        //首先通过增强for获取数组里面的字符,作为map的key值
        //通过判断是否存在来计算出现的次数
        //定义三个变量分别计算三个字母出现的次数
/*        for (Character ch : test)
        {
            if (map.containsKey(ch))
            {
                int num = map.get(ch);
                map.put(ch,num+1);
            }
            else
            {♦♣♥♠
                map.put(ch,1);
            }
        }*/
        for (Character ch:test)
        {
            map.put(ch,map.containsKey(ch)? (map.get(ch)+1):1);
//            TreeSet<String> se = new TreeMap<Object, Object>();
        }
        System.out.println(map);
    }
}
