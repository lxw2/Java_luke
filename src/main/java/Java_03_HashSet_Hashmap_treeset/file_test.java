package Java_03_HashSet_Hashmap_treeset;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class file_test {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\学习\\bigData\\IDEA\\WO.txt");
        System.out.println(file.isDirectory());
        System.out.println(file.isFile());
        System.out.println(file.isAbsolute());
        System.out.println(file.exists());
        FileInputStream input = new FileInputStream(file);
        input.read();
        /*
        * public int read() throws IOException {
            return read0();
            }

            private native int read0() throws IOException;
        * */
    }
}
class file01
{
    public file01()
    {

    }
}