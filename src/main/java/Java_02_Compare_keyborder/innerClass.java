package Java_02_Compare_keyborder;

public class innerClass {
    public inner show()
    {
        inner i = new inner();
        return i;
    }
     static class inner
    {
        public void show()
        {
            System.out.println("666");
        }
    }
    class inner2
    {
        public void show2()
        {
            System.out.println("777");
        }

    }
}
class demo
{
    public static void main(String[] args) {
        innerClass innerClass = new innerClass();
        innerClass.show();
        Java_02_Compare_keyborder.innerClass.inner inner = new innerClass.inner();
        inner.show();
        innerClass.new inner2().show2();
    }
}
