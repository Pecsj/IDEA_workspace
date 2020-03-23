package net;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

/**
 * 客户端通讯（文字）
 */
public class ClientDemo {
    public static void main(String[] args) throws IOException {

        Socket socket = new Socket("127.0.0.1", 9527);
        /*连接成功之后的操作流*/
        InputStream inputStream = socket.getInputStream();
        OutputStream outputStream = socket.getOutputStream();
        BufferedReader br =new BufferedReader(new InputStreamReader(inputStream));
        BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(outputStream));

        boolean flag=true;
        while (flag) {
            /*
             * 循环体内
             * 先发送消息
             * 再接收服务器消息
             * */
            Scanner input = new Scanner(System.in);
            System.out.print("输入你要发送给服务器的消息=》》");
            if (input.hasNext()) {
                String msg = input.next();
                bw.write(msg+"\n");
                bw.flush();
                System.out.println("已发送");
            }


//（1）BufferedReader的readLine方法只有在遇到流结尾或者流关闭了才会返回null
//（2）对于读取文件流，当读到文件的结尾时，就是到了流的结尾
//（3）但对于socket，不能认为把某次写入到流中的数据读取完了就算流结尾了，但是socket流还存在，还可以继续往里面写入数据然后再读取。
// 所以用BufferedReader封装socket的输入流，调用BufferedReader的readLine方法是不会返回null的
            System.out.println("回复：");
            String response = null;
            while((response = br.readLine())!=null && response.length()!=0){
                System.out.println(response);
            }
            System.out.println("接受完毕-------------------");

        }

    }
}
