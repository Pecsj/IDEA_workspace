package net.download;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * 服务器接受下载请求
 */
public class ServerData {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        Socket socket = null;
        InputStream ins = null;
        OutputStream ous = null;
        FileInputStream fis = null;//本地文件输入流，读入内存
        try {
            //获取socket,包装输入流，获取输出流
            serverSocket = new ServerSocket(8089);
            socket = serverSocket.accept();
            ins = socket.getInputStream();
            ous = socket.getOutputStream();//网络输出流，发送文件
            Scanner scanner = new Scanner(ins);//扫描流打印信息,获取文件名
            //解析文件名
            String fileName = null;
            if(scanner.hasNext()){
                fileName = scanner.next();
                System.out.println("客户端请求文件："+fileName);
            }
            //输入流读入内存，网络输出流发送文件
            File file = new File("F:\\IDEA_workspace\\javaduyi\\src\\net\\data\\"+fileName);
            System.out.println(file.exists());
            fis = new FileInputStream(file);
            byte[] buff = new byte[1024];
            int len = -1;
            while ((len = fis.read(buff))!=-1){
                System.out.println(len);
                ous.write(buff,0,len);
            }
            ous.flush();
            socket.shutdownOutput();
            System.out.println("发送成功");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (fis!=null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (socket!=null){
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}
