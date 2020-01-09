package Java_02_Compare_keyborder;

public class interface_test implements test03{
    public static void main(String[] args) {

    }

    @Override
    public void test01() {

    }

    @Override
    public void show() {

    }

    @Override
    public void show(int i) {

    }
}
interface test01
{
    public void test01();
}
interface test02
{
    public void show();
}
interface test03 extends test01,test02
{
    public void show(int i);
}
abstract class test04
{

}
