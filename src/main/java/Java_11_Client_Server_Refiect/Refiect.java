package Java_11_Client_Server_Refiect;


import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Refiect {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
/*        //系统类加载器
        ClassLoader c = ClassLoader.getSystemClassLoader();
        System.out.println(c);

        ClassLoader B =c.getParent();
        System.out.println(B);

        ClassLoader d = B.getParent();
        System.out.println(d);*/

        Class<Student> studentClass = Student.class;
        System.out.println(studentClass);

        Class<Student> studentClass1 = Student.class;
        System.out.println(studentClass == studentClass1);

        Student s = new Student();
        Class<? extends Student> aClass = s.getClass();
        System.out.println(studentClass == aClass);

        //========================
        Class<?> aClass1 = Class.forName("Java_11_Client_Server_Refiect.Student");
        Constructor<?>[] constructors = aClass1.getConstructors();
        Constructor<?>[] declaredConstructor = aClass1.getDeclaredConstructors();
        System.out.println(constructors);
        for (Constructor con:declaredConstructor)
        {
            System.out.println(con);
        }

        //=======================
        Constructor<?> constructor = aClass1.getConstructor(String.class, String.class, String.class);


        Object object = constructor.newInstance("lin ","213","阿西");
        //创建一个对象,调用对象的getClass
        Student ss = (Student)object;
        String name = ss.getName();
        System.out.println(name);
    }

}

class Student
{
    private String name ;
     String age ;
    public String locat ;

    public void  show()
    {
        System.out.println("show");
    }

    private void methon(String age)
    {
        System.out.println("methon");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getLocat() {
        return locat;
    }

    public void setLocat(String locat) {
        this.locat = locat;
    }

    public Student(String name, String age, String locat) {
        this.name = name;
        this.age = age;
        this.locat = locat;
    }

    public Student() {
    }
}

