package iofile.Bank;

public class TestMain {

	public static void main(String[] args) {
		BankService bank=new BankService();
		//注册
		bank.register();
		//登陆
		bank.login("aaa", "123");
		//取款
		bank.withdrawing();
		//存款
		bank.deposit();
		
	}

}
