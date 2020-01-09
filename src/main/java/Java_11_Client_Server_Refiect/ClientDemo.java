package Java_11_Client_Server_Refiect;

import java.io.*;
import java.net.Socket;

public class ClientDemo {
    public static void main(String[] args) throws IOException {
//        new Client();
    new Client02();
    }
}

class Client
{
    public Client() throws IOException {
        //创建一个Socket
        Socket s = new Socket("192.168.43.249",10006);
        //创建一个数据输出流

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        String user;
        System.out.println("请输入用户名:");
        user = br.readLine();
            bw.write(user);

//        s.shutdownOutput();
        System.out.println("请输入密码:");
        String password;
        password = br.readLine();
            bw.write(password);

        s.shutdownOutput();

        //读取服务端对你的反馈
        BufferedReader brr = new BufferedReader(new InputStreamReader(s.getInputStream()));

        String refiect;
        refiect = brr.readLine();
            System.out.println(refiect);

        s.close();
    }
}

class Client02
{
    public Client02() throws IOException {
       /* //创建一个Socket对象
        Socket s =new Socket("192.168.43.249",54321);

        //获取键盘输入流
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String username;
        String password;
        System.out.println("请输入用户名:");
         username = br.readLine();
        System.out.println("请输入密码:");
         password = br.readLine();

         //发送给服务器
        PrintWriter pw  = new PrintWriter(s.getOutputStream(),true);
        pw.println(username);
        pw.println(password);

        //接收服务器的反馈
        BufferedReader brr = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String result= brr.readLine();
        System.out.println(result);

        s.close();
        br.close();

*/
        //创建客户端socket对象
        //Socket s = new Socket("192.168.43.249", 54321);
        Socket s  = new Socket ("192.168.43.249",54312);

        //录入用户名和密码
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br =  new BufferedReader (new InputStreamReader(System.in));
//        System.out.println("请输入用户名:");
        System.out.println("请输入用户名");

//        String username = br.readLine();
        String username =br.readLine();
        System.out.println("请输入密码:");
        String password = br.readLine();

        //发送给服务端
//        PrintWriter pw = new PrintWriter(s.getOutputStream(),true);
        PrintWriter pw = new PrintWriter(s.getOutputStream(),true);
        pw.println(username);
        pw.println(password);

        //接收服务端回写回来的数据
//        BufferedReader clientBr = new BufferedReader(new InputStreamReader(s.getInputStream()));
        BufferedReader clientBr = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String result = clientBr.readLine();
        System.out.println(result);

        br.close();
        s.close();
    }
}
