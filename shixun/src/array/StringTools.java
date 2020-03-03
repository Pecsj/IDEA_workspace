package array;

public class StringTools {

	public static void main(String[] args) {
		String a="12|3|ab|c";
		//字符串转数组
		char b[]=a.toCharArray();
		for(char i:b) {
			System.out.println(i);
		}
		//字符串分割
		String c[]=a.split("\\|");
		for(String i:c) {
			System.out.println(i);
		}
	}

}
