package Java_09_Guessgame_print;

public class Demo {
    public static void main(String[] args) {
        //测试类,
        /*
        * 创建奶箱对象,-------->共享数据区域
        * 创建生产者对象,把奶香对象做成构造方法参数传递,因为要调用存储牛奶操作
        * 创建消费者对象,把奶香对象作为构造方法参数传递,因为要调用获取牛奶的操作
        * 创建两个线程,一个是生产者的一个是消费者的
        * 启动线程
        * */
        //创建奶箱对象
        Box milkbox = new Box();
/*        Customer customer = new Customer(milkbox);
        Provider provider = new Provider(milkbox);

        //创建线程对象
        Thread t1 = new Thread(customer);
        Thread t2 = new Thread(provider);*/

        Custer custer = new Custer(milkbox);
        Priver priver = new Priver(milkbox);

        Thread t1 = new Thread(custer);
        Thread t2 = new Thread(priver);
        t1.start();
        t2.start();
    }
}

/*
class Box
{
    private  int milk ;
    //定义一个成员变量来表示奶箱的状态
    private boolean state = false;
    public synchronized void put (int milk)
    {
        //判断如果有牛奶就等待消费,调用wait()方法等待
        if (state)
        {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //判断是奶香中是否有牛奶如果如果没有牛奶就存放牛奶
            this.milk=milk;
            System.out.println("往奶箱中添加了第"+this.milk+"瓶牛奶");
            state = true;
            notifyAll();

    }
    public synchronized void get()
    {
        //判断是否有牛奶,没有牛奶就等待放牛奶
        if (!state)
        {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("用户拿到第"+this.milk+"瓶奶");
        notifyAll();
        state = false;
    }
}
class Provider implements Runnable
{
    private Box b;
    public Provider(Box b)
    {
        this.b = b;
    }
    @Override
    public void run() {

        for(int i =1;i<=5;i++)
        {
            b.put(i);
        }

    }
}
class Customer implements Runnable
{
    private Box b;

    public  Customer(Box b)
    {
        this.b = b;
    }
    @Override

    public void run() {
        while(true)
        {
            b.get();

        }
    }
}
*/

class Box
{
    //记录奶箱中的数量
    private int milk;
    //记录奶箱是否有奶的状态
    private boolean state =false;
    //创建两个成员方法put get
    public synchronized void put(int milk)
    {
        this.milk = milk;
        //判断奶箱的状态,如果没奶就要加,有奶就要等待消费
        if (state)
        {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("送奶工往奶箱中添加了第"+this.milk+"瓶奶");
        //添加牛奶后,状态改为true
        state = true;
        notifyAll();
    }
    public synchronized void get()
    {
        //如果奶箱中没有奶的话
        if (!state)
        {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("我往奶箱中拿取第"+this.milk+"瓶奶");
        state = false;
        notifyAll();
    }
}

class Custer implements Runnable
{
    private Box b;
    //与奶箱创建联系,传入一个奶箱对象
    public Custer(Box box)
    {
        this.b = box;
    }

    @Override
    public void run() {
        while (true)
        {
            b.get();
        }
    }
    //调用奶箱的get方法

}

class Priver implements Runnable
{
    private Box b;
    //与奶箱创建联系
    public Priver(Box box)
    {
        this.b = box;
    }

    @Override
    public void run() {
        for (int i =1;i<=50;i++)
        {
            b.put(i);
        }
    }
}

