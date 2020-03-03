package classing;

import java.util.Scanner;

public class IfPrime {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double a=sc.nextDouble();
		int key=0;
		a=Math.sqrt(a);
		for(int i=2;i<=a;i++) {
			if(a%i==0){
				key=1;
				break;
			}
		}
		if(key==0)
			System.out.println("素数");
		else System.out.println("非素数");
		sc.close();
	}

}
