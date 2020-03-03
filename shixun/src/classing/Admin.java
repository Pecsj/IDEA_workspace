package classing;

import java.util.Scanner;

public class Admin {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i;
		for(i=0;i<3;i++) {
			System.out.println("输入用户名和密码：");
			String name=sc.next();
			String password=sc.next();
			if("admin".equals(name)&&"111".equals(password)) {
				System.out.println("登录成功！");
				break;
			}else System.out.println("登录失败!");
		}
		if(i==3) System.out.println("登录失败超过三次");
		sc.close();
	}

}
