package Java_04_Date_tran;

public class except_test {
    public static void main(String[] args) {
        System.out.println("开始");
        try{

            method();
        }catch (ArrayIndexOutOfBoundsException e)
        {
            e.getStackTrace();
        }
        System.out.println("结束");
    }
    //编译时异常
/*    public static void methon2()
    {
        try {
            String s = "2048-08-09";
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
            Date d = sdf.parse(s);
            System.out.println(d);
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }*/
    //运行时异常
    public static void method() throws ArrayIndexOutOfBoundsException {

            int[] arr = {1, 2, 3};
            System.out.println(arr[3]);//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3

    }
}

