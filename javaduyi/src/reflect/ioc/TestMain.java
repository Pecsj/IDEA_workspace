package reflect.ioc;

public class TestMain {

	public static void main(String[] args) {
		//利用IOC技术的MySpring创建对象
		MySpring spring=new MySpring();
		Person person=(Person)spring.newInstance("reflect.ioc.Person");//默认工程目录下寻找
		System.out.println(person.toString());
	}

}
