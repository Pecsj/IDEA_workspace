package integer;

public class Test {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int value2=Integer.parseInt("10000100",2);
		System.out.println(value2);
		String s=Integer.toBinaryString(value2);
		System.out.println(s);
		
		//内部类的静态空间创建-128到127的常量，超过就会自己new一个新的
		Integer i1=10;
		Integer i2=10;
		System.out.println(i1==i2);//true
		Integer i3=128;
		Integer i4=128;
		System.out.println(i3==i4);//false
	}

}
