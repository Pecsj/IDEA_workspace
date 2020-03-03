package phone;

import java.util.Scanner;

public class Action {
	private People[] pe=new People[20];
	private int i=0;
	private Scanner input=new Scanner(System.in);
	public void insert() {
		pe[i]=new People();
		System.out.print("姓名：");
		pe[i].setName(input.next());
		System.out.print("性别：");
		pe[i].setGender(input.next());
		System.out.print("年龄：");
		pe[i].setAge(input.nextInt());
		System.out.print("电话：");
		pe[i].setCall(input.next());
		System.out.print("QQ：");
		pe[i].setQq(input.next());
		System.out.print("地址：");
		pe[i].setAddress(input.next());
		System.out.println(pe[i].toString());
		i++;
	}
	//删除电话成员
	public void delete() {
		System.out.print("输入你要删除的成员姓名：");
		String sName=input.next();
		int j;
		for(j=0;j<i;j++) {
			if(sName.equals(pe[j].getName()))
				break;
		}
		if(j>=i)
			System.out.println("成员不存在！");
		else{
			for(int k=j;k<i-1;k++) {
				pe[k]=pe[k+1];
			}
			i--;
		}
	}
	//修改成员信息
	public void modify() {
		System.out.print("输入你要修改的成员姓名：");
		String sName=input.next();
		int j;
		for(j=0;j<i;j++) {
			if(sName.equals(pe[j].getName()))
				break;
		}
		if(j>=i)
			System.out.println("成员不存在！");
		else {
			System.out.print("姓名：");
			pe[j].setName(input.next());
			System.out.print("性别：");
			pe[j].setGender(input.next());
			System.out.print("年龄：");
			pe[j].setAge(input.nextInt());
			System.out.print("电话：");
			pe[j].setCall(input.next());
			System.out.print("QQ：");
			pe[j].setQq(input.next());
			System.out.print("地址：");
			pe[j].setAddress(input.next());
			System.out.println(pe[j].toString());
			System.out.println("修改成功！");
		}
	}
	//列出所有成员
	public void showAll() {
		for(int j=0;j<i;j++) {
			System.out.println(pe[j].toString());
		}
	}
	//根据名字查找成员
	public void showName() {
		System.out.print("输入你要查找的成员姓名：");
		String sName=input.next();
		int j;
		for(j=0;j<i;j++) {
			if(sName.equals(pe[j].getName()))
				break;
		}
		if(j>=i)
			System.out.println("成员不存在！");
		else {
			System.out.println(pe[j].toString());
		}
	}
}
