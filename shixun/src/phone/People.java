package phone;

/**
 * @author Administrator
 * class:People  电话本成员类
 */
public class People {
	@Override
	public String toString() {
		return "姓名：" + name + "性别：" + gender + "年龄：" + age + "电话：" + call + "QQ:" + qq
				+ "地址：" + address;
	}
	private String name;
	private String gender;
	private int age;
	private String call;
	private String qq;
	private String address;
	public People(String name, String gender, int age, String call, String qq, String address) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.call = call;
		this.qq = qq;
		this.address = address;
	}
	public People() {
		// TODO 自动生成的构造函数存根
	}
	public void show() {
		System.out.print("姓名:"+name+"性别:"+gender+"年龄:"+age+"电话:"+call+"QQ:"+qq+"地址"+address);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCall() {
		return call;
	}
	public void setCall(String call) {
		this.call = call;
	}
	public String getQq() {
		return qq;
	}
	public void setQq(String qq) {
		this.qq = qq;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
