package iofile;

import java.io.File;

/**
 * @author csj
 * @class:递归显示文件夹下的所有文件或文件夹
 * 
 */
public class Recursion {
	
	public void showName(File path) {
		File[] files=path.listFiles();
		if(files!=null && files.length!=0) {
			for(File f:files)
				showName(f);
		}
		System.out.println(path.getAbsolutePath());
	}
	
	public static void main(String[] args) {
		Recursion recShow=new Recursion();
		File f1=new File("E:/aaa");
		if(f1.exists()) {
			recShow.showName(f1);
		}
	}
}
