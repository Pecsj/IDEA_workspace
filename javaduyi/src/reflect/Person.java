package reflect;

@SuppressWarnings("all")
public class Person {
	private int field1=10;
	public int field2=10;
	
	public Person() {
		System.out.println("我是无参数的构造方法");
	}
	
	
	private void fun1() {
		System.out.println("私有方法");
	}
	public String fun2() {
		System.out.println("公有方法");
		return "返回值";
	}
}
