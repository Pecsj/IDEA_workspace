package classing;

import java.util.Scanner;

public class Love {
	public static void main(String[] args) {
		System.out.println("我爱你，和我搞基吧！");
		Scanner input=new Scanner(System.in);
		char change;
		do {
			System.out.println("你接受么？（Y/N）");
			change=input.next().charAt(0);
		}while(change=='N'||change=='n');
		input.close();
		System.out.println("我们形影不离！");
	}

}
