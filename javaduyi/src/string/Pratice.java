package string;

import java.util.Scanner;

/**
 * @author csj
 * @class:字符串作业
 * 
 */
public class Pratice {
	//字符串反转
	public String reverse(String a) {
		String b="";
		for(int i=a.length()-1;i>=0;i--) {
			b=b.concat(String.valueOf(a.charAt(i)));
		}
		return b;
	}
	//正序反序拼接
	public String concatReverse(String a) {
		String b=reverse(a);
		b=a.concat(b);
		return b;
	}
	//判断给定字符串是否是回文
	//反转后比较相同：回文
	public boolean isPalindromic(String a) {
		int k,i;
		k=a.length()/2;//整数默认向下取整==下标
		boolean key=true;
		for(i=0;i<=k;i++) {
			if(a.charAt(i)!=a.charAt(a.length()-i-1)) {
				key=false;
			}
		}
		return key;
	}
	//给定字符串右移
	public String moveRight(String a,int i) {
		if(i>a.length())
			return "输入非法";
		String b=a.substring(a.length()-i);
		b=b.concat(a.substring(0,a.length()-i));
		return b;
	}
	//首字母大写
	public String headToUpperCase(String a) {
		String c[]=a.split(" ");
		String b;
		for(int i=0;i<c.length;i++) {
			b=c[i].substring(0,1).toUpperCase();//取首字母为字符串型并大写[0,1)
			c[i]=b.concat(c[i].substring(1)+" ");//使i重指向拼接字符串
		}
		b="";
		for(String i:c) {
			b=b.concat(i);
		}
		return b.trim();//除去最后一个空格
	}
	//看字符串中有多少个指定字符
	//思路：将指定字符替换成空字符串，查看两个串的长度
	
	//获取给定字符串的全部数字
	//codePointAt()
	//48-57:0-9
	public String catchAllNumber(String a) {
		
		return a;
	}
	//测试主函数
	public static void main(String[] args) {
		Pratice p=new Pratice();
		Scanner input=new Scanner(System.in);
		String a=input.nextLine();//吸取空格和tab，遇见回车结束
		input.close();
		
		//测试输出
		System.out.println(p.headToUpperCase(a));
	}

}
