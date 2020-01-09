package Java_11_Client_Server_Refiect;

import java.io.*;
import java.net.*;

public class linker {
    public static void main(String[] args) throws IOException {
        new  link01();
//        new server();
    }
}

class  link01
{
    public link01() throws IOException {
        //创建一个socket
        DatagramSocket ds = new DatagramSocket(10054);
        //创建一个接收数据包
    while (true)
    {
        //创建一个输入流

        byte[] bys = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bys,0,bys.length);
        //创建一个键盘录入数据
        ds.receive(dp);
        //读取数据
        byte[] data = dp.getData();
        System.out.println("王思聪:"+new String(data));
    }
        //接收数据

//        ds.close();
    }
}

class server {
    public server() throws IOException {
//        创建一个Server的socket
        ServerSocket sk = new ServerSocket(10002);

        Socket accept = sk.accept();

        //创建一个字节输入流,读取数据
        InputStream inputStream = accept.getInputStream();
        byte[] bys = new byte[1024];
        int len;
        while((len = inputStream.read(bys))!=-1)
        {
            System.out.println(new String(bys,0,bys.length));
        }
        //反馈
        //创建一个输出流
        OutputStream outputStream = accept.getOutputStream();
        byte[] to = "我收到了".getBytes();
        outputStream.write(to,0,to.length);
//关闭
        sk.close();
    }

}


