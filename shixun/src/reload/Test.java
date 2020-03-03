package reload;

public class Test {

	public static void main(String[] args) {
		//方法重载案例_Caaulate
		Caculate ca=new Caculate();
		ca.caculater(10);
		ca.caculater(10,20);
		ca.caculater("我是字符串");
		//方法重载案例_Max
		ca.Max(10, 20);
		ca.Max(12.85, 12.88);
		ca.Max(10, 8, 9);
	}

}
