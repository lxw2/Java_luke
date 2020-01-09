package Java_11_Client_Server_Refiect;

import java.io.*;
import java.net.*;

public class Inter {
    public static void main(String[] args) throws IOException {
        new Udptest01();
//        new tcp01();
//        new udp01();
    }
}

class Udptest01
{
    public Udptest01() throws IOException {
        //创建一个Socket包
        DatagramSocket ds = new DatagramSocket();
        //创建一个键盘录入对象
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //创建一个包
        //创建数据,并将数据装包
//        byte[] bys = "hello world".getBytes();
//        DatagramPacket dp = new DatagramPacket(bys,0,bys.length,InetAddress.getByName("192.168.46.33"),10001);
//        ds.send(dp);
        String data ;
        while ((data = br.readLine())!=null)
        {
            if (data.equals("886"))
            {
                break;
            }

            DatagramPacket dp = new DatagramPacket(data.getBytes(),0,data.getBytes().length,InetAddress.getByName("192.168.46.58"),10054);
            ds.send(dp);
        }
        boolean connected = ds.isConnected();
        System.out.println(connected);
        ds.close();
    }
}

class tcp01
{
    public tcp01() throws IOException {
        //创建socket对象
        Socket s = new Socket("192.168.46.33",10002);
        //创建输出流输出数据

        byte[] data = "tcp,我来了".getBytes();
        OutputStream sd = s.getOutputStream();
        sd.write(data);
        s.shutdownOutput();
        //接收数据
        InputStream inputStream = s.getInputStream();
        byte[] bys = new byte[1024];
        int len;
        while((len = inputStream.read(bys))!=-1)
        {
            System.out.println(new String(bys,0,bys.length));
        }



        s.close();

    }
}

class udp01
{
    public udp01() throws IOException {
        DatagramSocket ds = new DatagramSocket(10006);
        //创建一个数据
        //创建已给包
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        byte[] to  =new byte[1024];
        String len;
        while ((len = br.readLine())!=null)
        {
            byte[] bytes = len.getBytes();
            DatagramPacket dpp = new DatagramPacket(bytes,0,bytes.length,InetAddress.getByName("192.168.46.58"),2425);

            ds.send(dpp);
        }
//        byte[] bys = "hello world".getBytes();
//        DatagramPacket dp = new DatagramPacket(bys,0,bys.length,InetAddress.getByName("192.168.46.33"),25535);


        ds.close();
    }
}

