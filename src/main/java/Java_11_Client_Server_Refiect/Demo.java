package Java_11_Client_Server_Refiect;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;


/*
* 需求:客户端向服务端发送用户名以及密码
* 服务端判断对象是否存在,不存在则反馈登录失败
* 创建对象集合
* */
public class Demo {
    public static void main(String[] args) throws IOException {

//        new Server();
        new Server01();
    }
}
class Server
{
    public Server() throws IOException {
        /*常开的服务端,用来接收客户端传过来的数据
        * */
        ServerSocket sk = new ServerSocket(10006);

        //创建一个接收数据输入流
        while(true)
        {
            Socket socket = sk.accept();
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            Stu stu = new Stu();
            String user;
            String password;
            user  = br.readLine();
//            stu.setSuer(user);
            password = br.readLine();
//            stu.setPassword(password);

            ArrayList<Stu> stuarr = new stuarr().show();
            //进行判断
            boolean flag = false;
            //创建一个输出流做反馈
            if(user.equals("张三"))
            {
                flag = true;
            }
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            if (flag)
            {
                bw.write("登录成功");
                bw.newLine();
                bw.flush();
            }else {
                bw.write("登录失败");
                bw.newLine();
                bw.flush();
            }
        }


    }
}

class Stu
{
    private String suer;
    private String password;

    public String getSuer() {
        return suer;
    }

    public void setSuer(String suer) {
        this.suer = suer;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Stu(String suer, String password) {
        this.suer = suer;
        this.password = password;
    }

    public Stu()
    {

    }

    @Override
    public String toString() {
        return "Stu{" +
                "suer='" + suer + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Stu stu = (Stu) o;

        if (suer != null ? !suer.equals(stu.suer) : stu.suer != null) return false;
        return password != null ? password.equals(stu.password) : stu.password == null;
    }

}

class stuarr
{
    public ArrayList<Stu> show()
    {
        //创建对象,并将对象放入集合中去
        Stu s1 = new Stu("张三","123");
        Stu s2 = new Stu("王五","234");
        Stu s3 = new Stu("李四","345");

        ArrayList<Stu> stuArrayList = new ArrayList<>();
        stuArrayList.add(s1);
        stuArrayList.add(s2);
        stuArrayList.add(s3);

        System.out.println(stuArrayList);
        return stuArrayList;
    }
}
class Server01
{
    //创建一个ServerSocket对象
    public Server01() throws IOException {
     /*   ServerSocket s = new ServerSocket(54321);
        //调用监听
        Socket accept = s.accept();
        BufferedReader br = new BufferedReader(new InputStreamReader(accept.getInputStream()));
        String username = br.readLine();
        String password = br.readLine();

        //创建一个Stu对象
        Stu stu = new Stu(username,password);
        //判断数据库中是否存在
        List<Stu> stuarr = stuBD.getStu();

        boolean flag = false;

        if (username.equals("张三"))
        {
            flag = false;
        }
        PrintWriter pw = new PrintWriter(accept.getOutputStream(),true);

        //反馈
        if (flag)
        {
            pw.println("登录成功");
        }
        else
        {
            pw.println("登录失败");
        }
        accept.close();
        s.close();
    }*/
    //创建服务端socket对象
    ServerSocket ss = new ServerSocket(54321);
    //调用服务端socket对象的监听方法
    Socket accept = ss.accept();

    BufferedReader br = new BufferedReader(new InputStreamReader(accept.getInputStream()));
    String username = br.readLine();
    String password = br.readLine();

    //创建user对象
    User u = new User(username,password);

    //判断数据库中是否存在该user对象
    List<User> users = UserDB.getUsers();

    boolean flag = false;

        if (users.contains(u)){
    flag = true;
}

    //        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(accept.getOutputStream()));
    PrintWriter pw = new PrintWriter(accept.getOutputStream(),true);
        if (flag){
    pw.println("登陆成功!");
}else{
    pw.println("登陆失败");
}

        accept.close();
        ss.close();
}
}




class stuBD
{
    public static List<Stu> list = new ArrayList<>();

    public static List<Stu> getStu()
    {
        Stu s1 = new Stu("张三","123");
        Stu s2 = new Stu("王五","234");
        Stu s3 = new Stu("李四","345");
        list.add(s1);
        list.add(s2);
        list.add(s3);
        return list;
    }
}

class User {

    /*
        1:通过客户端录入用户的名称和密码 发送给服务端
        2:服务端接收到用户名和密码后 判断当前的集合中是否存在该用户
        3:如果存在 回写登陆成功 否则返回登录失败
     */

    private String username;
    private String password;

    public User() {
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (username != null ? !username.equals(user.username) : user.username != null) return false;
        return password != null ? password.equals(user.password) : user.password == null;
    }
}

class UserDB {

    public static List<User> list = new ArrayList<>();

    public static List<User> getUsers(){
        User u1 = new User("张三","123");
        User u2 = new User("李四","321");
        User u3 = new User("root","root");
        list.add(u1);
        list.add(u2);
        list.add(u3);
        return list;
    }
}





