package Java_09_Guessgame_print;

import java.io.*;
import java.util.Properties;

public class pro_test {
    public static void main(String[] args) throws IOException {
/*        Properties prpo = new Properties();


        prpo.put("itiheima001","林青霞");
        prpo.put("itiheima002","风清扬");
        prpo.put("itiheima003","张曼玉");
        prpo.put("itiheima004","王祖贤");

        //遍历
        Set<Object> keyset = prpo.keySet();
        for (Object key:keyset)
        {
            Object value =prpo.get(key);
            System.out.println(key+","+value);
        }*/
//new protest02();
        new protest03();
    }
}
class protest02
{
    public protest02() throws IOException {
        Properties prpo = new Properties();
        prpo.setProperty("itiheima001","林青霞");
        prpo.setProperty("itiheima002","张曼玉");
        prpo.setProperty("itiheima003","风情呀");

        /*
        *  public synchronized Object setProperty(String key, String value) {
                return put(key, value);
            }

            public synchronized Object put(Object key, Object value) {
                return map.put(key, value);
            }
        * */

        /*Set<String> names = prpo.stringPropertyNames();
        for (String key: names)
        {
            System.out.println(prpo.getProperty(key));
        }*/
        FileWriter fw = new FileWriter("IDEA\\word.txt");

        prpo.store(fw,"我是什么东西");

        fw.close();
    }
}
class protest03
{
    public protest03() throws IOException {
        Properties prop = new Properties();

        FileReader fr = new FileReader("IDEA\\word.txt");

        PrintStream ps = new PrintStream(new FileOutputStream(new File ("IDEA\\COPY.txt")));
        prop.load(fr);
        //输出到打印流
        prop.list(ps);
        System.out.println(prop);
        fr.close();

    }
}