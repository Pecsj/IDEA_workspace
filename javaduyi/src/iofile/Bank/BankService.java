package iofile.Bank;

import java.util.Scanner;

/**
 * 银行业务类
 * @author Administrator
 *
 */
public class BankService {
	private Dao dao=new Dao();
	//登陆
	public String login(String name,String password) {
		User user=dao.searchUser(name);
		if(user!=null) {
			if(user.getPassword().equals(password))
				return "登陆成功";
		}
		return "登陆失败";
	}
	//注册
	public void register() {
		@SuppressWarnings("all")
		Scanner sc=new Scanner(System.in);
		User user=new User();
		System.out.println("欢迎注册");
		System.out.println("输入姓名：");
		user.setName(sc.next());
		System.out.println("输入密码：");
		user.setPassword(sc.next());
		System.out.println("初始余额5000");
		user.setBalance(5000);
		
		if(dao.update(user)==false)
			System.out.println("注册失败");
	}
	
	//查询余额
	public int inquire(String name) {
		User user=dao.searchUser(name);
		return user.getBalance();
	}
	
	//取款
	public boolean withdrawing() {
		@SuppressWarnings("all")
		Scanner sc=new Scanner(System.in);
		System.out.println("输入账户：");
		String name=sc.next();
		System.out.println("输入密码：");
		String password=sc.next();
		String login=this.login(name, password);
		if(login.equals("登陆成功")) {
			System.out.println("请输入取款金额：");
			int money=sc.nextInt();
			User user=dao.searchUser(name);
			if(user.getBalance()>=money) {
				user.setBalance(user.getBalance()-money);
				dao.update(user);//写入更新信息
				System.out.println("取款成功");
				return true;
			}else {
				System.out.println("余额不足");
				return false;
			}
		}else {
			System.out.println(login);
			return false;
		}
	}
	
	//存款
	public boolean deposit() {
		@SuppressWarnings("all")
		Scanner sc=new Scanner(System.in);
		System.out.println("输入账户：");
		String name=sc.next();
		System.out.println("输入密码：");
		String password=sc.next();
		String login=this.login(name, password);
		if(login.equals("登陆成功")) {
			System.out.println("请输入存款金额：");
			int money=sc.nextInt();
			User user=dao.searchUser(name);
			user.setBalance(user.getBalance()+money);
			dao.update(user);//写入更新信息
			System.out.println("存款成功");
			return true;
		}else {
			System.out.println(login);
			return false;
		}
	}
	
	
//	遍历输出user内容		
//	Set<Entry<String, User>> entrys = userMap.entrySet();//获取集合中全部的entry对象
//    Iterator<Entry<String, User>> it = entrys.iterator();
//    while(it.hasNext()){
//        Entry<String, User> entry = it.next();//entry  key value
//        String key = entry.getKey();
//        User value = entry.getValue();
//        System.out.println(key+"--"+value.getName());
//    }
	
	
	
}
