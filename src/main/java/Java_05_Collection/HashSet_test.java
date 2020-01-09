package Java_05_Collection;

import java.util.HashSet;

public class HashSet_test {
    public static void main(String[] args) {

        HashSet<String> set = new HashSet<String>();

        set.add("hello");
        set.add("hello");
        set.add("world");

        System.out.println(set);
    }
    private String name;
    public HashSet_test(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HashSet_test that = (HashSet_test) o;

        return name != null ? name.equals(that.name) : that.name == null;
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
