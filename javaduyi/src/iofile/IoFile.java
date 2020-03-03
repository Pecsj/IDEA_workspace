package iofile;

import java.io.File;

public class IoFile {

	public static void main(String[] args) {
		
//		java路径有两种写法"/“和”\"
//		正斜杠/,linux,unix一般使用
//		反斜杠\，windows一般使用
//		由于\在java中有特殊作用，需要转义，因此需要写成\，因此建议在java中直接使用/即可；
//		
		
		//构造方法
		File f1=new File("E:\\test.txt");
		
		//常用方法
		System.out.println(f1.canExecute());
		System.out.println(f1.canRead());
		System.out.println(f1.canWrite());
		//isFile    isDirectory		isHidden	文件大小(字节)：long=length()
		//最后修改时间（毫秒）time=lastModify()		setLastModify()
		//绝对路径
		System.out.println(f1.getAbsolutePath());
		//获取文件名
		System.out.println(f1.getName());
		
		
		
		File f2=new File("E://baa//m.txt");
		f2.mkdirs();
	}

}
