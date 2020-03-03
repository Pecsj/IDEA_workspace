package Homework;

import java.util.Scanner;

/*
 * class:计数器类
 */
class Count{
	private int time;
	private double distance;
	public void get() {
		Scanner input=new Scanner(System.in);
		System.out.print("输入时间（24小时)");
		time=input.nextInt();
		System.out.print("输入距离:");
		distance=input.nextInt();
		show();
		input.close();
	}
	public void show() {
		if(time>=6&&time<=21)
			System.out.println("乘车费用:"+(7+((distance-2)>0?(distance-2):0)*1.5));
		else if(time>=0&&time<=5)
			System.out.println("乘车费用"+8+((distance-2)>0?(distance-2):0)*1.5);
		else if(time>=22&&time<=24)
			System.out.println("乘车费用"+8+((distance-2)>0?(distance-2):0)*1.5);
		else System.out.println("输入非法！");
	}
}

public class Ex4 {

	public static void main(String[] args) {
		Count c=new Count();
		c.get();
	}

}
