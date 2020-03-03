package Homework;

import java.util.Scanner;

/*
 * @class:计算器类
 */
class Counter{
	private double a;
	private char op;
	private double b;//两个操作数
	public void get() {
		System.out.print("请输入算式（逐个输入）：\n");
		Scanner input=new Scanner(System.in);
		a=input.nextDouble();
		op=input.next().charAt(0);
		b=input.nextDouble();
		input.close();
		if(op=='+')
			plus();
		else if(op=='-')
			minus();
		else if(op=='*')
			multiply();
		else if(op=='/')
			divide();
		else System.out.println("输入非法！");
	}
	public void plus() {
		System.out.println(a+b);
	}
	public void minus() {
		System.out.println(a-b);
	}
	public void multiply() {
		System.out.println(a*b);
	}
	public void divide() {
		System.out.println(a/b);
	}
}

public class Ex2 {
	public static void main(String[] args) {
		Counter cter=new Counter();//创建一个建议计算器对象
		cter.get();
	}

}
