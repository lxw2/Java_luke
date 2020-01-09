package Java_05_Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Collection_test02 {
    public static void main(String[] args) {
        //创建集合对象
        List<String> list = new ArrayList<String>();

        //添加对象
        list.add("Hello");
        list.add("world");
        list.add("java");
        list.add("java");
        //输出集合对象


        //用迭代器的方法
//        Iterator<String> iterator = list.iterator();
//        while (iterator.hasNext()) {
//            String s = iterator.next();
//            if (s.equals("world"))
//            {
//                list.add("world");
//            }
//        }
//        for (int i = 0;i<list.size();i++)
//        {
//            if(list.get(i).equals("world"))
//            {
//                list.add("world");
//            }
//        }
        ListIterator<String> iterator = list.listIterator();
        while (iterator.hasNext()) {
            String s = iterator.next();
            if (s.equals("java"))
            {
                iterator.add("ja");
            }
            System.out.println(list);
        }

//        for (String a:list)
//        {
//            System.out.println(a);
//            if (list.get(2).equals(a))
//            {
//                break;
//            }
//        }
    }
}
