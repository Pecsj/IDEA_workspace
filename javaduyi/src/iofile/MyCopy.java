package iofile;

import java.io.*;
import java.util.Scanner;

public class MyCopy {
	
	//超级复制（文件|文件夹）,由里向外递归复制
	//父路径，文件(夹)名称，新路径
	public void superCopy(File old,String name,File newPath) {
		FileInputStream fint=null;
		FileOutputStream fout=null;
		File oldPath=new File(old,name);//源
		System.out.println(oldPath.isFile()+oldPath.getAbsolutePath());
		File[] olds=oldPath.listFiles();
		newPath=new File(newPath.getAbsoluteFile()+"/"+name);
		//文件夹
		if(olds!=null) {//只有文件夹才返回对象
			newPath.mkdir();
			if(olds.length!=0){//非空文件夹,遍历子文件
				for(File f:olds) {
					superCopy(oldPath, f.getName(), newPath);//递归 	父+文件名
				}
			}
		}else {//olds==null->是文件
			try {
				fint=new FileInputStream(oldPath);
				fout=new FileOutputStream(newPath);//文件：返回到父目录
				byte[] text=new byte[1024];
				int count=fint.read(text);
				while(count!=-1) {
					fout.write(text,0,count);
					fout.flush();
					count=fint.read(text);
				}
				System.out.println(oldPath.getAbsolutePath()+newPath.getAbsolutePath());
			} catch (IOException e) {
					e.printStackTrace();
			}finally {
				try {
					if(fint!=null)
						fint.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
				
				try {
					if(fout!=null)
						fout.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
		}
		
	}
	
	//剪贴
	
	
	//复制一个oldPath文件到newPath
	public void copyFile(File oldPath,File newPath) {
		FileOutputStream fout=null;
		FileInputStream fint=null;
		newPath=new File(newPath+"//"+oldPath.getName());
		
		try {
			fint=new FileInputStream(oldPath);
			fout=new FileOutputStream(newPath);
			byte[] text=new byte[1024];//暂存字节
			
			int count=fint.read(text);
			while(count!=-1) {
				fout.write(text, 0, count);
				fout.flush();
				count=fint.read(text);
			}
			System.out.println(oldPath.getAbsolutePath()+"复制完毕");
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(fint!=null)
					fint.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			try {
				if(fout!=null)
					fout.close();
			} catch (IOException e) {
				e.printStackTrace();
			
			}
		}
	}
	
	public static void main(String[] args) {
		@SuppressWarnings("all")
		Scanner input=new Scanner(System.in);
		System.out.println("输入需要复制的地址：");
		String s1=input.nextLine();
		s1=s1.replace('\\', '/');
		System.out.println("输入文件/文件夹名称：");
		String name=input.nextLine();
		System.out.println("输入需要粘贴的地址：");
		String s2=input.nextLine();
		s2=s2.replace('\\', '/');
		File f1=new File(s1);
		File f2=new File(s2);
		MyCopy copy=new MyCopy();
		copy.superCopy(f1, name, f2);//F:/12.26---->F:/1/12.26
		System.out.println("*******************************************/n/n");
		System.out.println("复制完成");
//		File f1=new File("F:/text/csjmem.cpp");
//		System.out.println(f1.getParent());
	
		
		}
}
