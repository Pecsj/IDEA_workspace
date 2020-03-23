package net.download;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

/**
 * 客户端发送下载请求
 */
public class ClientDownload {
    public static void main(String[] args) {
        Socket socket = null;
        InputStream inputStream = null;
        OutputStream outputStream = null;
        FileOutputStream fos = null;
        Scanner sc = new Scanner(System.in);
        try {
            //建立socket,获取网络端输入流，创建本地输出流 本机端口：127.0.0.1:8089
            socket = new Socket("127.0.0.1",8089);
            inputStream = socket.getInputStream();
            outputStream = socket.getOutputStream();
            //输入要获取的文件名称及类型
            System.out.println("输入要下载的文件：");
            String fileName = sc.next();
            //发送请求
            outputStream.write(fileName.getBytes());
            outputStream.flush();
            socket.shutdownOutput();
            //接受服务器返回文件
            System.out.println("下载中...");
            File file = new File("F:\\IDEA_workspace\\javaduyi\\src\\net\\download\\"+fileName);
            fos = new FileOutputStream(file);
            byte[] buff = new byte[1024];//缓冲区
            int len = -1;
            while ((len = inputStream.read(buff))!=-1){//从网络流读到缓存区
                fos.write(buff,0,len);//从缓存区写入到本地
            }
            System.out.println("下载成功");
        } catch (IOException e) {
            System.err.println("下载错误！");
            e.printStackTrace();
        }finally {
            if (fos!=null){
                try {
                    fos.close();
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
        }//finally
    }//main

}
