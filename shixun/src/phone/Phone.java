package phone;

import java.util.Scanner;
public class Phone {
	//主方法函数
	public static void main(String[] args) {
		int change;
		Scanner input=new Scanner(System.in);
		Action act=new Action();
		do{
			System.out.println("******************************************************************");
			System.out.println("\t\t\t         电话本管理系统");
			System.out.print("\t1.添加");
			System.out.print("\t2.删除");
			System.out.print("\t3.修改");
			System.out.print("\t4.查询所有");
			System.out.print("\t  5.根据姓名查询");
			System.out.println("                0.退出");
			System.out.println("******************************************************************");
			System.out.print("请选择业务：");
			change=input.nextInt();
			switch (change){
			case 1:act.insert();break;
			case 2:act.delete();break;
			case 3:act.modify();break;
			case 4:act.showAll();break;
			case 5:act.showName();break;
			case 0:System.exit(0);
			default:System.out.println("输入非法！");
			}
		}while(change!=0);
		input.close();
	}

}
