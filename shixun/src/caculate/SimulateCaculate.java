package caculate;

import java.text.DecimalFormat;

/**
 * @author Administrator
 *	模拟计算器类
 *	可优化步骤
 */
public class SimulateCaculate {
	//成员属性：存储两个操作数
	private double elem[]=new double[2];
	private DecimalFormat df = new DecimalFormat("0.000");
	//字符串接受处理函数
	public boolean process(String str) {
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='+') {
				elem[0]=Double.parseDouble(str.substring(0,i));
				elem[1]=Double.parseDouble(str.substring(i+1,str.length()));
				countAdd();
			}else if(str.charAt(i)=='-') {
				elem[0]=Double.parseDouble(str.substring(0,i));
				elem[1]=Double.parseDouble(str.substring(i+1,str.length()));
				countMinus();
			}else if(str.charAt(i)=='*') {
				elem[0]=Double.parseDouble(str.substring(0,i));
				elem[1]=Double.parseDouble(str.substring(i+1,str.length()));
				countMultiply();
			}else if(str.charAt(i)=='/') {
				elem[0]=Double.parseDouble(str.substring(0,i));
				elem[1]=Double.parseDouble(str.substring(i+1,str.length()));
				countDivide();
			}
		}
		return true;
	}
	//计算输出函数 (格式化输出)
	private void countAdd() {
		System.out.println(df.format(elem[0]+elem[1]));
	}
	private void countMinus() {
		System.out.println(df.format(elem[0]-elem[1]));
	}
	private void countMultiply() {
		System.out.println(df.format(elem[0]*elem[1]));
	}
	private void countDivide() {
		System.out.println(df.format(elem[0]/elem[1]));
	}
}
