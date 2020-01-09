package Java_02_Compare_keyborder;

public class keytest {
    public static void main(String[] args) {
        long star = System.currentTimeMillis();
        for (int i = 0;i<10000;i++)
        {

            System.out.println(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("耗时:"+(end-star));
    }
}
