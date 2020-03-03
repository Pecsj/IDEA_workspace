package Homework;

import java.util.Scanner;

public class Ex1 {
	static void square(Scanner input) {
		int a,b;
		System.out.print("输入宽：");
		a=input.nextInt();
		System.out.print("输入高：");
		b=input.nextInt();
		System.out.println("矩形的面积："+a*b);
	}
	static void triangle(Scanner input) {
		int a,b;
		System.out.print("输入底：");
		a=input.nextInt();
		System.out.print("输入高：");
		b=input.nextInt();
		System.out.println("矩形的面积："+(double)(a*b)/2);
	}
	static void circle(Scanner input) {
		double r;
		System.out.print("输入半径：");
		r=input.nextDouble();
		System.out.println("圆的面积："+Math.PI*r*r);
	}
	public static void main(String[] args) {
		int i;
		System.out.println("1.矩形  2.三角形    3.圆\n请选择图形：");
		Scanner input=new Scanner(System.in);
		i=input.nextInt();
		if(i==1)
			square(input);
		else if(i==2)
			triangle(input);
		else if(i==3)
			circle(input);
		else System.out.println("你的输入有误！\n");
	}

}
