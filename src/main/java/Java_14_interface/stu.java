package Java_14_interface;

public class stu implements teach {
    private String name;

    public String getName() {
        return name;
    }

    public stu() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public stu(String name) {
        this.name = name;
    }

    @Override
    public void show() {
        System.out.println("我实现了接口");
    }

    @Override
    public void ToString() {

    }
}
