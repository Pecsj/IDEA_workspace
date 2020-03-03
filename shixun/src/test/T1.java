package test;

import java.util.Scanner;

public class T1 {
	public static void main(String []args) {
		Scanner input=new Scanner(System.in);
		int a=input.nextInt();
		int b=input.nextInt();
		int c=input.nextInt();
		int d;
		input.close();
		System.out.println(a+b);
		System.out.println(a>b?a:b);
		System.out.println(a==b?"ture":"false");
		System.out.println((d=a>b?a:b)>c?d:c);
	}
}

