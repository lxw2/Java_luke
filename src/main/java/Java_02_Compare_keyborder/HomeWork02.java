package Java_02_Compare_keyborder;


import java.util.Scanner;

public class HomeWork02 {
    public static void main(String[] args) {
        //新建两个play对象,并对其初始化
        //初始化后的两个对象,调用对战
        Scanner sc = new Scanner(System.in);
        int num = 0;
        Player player3 = new Player("叶修",0,500.0);
        Player player2 = new Player("唐柔",1,500.0);
        System.out.println("当前有两只英雄");
        System.out.println("1.叶修");
        System.out.println("2.唐柔");
        System.out.println("请输入你要选择的英雄 1/2");
        Player player1;
        int number = sc.nextInt();
        if (number == 1)
        {
            player1 = player3;
        }else
        {
            player1 = player2;
        }
        //创建一个输入选项,用来提供用户选择是否打怪
        while (true)
        {

        while (true) {
            System.out.println("是否外出打怪!1/0 = 是/否");
            Scanner scanner = new Scanner(System.in);
            num = scanner.nextInt();
            if (num >0) {
                break;
            } else if (num == 0) {
                System.out.println("不去打怪你要干嘛?");
            }
        }
            switch (num)
            {
                case 1:
                    master ma   = new master("史莱姆",200.0,2);
                    player1.Daguai(ma);
                    System.out.println("前方遇到一只怪物"+ma.getName()+",将敌方击杀!");
                    System.out.println("获得"+ma.getExp()+"exp!");
                    Levelup(player1);
                    break;
                case 2:
                    System.out.println(player1.getName()+"出去逛了一圈并没有发现怪物");
                    break;
                case 10:
                    System.out.println("本次冒险结束!");
                    System.exit(0);
            }

        }

    }
    public static int Levelup(Player player)
    {
        //判断闯入的player的exp有没有达到规定的局限
        if(player.explimt>1500)
        {
            System.out.println("你升级啦");
            int temp = player.getLevel() + 1;
            player.setLevel(temp);
            player.explimt = 0;
        }
        return player.getLevel();
    }
}
/*
*
* 1. 定义一个名为Fight接口，抽象方法：void? DaGuai( );
	2. 定义“玩家”类Player实现Fight接口，
	成员属性：姓名name(String类型)、等级Level(int类型)，攻击力power(double类型)，属性用私有修饰。
	生成空参和满参构造、get/set方法。
	重写抽象方法void DaGuai( )：输出格式：XXX正在打怪。（xxx为player的玩家姓名）

	3. 在测试类中：
	a.定义一个有返回值的LevelUp(Player p)的方法，将传入的玩家等级加上2，攻击力加1000，在控制台输出：
		恭喜玩家XXX升级啦！并返回升级后的该玩家对象。（XXX为该玩家的姓名）
		b.在main方法中创建两个玩家对象，属性分别赋值为：叶修、5、1000，唐柔、3、300；
		名字为叶修的玩家对象调用DaGuai方法；
		调用LevelUp(Player p)方法，传入玩家姓名为叶修的玩家对象，获取返回值
		将升级后的姓名为叶修的玩家对象和没有升级的姓名为唐柔的玩家对象的所有属性打印在控制台上。*/
class Player implements Fight
{
    //成员属性:姓名,等级,攻击
    private String name ;
    private int  Level =0;
    private double power ;
    int explimt = 0;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return Level;
    }

    public void setLevel(int level) {
        Level = level;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public Player(String name, int level, double power) {
        this.name = name;
        Level = level;
        this.power = power;
    }

    public Player() {
    }

    public void Daguai(Player player) {
        //传入怪物的信息,然后,
    }
    public void Daguai(master ma) {
        //传入怪物的信息,然后,
        explimt+=ma.getExp();
    }


}
class master
{
    //创建一个怪物的类
    //成员属性有名字,攻击,等级,携带的经验
    private String name;
    private double attack;
    private int level;
    private int exp = 1000;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAttack() {
        return attack;
    }

    public void setAttack(double attack) {
        this.attack = attack;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public master(String name, double attack, int level) {
        this.name = name;
        this.attack = attack;
        this.level = level;
        this.exp *= level;//经验值为等级乘以初始经验值
    }

    public master() {
    }
}
interface Fight
{
    //创建一个抽象方法Daguai(master a)
     void Daguai(master ma);
}
