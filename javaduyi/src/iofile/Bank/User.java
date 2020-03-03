package iofile.Bank;

/*
 * 记录个人信息
 */
public class User {
	private String name;//姓名、账户
	private String gender;//性别
	private int age;//年龄
	private String password;//密码
	private int balance;//余额
	//构造方法
	public User() {}
	public User(String name,String password,String balance) {
		this.name=name;
		this.password=password;
		this.balance=Integer.parseInt(balance);
	}
	//生成的get.set方法
	
	public String getName() {		return name;
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
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
