/**
 * @author csj
 * @data:12.26
 * @modify
 */
package student;

import java.io.IOException;
import java.util.*;
/*
 * class:Student(学生类)
 */
class Student{
	private int age;
	private String name;
	private char gender;
	private int score;
	public void Enter () throws IOException{
		Scanner input = new Scanner(System.in);
		System.out.print("输入学生姓名：");
		name=input.next();
		System.out.print("输入学生性别：");
		gender=input.next().charAt(0);
		System.out.print("输入学生年龄：");
		age=input.nextInt();
		System.out.print("输入学生分数：");
		score=input.nextInt();
		input.close();
	}
	public void Show()
	{
		System.out.println(name+"\t"+age+"\t"+score+"\t"+gender);
	}
}
public class Main{
	public static void main(String []args) throws IOException{
		Student Stu=new Student();
		
//		java支持直接用println()输出，但是不直接支持在控制台
//		输入，所以我们需要借助Scanner的帮助。这句话就是让input
//		具有了接受输入的功能。
		Stu.Enter();
		Stu.Show();
	}
}
