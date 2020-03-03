package reflect.ioc;

public class Person {

	private String name;
	private Integer age;//int类型不能使用反射
	
	public Person() {}
	public Person(String name,int age) {
		this.name=name;
		this.age=age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	public String toString() {
		return name+"   "+age;
	}
	
}
