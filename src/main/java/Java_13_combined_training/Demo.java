package Java_13_combined_training;


import org.junit.Test;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Demo {
    public static void main(String[] args) throws IOException, ParseException {
//        new test01();
//        new test02();
//        new test03();
//        new test04();
//        new test05();
//        new test06();
//        new test07();
//        new test08();
        new class_8();
    }
    @Test
    public void test02()
    {
        //创建一个Integer的集合用来存放蓝色球和红色球的码
        List<Integer> list = new ArrayList<>();
        //创建两个随机数,分别控制红球和篮球
        Random random = new Random();
        int red  =6;
        int bule ;
        while (list.size()<red)
        {
            int redball = random.nextInt(33)+1;
            list.add(redball);
        }
        bule = random.nextInt(16)+1;
        list.add(bule);

        //遍历list集合
        for (Integer i : list)
        {
            if (i == list.get(6))
            {
                System.out.println("篮球:"+i+" ");
                break;
            }
            System.out.print("红球:"+i+" ");
        }
    }

}

/*
* 产生10个1­100的随机数，并放到一个数组中，把数组中大于等于10的数字放到一个list集合中， 并打印到控制台。
 */
class test01
{
    public test01()
    {
        //创建一个list集合,用来存放随机数字
        List<Integer> list = new ArrayList<>();
//创建一个循环,用来
// 创建一个随机数
            Random ran =new Random();
        while(list.size()<10)
        {

            int num = ran.nextInt(100)+1;
            //做判断,是否大于10
            if (num>=10)
            {
                list.add(num);
            }
        }
        //用增强for循环将集合打印出来
        System.out.print("{");
        for (Integer i : list)
        {
            System.out.print(i+" ");
        }
        System.out.println("}");

    }
}

/*
*
* 双色球规则：双色球每注投注号码由6个红色球号码和1个蓝色球号码组成。
* 红色球号码从1—33中 选择；
* 蓝色球号码从1—16中选择；
* 请随机生成一注双色球号码。
* （要求同色号码不重复）*/
class test02
{
    @Test
    public void test02()
    {
        //创建一个Integer的集合用来存放蓝色球和红色球的码
        List<Integer> list = new ArrayList<>();
        //创建两个随机数,分别控制红球和篮球
        Random random = new Random();
        int red  =6;
        int bule ;
        while (list.size()<red)
        {
            int redball = random.nextInt(33)+1;
            list.add(redball);
        }
        bule = random.nextInt(16)+1;
        list.add(bule);

        //遍历list集合
        for (Integer i : list)
        {
            if (i == list.get(6))
            {
                System.out.println("篮球:"+i+" ");
                break;
            }
            System.out.print("红球:"+i+" ");
        }
    }
}

/*
* 分别用Comparable和Comparator两个接口对下列四位同学的成绩做降序排序，
* 如果成绩一样， 那在成绩排序的基础上按照年龄由小到大排序。
* 姓名（String） 年龄（int） 分数（float）
    liusan 20 90
    lisi 22 90
    wangwu 20 99
    sunliu 22 100
 */
class test03
{
    public test03()
    {
        //调用treeset来进行排序
        //创建已给treeset
        TreeSet<Student> stuSet = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                //主排序方法是成绩,成绩一样的条件下按照年龄
//                return 0;
                int num = o1.getSort()>o2.getSort()? 1:(o1.getSort()==o2.getSort()? (o1.getAge()>o2.getAge()? 1:-1):-1);
                return num;
            }
        });
        //创建学生对象
        Student student1 = new Student("liusan",22,90);
        Student student2 = new Student("lisi",22,98);
        Student student3 = new Student("wangwu",20,69);
        Student student4 = new Student("sunliu",21,100);

        //将4个学生对象不按顺序添加到set
        stuSet.add(student2);
        stuSet.add(student4);
        stuSet.add(student3);
        stuSet.add(student1);

        System.out.println("姓名\t年龄\t分数\t");
        //遍历集合
        for (Student s: stuSet)
        {
            System.out.println(s.getName()+"\t"+s.getAge()+"\t\t"+s.getSort());
        }
    }
}
class Student
{
    private String name;
    private int age;
    private float sort;

    public Student(String name, int age, float sort) {
        this.name = name;
        this.age = age;
        this.sort = sort;
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

    public float getSort() {
        return sort;
    }

    public void setSort(float sort) {
        this.sort = sort;
    }

    public Student()
    {
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sort=" + sort +
                '}';
    }
}


/*、有2个数组，
第一个数组内容为：[黑龙江省,浙江省,江西省,广东省,福建省]，
第二个数组为：[哈尔滨,杭州,南昌,广州,福州]，将第一个数组元素作为key，
第二个数组元素作为value存储到Map集合中。 如{黑龙江省=哈尔滨, 浙江省=杭州, …}。
 */
class test04
{
    public test04()
    {
        //创建两个数组
        String[] pro = {"黑龙江省","浙江省","江西省","广东省","福建省"};
        String[] city = {"哈尔滨","杭州","南昌","广州","福州"};
        //创建一个map集合
        Map<String,String> cityMap = new HashMap<>();
        //通过遍历的方式给map集合赋值
        for (int i = 0;i<pro.length;i++)
        {
//            String a = pro[i];
//            String b = city[i];
            cityMap.put(pro[i],city[i]);
        }
        System.out.println(cityMap);
    }
}

/*
* 五、统计下面这段话中中字母'A'和'a'出现的总次数(把这段话放入article.txt中)
As a small kid, I want to grow up soon, so that I can be independent. 
But the adults always tell me that it is a lucky thing to be a child, 
because I can be young and innocent. Though I don’t understand their words totally, 
I must keep my young heart and enjoy every moment of my life.   */
class test05
{
    public test05() throws IOException {
        //定义一个int型用来记录A和a出现的次数
        int anum =0;
        int Anum = 0;
        int strl  =0;

        //创建输入流,将文件内的内容读取出来
        BufferedReader br = new BufferedReader(new FileReader("IDEA\\article.txt"));


        /*方法1:用截取的方法,将每次出线A或者小a的字符串截取下来并且计数变量加1

        方法2;用正则表达式进行分割成数组,通过获取数组的长度-1,便可以得出各自的次数
        * */
        //读取文件
        String data;
        while ((data =br.readLine ())!=null)
        {
            int count =0;
            //indexOf(int ch)
            //          返回指定字符在此字符串中第一次出现处的索引
            //substring(int beginIndex)
            //          返回一个新的字符串，它是此字符串的一个子字符串。
            while (count<data.length())
            {
            int leng =data.length();
                    int starindex = data.indexOf('A',count);
//                    data = data.substring(starindex+1);
                if (starindex!=-1)
                {
                    count += starindex+1;
                    Anum++;
                }else
                {
                    break;
                }

            }
            /*while (data.indexOf('a')!=-1)
            {

                int starindex = data.indexOf('a');
                data = data.substring(starindex+1);
                anum++;
            }*/
            //方法2
            //用正则分组的方式
            /*if (data.indexOf('A')!=-1)
            {
                String[] as = data.split("A");
                Anum+=(as.length-1);
            }*/
//            System.out.println(data);
        }
        System.out.println("A有:"+Anum);
        System.out.println("a有:"+anum);
    }
}

/*
* A(8),B(16),C(10)...,a(12),b(10),c(3)....，括号内代表字符出现次数*/
class test06
{
    public test06() throws IOException {
        //调用Map的集合,用来存储各个字母(key)次数(value)
        Map<Character,Integer> numMap = new HashMap<>();
        //先将map集合里面value进行0初始化
        //进行字符串的遍历,每次出现对应的字符,便找到对应的字符(key)键,在其value值+1
        for (char ch = 'A',zh ='a';ch<'Z';ch++,zh++)
        {
            numMap.put(ch,0);
            numMap.put(zh,0);
        }
        System.out.println(numMap);
        //获取map集合的键集合,遍历键集合,用Char方法,获取字符串里面的值,用来寻找nummap中对应的键值
        //获取数据
        BufferedReader br = new BufferedReader(new FileReader("IDEA\\article.txt"));
        String data ;
        while ((data = br.readLine())!=null)
        {
            int index;
            Integer integer;
            //遍历获得的字符串
            System.out.println(data);
            for (index = 0;index<data.length();index++)
            {
                char b = data.charAt(index);
                if (((data.charAt(index)>='a')&&(data.charAt(index)<='z'))||((data.charAt(index)>='A')&&(data.charAt(index)<='Z')))
                {
                    char a = data.charAt(index);

                    numMap.put(data.charAt(index),numMap.get(data.charAt(index))+1);

                }
            }
        }
        System.out.println(numMap);


    }

}

/*
*  在当前项目根目录下创建一个data.txt文件，通过输出流写入如下内容:
 1993­08­10,小刚
 1996­10­10,小智
 1995­04­01,武藏
使用输入流获取data.txt文件中的内容，计算出小智、小刚、武藏的年龄（没过生日不算年龄增加），
 并将生日及年龄按照如下格式在控制台打印出来:

 并将生日及年龄按照如下格式在控制台打印出来:
 小智生日是:1996­10­10,年龄21
 小刚生日是:1993­08­10,年龄24
 武藏生日是:1995­04­01,年龄23
*/
class test07
{
    public test07() throws IOException, ParseException {
        /*
        * 在当前项目根目录下创建一个data.txt文件，通过输出流写入如下内容:
         1993­08­10,小刚
         1996­10­10,小智
         1995­04­01,武藏
        */
        //创建输出流
        BufferedWriter bw = new BufferedWriter(new FileWriter("IDEA\\data.txt"));
        bw.write("1993-08-10,小刚");
        bw.newLine();
        bw.flush();
        bw.write("1996-10-10,小智");
        bw.newLine();
        bw.flush();
        bw.write("1995-04-01,武藏");
        bw.newLine();
        bw.flush();

        //创建输入流,读取文件中的数据,并且根据,来拆分字符串
        BufferedReader br = new BufferedReader(new FileReader("IDEA\\data.txt"));

        String data ;
        while ((data = br.readLine())!=null)
        {
            String[] split = data.split(",");
            System.out.print(split[1]+"的生日是:"+split[0]+",");
            Date date = new Date();
            long time = date.getTime();
//            split[0];
            SimpleDateFormat sim = new SimpleDateFormat("yyyy-MM-dd");
            Date d = sim.parse(split[0]);
            long c = time - d.getTime();
            long l = c / 1000 / 60 / 60 / 24 / 365;
            System.out.println("年龄"+l);
            //先定义格式输出的是yyyy-mm-dd

        }

        //并将生日及年龄按照如下格式在控制台打印出来:
        // 小智生日是:1996­10­10,年龄21
        // 小刚生日是:1993­08­10,年龄24
        // 武藏生日是:1995­04­01,年龄23

        //getTime()
        //          返回自 1970 年 1 月 1 日 00:00:00 GMT 以来此 Date 对象表示的毫秒数。
        //format(Date date)
        //          将一个 Date 格式化为日期/时间字符串。
        // parse(String source)
        //          从给定字符串的开始解析文本，以生成一个日期。


        //关闭资源
        bw.close();

    }

}

class test08
{
    /*
    *  1.在项目根目录下新建一个文件：code.txt。
     2.在main方法中完成以下操作：
        2.1提示键盘录入3个字符串作为验证码，通过输出流存入code.txt中，要求一个验证码占一行；
        2.2通过输入流读取code.txt文件中的所有内容。
        2.3提示键盘录入一个需要被校验的验证码（验证时忽略大小写），最多只能输入3次
        如果输入的验证码在code.txt中存在：在控制台提示验证成功，并结束程序。
        如果输入的验证码在文件中不存在：
          ①当输入次数小于3时，控制台提示"验证失败"，并可继续输入下次验证；
          ②当输入次数等于3时，控制台提示"错误输入已经达到3次，请明天再登陆"，并结束程序）。*/
    public test08() throws IOException {
        //封装一个根目录文件(code.txt).
        File codefile = new File("IDEA\\code.txt");
        //判断文件是否存在,如果不存在便创建
        if (!codefile.exists())
        {
            System.out.println(codefile.createNewFile());
        }
        //创建一个输出流,将键盘录入的数据添加到文件中去
//        FileOutputStream fop = new FileOutputStream(codefile,true);
//       byte bys = new byte[1];

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new FileOutputStream(codefile),true);
        String s ;
        //传三个字符串作为验证码到文件code中
        System.out.println("请定义你的验证码:");
        for (int i = 0;i<3;i++)
        {
            s = br.readLine();
            pw.println(s);
        }
//        pw.println();
//        pw.write(s,0,s.length());
//        pw.println();
//        pw.write(s,0,s.length());
        //初始化定义的遍历
        String answer=null;
        String c = "";
        int num =0;
        //判断是否匹配,匹配就跳出循环
        while (!c.equals(answer))
        {
            //判断次数
            if (num>3)
            {
                System.out.println("请明天再来");
                return;
            }
            System.out.println(c);
            System.out.println("请输入你的验证码:");
            //定义键盘输入流
            BufferedReader brrr = new BufferedReader(new InputStreamReader(System.in));
            answer = brrr.readLine();
            //读取文件数据进行匹配
            BufferedReader brr = new BufferedReader(new FileReader(codefile));
            c = brr.readLine();
            //验证次数+1
            num++;

        }
        System.out.println("验证成功!");








        br.close();
//        pw.close();
    }
}

class class_8 {
    public class_8() throws IOException {
        //键盘输入流
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //写到文件中
        BufferedWriter bw = new BufferedWriter(new FileWriter("IDEA\\code.txt"));
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入第" + (i + 1) + "个验证码：");
            String line = br.readLine();
            bw.write(line, 0, line.length());
            bw.newLine();
            bw.flush();
        }

        //判断输入的字符是否相同

        //读文件中的内容
//        BufferedReader brr = new BufferedReader(new FileReader("IDEA\\code.txt"));
//        String line;
            int count = 0;
            Scanner sc = new Scanner(System.in);
            String s = "";
            while (count<3) {
            System.out.println("请输入你的验证码：");
            s=sc.nextLine();
            System.out.println(s);
//                    System.out.println(line);
                BufferedReader brr = new BufferedReader(new FileReader("IDEA\\code.txt"));
                String line ="";
                for (int i=0;i<3;i++)
                {
                    line = brr.readLine();
                    if (s.equals(line)) {
                        System.out.println("验证成功！");
                        return;
                    }
                }
                count++;
                System.out.println("验证失败！请重新输出");
        }
        System.out.println("错误三次了");
        /*br.close();
        bw.close();
        brr.close();*/
    }

}
