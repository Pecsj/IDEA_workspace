package Homework;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		//使用if else进行排序
		int a,b,c;
		Scanner input=new Scanner(System.in);
		System.out.print("依次输入三个数据：");
		a=input.nextInt();
		b=input.nextInt();
		c=input.nextInt();
		input.close();
		if(a>b){
			a=a+b;
			b=a-b;
			a=a-b;
		}
		if(b>c) {
			b=b+c;
			c=b-c;
			b=b-c;
		}
		System.out.println("从小到大："+a+b+c);
	}

}
