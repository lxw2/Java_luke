package Java_12_refiect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class refiect {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //获得一个字节码类对象
        Class<?> aClass = Class.forName("Java_12_refiect.teacher");
        //调用类的构造方法
        Constructor<?>[] declaredConstructors = aClass.getDeclaredConstructors();
        System.out.println(declaredConstructors);
        for (Constructor con:declaredConstructors)
        {
            System.out.println(con);
        }
        System.out.println(declaredConstructors[1]);
        Object object = declaredConstructors[1].newInstance("li闹情");

        Method[] declaredMethods = aClass.getDeclaredMethods();
        for (Method d:declaredMethods)
        {
            System.out.println(d);
        }
        Method declaredMethod = declaredMethods[2];
        declaredMethod.setAccessible(true);
        declaredMethod.invoke(object,"linxinxia");

    }
}
class teacher
{
    private String name;
    private  void teach(String n)
    {
        System.out.println("真的要好好学习");
    }
    public void show()
    {
        System.out.println("好好学习天天向上");
    }
    public teacher() {
    }

    public teacher(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
