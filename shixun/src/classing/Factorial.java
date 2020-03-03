package classing;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int all=1;
		sc.close();
		for(int i=2;i<=n;i++)
			all*=i;
		System.out.println(all);
	}

}
