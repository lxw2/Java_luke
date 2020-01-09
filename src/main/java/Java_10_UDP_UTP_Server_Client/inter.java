package Java_10_UDP_UTP_Server_Client;

import java.io.*;
import java.net.*;

public class inter {
    public static void main(String[] args) throws IOException {
//        new UDPtest02();
//        new receive();
//        new tcpre();
//        new server();
//        new Server();
        new Server03();
    }



}
class UDPtest02
{
    public UDPtest02() throws IOException {
        //DatagramSocket(int port)
        //          创建数据报套接字并将其绑定到本地主机上的指定端口
        DatagramSocket ds = new DatagramSocket(10088);

        //创建一个数据包用于接收数据
        byte[] bys = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bys,bys.length);

        //调用DatagramSocket对象的方法来接收数据
        ds.receive(dp);

        //解析数据包,并把数据在控制台显示
        byte[] data = dp.getData();
        int len = dp.getLength();

        String dataString = new String(data,0,len);
        System.out.println("数据是:"+dataString);

        ds.close();

    }

}

class receive
{
    public receive() throws IOException {
        //接收数据
        //创建一个Datagramspcket
        DatagramSocket ds = new DatagramSocket(12345);
        //创建一个数据包,用于接受哦数据
        while (true)
        {
            byte[] bys= new byte[1024];
            DatagramPacket dp = new DatagramPacket(bys,bys.length);
            ds.receive(dp);
            //打印数据
            System.out.println(new String(bys,0,bys.length));

        }

//        ds.close();
    }
}

class tcpre
{
    public tcpre() throws IOException {
        //创建一个Socket对象
        ServerSocket sk = new ServerSocket(12345);
        //监听客户端的连接
        Socket sc = sk.accept();

        //获取输入流
        InputStream ins= sc.getInputStream();
        byte[] bys = new byte[1024];
        int len = bys.length;
        while ((len = ins.read(bys))!=-1)
        {
            System.out.println("数据是:"+new String(bys,0,len));
        }

        sk.close();
        sc.close();

    }
}

class server
{
    public server() throws IOException {
        //创建一个拥有特定端口的对象
        ServerSocket sk = new ServerSocket(12346);
        //以来ServerSocket接收一个Socket对象
        Socket ssk = sk.accept();

        //接收数据

        InputStream inputStream = ssk.getInputStream();
        //定义一个字节数组
        byte[] bys = new byte[1024];
        int len = inputStream.read(bys);
            String data =new String(bys,0,len);
            System.out.println("客户端:"+data);


        //对客户端进行反馈
        OutputStream outputStream = ssk.getOutputStream();
        outputStream.write("好的,我收到了!".getBytes());

        sk.close();


    }

}

class Server
{
    public Server() throws IOException {
        //创建一个服务器Socket对象 绑定端口号
        ServerSocket sk = new ServerSocket(10000);
        //封装一个socket对象
        Socket s = sk.accept();
        //封装一个输入对象
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        //封装一个文本输出对象,将数据输出到文件中去
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("IDEA\\COPY.txt")));
        //读取数据
        String data;
        while ((data = br.readLine())!=null)
        {
            System.out.println(data);
            bw.write(data);
            bw.newLine();
            bw.flush();
        }
        //关闭资源
        bw.close();
        br.close();
    }
}

class Server02
{
    public Server02() throws IOException {
        //创建一个服务器的Socket
        ServerSocket sk = new ServerSocket(10002);
        //获取监听
        Socket s = sk.accept();
        //创建输入输出流对象
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("IDEA\\COPY.txt")));

        //读取数据
        String data ;
        while((data = br.readLine())!=null)
        {
            bw.write(data);
            bw.newLine();
            bw.flush();
        }

        //给出反馈
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        bufferedWriter.write("传输成功");
        s.shutdownOutput();

        bufferedWriter.close();
        br.close();
        bw.close();
    }
}

class Server03
{
    public Server03() throws IOException {
        //创建一个服务器Socket对象
        ServerSocket serverSocket = new ServerSocket(10004);
        //创建一个socket对象
        while (true)
        {
            Socket s = serverSocket.accept();
            //创建一个线程命令

            new Thread(new ThreadSocket(s)).start();
        }





    }


}

class ThreadSocket implements Runnable
{
    private Socket socket;
    public ThreadSocket(Socket s)
    {
        this.socket = s;
    }

    @Override
    public  void run() {
        //创建输入输出流
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            int count = 0;
            File f = new File("IDEA\\copy["+count+"].txt");
            //判断一下文件是否存在,如果存在的话count++后在继续
               while(f.exists())
                {
                    count++;
                    f =new File("IDEA\\copy["+count+"].txt");
                }
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(f)));

               //将数据传输到文件
            String data;
            while((data=br.readLine())!=null)
            {
                bw.write(data);
                bw.newLine();
                bw.flush();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        //创建一个反馈的输出对象
        try {
            BufferedWriter bw1 = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            bw1.write("文件传输成功!");
            bw1.newLine();
            bw1.flush();
            socket.shutdownOutput();
        } catch (IOException e) {
            e.printStackTrace();
        }



    }
}

