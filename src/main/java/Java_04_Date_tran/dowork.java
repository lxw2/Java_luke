package Java_04_Date_tran;

import java.text.SimpleDateFormat;
import java.util.Date;

public class dowork {
    public static void main(String[] args) {
        Date date = new Date();

        System.out.println(Dateutil.DateToString(date,"yyyy-MM-dd a,z H:mm:ss"));
    }
}

/*
 * 创建一个工具类
 * 用来进行Date和String的转换
 *
 * */
class Dateutil {
    /*
    * SimpleDateFormat()
          用默认的模式和默认语言环境的日期格式符号构造 SimpleDateFormat。
    SimpleDateFormat(String pattern)
          用给定的模式和默认语言环境的日期格式符号构造 SimpleDateFormat。
    SimpleDateFormat(String pattern, DateFormatSymbols formatSymbols)
          用给定的模式和日期符号构造 SimpleDateFormat。
    SimpleDateFormat(String pattern, Locale locale)
          用给定的模式和给定语言环境的默认日期格式符号构造 SimpleDateFormat

    * */
    public static String DateToString(Date date,String format) {
        //工具需求:返回一个给定格式的DateString类型的值
        SimpleDateFormat dateFormat = new SimpleDateFormat(format);
        return dateFormat.format(date);
    }
// 将传入的字符串转化为Date类型
    public Date StringToDate(String fromat) {
        //定义一个
        return null;
    }
}
