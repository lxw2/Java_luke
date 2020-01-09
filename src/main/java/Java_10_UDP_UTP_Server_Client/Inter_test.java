package Java_10_UDP_UTP_Server_Client;

import java.io.*;
import java.net.*;

public class Inter_test {
    public static void main(String[] args) throws IOException {
/*        //public static inetAddress getByname(String):
        InetAddress address = InetAddress.getByName("192.168.100.8");
        System.out.println(address);

        //getHostAddress
        String name  = address.getHostName();
        String ip = address.getHostAddress();

        System.out.println(name+":"+ip);*/
//        new UDPtest01();
//        new send();
//        new UDPtest02();
//        new Tcp();
//        new Clent();
//        new Client();
//        new Client02();
        //创建一个客户端的Socket对象
        Socket s = new Socket("DESKTOP-UHH1CML",10004);
        //创建一个输入输出流用来读取文件中的数据并写到输出流上传给服务器
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("IDEA\\COPY2.txt")));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));

        //读取数据
        String data;
        while((data = br.readLine())!=null)
        {

            bw.write(data);
            bw.newLine();
            bw.flush();
        }

        s.shutdownOutput();

        //接收反馈
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String re ;
        while ((re= bufferedReader.readLine())!=null)
        {
            System.out.println(re);
        }
        s.shutdownInput();

        bw.close();
        br.close();
    }
}

class UDPtest01
{
    public UDPtest01() throws IOException {
        //DatagramSocket(可以发送数据,可以接收数据)
        //创建对象
        DatagramSocket ds = new DatagramSocket();

        //创建数据把数据打包
        //构造一个数据包
        byte[] bys = "hello world 我来了".getBytes();
//        int length = bys.length;
//        InetAddress byName = InetAddress.getByName("DESKTOP-UHH1CML");
//        int port = 10086;
//        DatagramPacket dp = new DatagramPacket(bys,length,byName,port);
        DatagramPacket dp = new DatagramPacket(bys,bys.length,InetAddress.getByName("DESKTOP-UHH1CML"),10088);
        //调用DatagramSocket的对象方法发送数据  send(DatagramPacket)
        ds.send(dp);

        //关闭发送端
        ds.close();

    }
}

class send
{
    public send() throws IOException {
        //发送数据
        //创建DatagramSocket对象
        DatagramSocket ds = new DatagramSocket();

        //自己封装键盘录入
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s ;
        while((s = br.readLine())!= null)
        {
            if (s.equals("886"))
            {
                break;
            }
            byte[] bys = s.getBytes();
            DatagramPacket dp = new DatagramPacket(bys,bys.length,InetAddress.getByName("DESKTOP-UHH1CML"),12345);
            ds.send(dp);
        }
        ds.close();


        //创建数据,将数据打包
    }

}

class Tcp
{
    public Tcp() throws IOException
    {
        //创建客户端的Socket对象
//        Socket(InetAddress address, int port)
//        创建一个流套接字并将其连接到指定 IP 地址的指定端口号。
//        Socket s = new Socket(InetAddress.getByName("DESKTOP-UHH1CML"),12345);
        Socket s = new Socket("DESKTOP-UHH1CML",12345);
        //获取(字节)输出流,写数据
        OutputStream outputStream = s.getOutputStream();
        outputStream.write("hello world".getBytes());

        s.close();
    }
}

class Clent
{
    public Clent() throws IOException {
        //创建Socket对象,进行发送数据的操作
        Socket s = new Socket("DESKTOP-UHH1CML",12346);
        //创建一个输出流进行写数据
        OutputStream outputStream = s.getOutputStream();
        outputStream.write("hello world! I'm comming".getBytes());
        //创建一个输入流对象,用来接收服务器端的反馈
        InputStream inputStream = s.getInputStream();
        byte[] bys = new byte[1024];
        int len = inputStream.read(bys);
        String data = new String(bys,0,len);
        System.out.println("客户端:"+data);

        /*while ((len = inputStream.read(bys))!=-1)
        {
            String data = new String(bys,0,len);
            System.out.println("服务器:"+data);

        }*/

        s.close();

    }
}

class Client
{
    public Client() throws IOException {
        //创建一个客户端Socket对象指定了发送的ip地址以及端口
        Socket socket = new Socket(InetAddress.getByName("DESKTOP-UHH1CML"),10000);
        //封装一个键盘输入对象,知道输入的数据是886,发送数据结束
        BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        //读取数据
        String data ;
        while ((data =br.readLine())!=null)
        {
            if (data.equals("886"))
            {
                break;
            }
            bw.write(data);
            bw.newLine();
            bw.flush();
        }

        br.close();
        bw.close();

    }
}

class Client02
{
    public Client02() throws IOException {
        //创建一个客户端的Socket对象
        Socket s = new Socket("DESKTOP-UHH1CML",10004);
        //创建一个输入输出流用来读取文件中的数据并写到输出流上传给服务器
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("IDEA\\COPY2.txt")));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));

        //读取数据
        String data;
        while((data = br.readLine())!=null)
        {

            bw.write(data);
            bw.newLine();
            bw.flush();
        }

        s.shutdownOutput();

        //接收反馈
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String re ;
        while ((re= bufferedReader.readLine())!=null)
        {
            System.out.println(re);
        }
        s.shutdownInput();

        bw.close();
        br.close();
    }

}


