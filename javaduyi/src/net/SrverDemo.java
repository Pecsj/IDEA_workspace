package net;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * 模拟服务器通讯（文字）
 */
public class SrverDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9527);//端口
        Socket accept = serverSocket.accept();//等待客户端连接
        /*连接成功后,连接流操作*/
        InputStream inputStream = accept.getInputStream();
        OutputStream outputStream = accept.getOutputStream();
        Scanner scanner = new Scanner(inputStream);//扫描流
        PrintStream printStream = new PrintStream(outputStream);//打印流，其实是装饰流

        boolean flag=true;
        while (flag) {
            /*
             * 循环体内
             * 先判断扫描流里的东西（这里存在阻塞）,并且接受到客户端发来的消息且输出
             * 然后键盘输入回复客户端
             * */
            if (scanner.hasNext()) {
                String next = scanner.next();
                System.err.println("接收到的信息："+next);//接收到了客户端发来的消息

                /*接收到了消息之后开始回复客户端*/
                Scanner scanner1 = new Scanner(System.in);
                System.err.print("输入一条你想回复客户端的消息=》》");
                String next1 = scanner1.next();
                printStream.println(next1+"\n");
                printStream.flush();
                System.err.println("+++发送消息成功+++");
            }
        }
    }

}
