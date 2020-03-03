package double_demo;

public class MyDouble {

	public static void main(String[] args) {
		//公有构造方法——（string）转Double
		Double a=new Double("2.25");
		Double d=Double.valueOf(5.2);
		Double b=Double.parseDouble("1.25");
		Double c=a+b+d;
		System.out.println(c.doubleValue());//getValue
		//转String
		String doubleObject=d.toString();
		String str=Double.toString(10.22);
		System.out.println(doubleObject+str);
	}

}
