package classing;

import java.util.Scanner;

public class Reversal {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		input.close();
		String re=""+n;
		for(int i=re.length()-1;i>=0;i--) {
			System.out.println(re.charAt(i));
		}
	}

}
