package Java_02_Compare_keyborder;


import java.util.ArrayList;

/*
第一题:
	一、有以下数据：
	1.三个老师信息：
	教师编号	姓名	性别	年龄		科目
	t001			薛之谦	男		26		Java
	t002			张碧晨	女		24		IOS
	t003			张杰	男		28		Java
	2.存储两个科目信息：
	课程编号	名称	创建时间	课程描述
	s001			Java		2007-02-08	Java学科，包含JavaSE和JavaEE
	s002			IOS		2007-02-09	IOS系统开发
	二、请分别定义两个类；
	三、创建MainApp类中，包含main()方法，创建相应对象，通过构造方法给成员变量赋值。
	四、打印每个对象的所有属性。
	要求：每个类要按照封装的原则进行定义。并提供无参和全参的构造方法。
	1.2．操作步骤描述
	设计类：Teacher(教师类)和Course(课程类)
	为每个类设计“成员属性”
	定义两个类
	定义MainApp类，包含main()方法，分别创建对象存储数据。
*/
public class HomeWork {
    public static void main(String[] args) {
        //创建一个平面
        System.out.println("教师编号    姓名  性别  年龄  科目");
        tescher t1 = new tescher("薛之谦",26,"男","t001");
        tescher t2 = new tescher("张碧晨",24,"女","t002");
        tescher t3 = new tescher("张杰",28,"男","t003");
        //创建课程的对象
        subject sub = new subject("s001","Java","2007-02-08","java学科,包含JavaSE和JavaEE");
        subject sub1 = new subject("s002","IOS","2007-02-09","IOS系统开发");
        ArrayList<tescher> teschers = new ArrayList<>();
        teschers.add(t1);
        teschers.add(t2);
        teschers.add(t3);
        for (int i = 0;i<teschers.size();i++)
        {
            System.out.println(teschers.get(i).getTecnum()+"\t"+teschers.get(i).getName()+"\t"+teschers.get(i).getSex()+"\t"+teschers.get(i).getAge()+"\t"+sub.getName());
        }
    }
}

class per {
    private String name;
    private int age;
    private String sex;

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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public per(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public per() {
    }
}

class tescher extends per {
    private String tecnum;

    public String getTecnum() {
        return tecnum;
    }

    public void setTecnum(String tecnum) {
        this.tecnum = tecnum;
    }

    public tescher(String name, int age, String sex,String tecnum) {
        super(name, age, sex);
        this.tecnum = tecnum;
    }

    public tescher() {
    }
}

class subject
{
    private String classnum;
    private String name;
    private String creatTime ;
    private String derc;

    public String getClassnum() {
        return classnum;
    }

    public void setClassnum(String classnum) {
        this.classnum = classnum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(String creatTime) {
        this.creatTime = creatTime;
    }

    public String getDerc() {
        return derc;
    }

    public void setDerc(String derc) {
        this.derc = derc;
    }

    public subject(String classnum, String name, String creatTime, String derc) {

        this.classnum = classnum;
        this.name = name;
        this.creatTime = creatTime;
        this.derc = derc;
    }

    public subject() {
    }
}
