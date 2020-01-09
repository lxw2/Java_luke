package Java_01_abstract;

public class abstract_test {
    public static void main(String[] args) {
//        dog dog1 = new dog();
//        dog1.show();
       student student= new student("柳柴");
        student student1 = new student("柴柕");
        int i = student.getClass().hashCode();
        int c = student1.getClass().hashCode();
        System.out.println(i);
        System.out.println(c);
        System.out.println(student);
        System.out.println(student1);
    }
}
class dog extends Animal
{
    @Override
    public void show()
    {
        System.out.println("666");
    }
    public void show2()
    {

    }
}
abstract class Animal extends Anima2
{
     public  abstract void show();
     public Animal()
     {
         System.out.println("Animal");
     }
}
abstract class Anima2
{
     public  abstract void show2();
     public Anima2()
     {
         System.out.println("Anima2");
     }
}

class student
{
    private String name;

    public student() {
    }

    public student(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        student student = (student) o;

        return name != null ? name.equals(student.name) : student.name == null;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
