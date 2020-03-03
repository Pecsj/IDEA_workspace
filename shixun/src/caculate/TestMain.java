package caculate;

import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {
		SimulateCaculate sm=new SimulateCaculate();
		Scanner input=new Scanner(System.in);
		System.out.print("输入操作字符串(10+5)：");
		String str=input.next();
		sm.process(str);
		input.close();
	}
}
