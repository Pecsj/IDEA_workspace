package reload;

/**
 * @author Administrator
 * 方法重载案例
 */
public class Caculate {
	//平方
	void caculater(int a) {
		System.out.println(a+"的平方："+a*a);
	}
	//相乘
	void caculater(int a,int b) {
		System.out.println(a+"*"+b+"="+a*b);
	}
	//输出字符串信息
	void caculater(String a) {
		System.out.println(a);
	}
	//***************************************************
	//Max重载
	void Max(int a,int b) {
		System.out.println("int重载最大值："+(a>b?a:b));
	}
	void Max(double a,double b) {
		System.out.println("double重载最大值："+(a>b?a:b));
	}
	void Max(int a,int b,int c) {
		int d=a>b?a:b;
		System.out.println("三个int重载最大值："+(d>c?d:c));
	}
	
	
	
	
	
}
