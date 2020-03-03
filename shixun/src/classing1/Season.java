package classing1;

import java.util.Scanner;

public class Season {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("输入月份：");
		char select=sc.next().charAt(0);
		sc.close();
		switch(select) {
		case '1':
		case '2':
		case '3':System.out.println("春天");break;
		case '4':
		case '5':
		case '6':System.out.println("夏天");break;
		default:System.out.println("我是人工智障");
		}
	}

}
