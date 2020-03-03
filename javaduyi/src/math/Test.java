package math;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.Random;
import java.util.UUID;

public class Test {

	public static void main(String[] args) {
		//字段：double=Math.E   double=Math.PI
		
		/*abs()返回给定数字的绝对值
		 * double=pow(a,b)a的b次方
		 * .三角函数
		 * random()一个伪随机 double[大于或等于] 0.0并[小于] 1.0 。
		 * double=ceil()向上取整
		 * double=floor()向下取整
		 * double=rint()四舍五入
		 * int/long=round()四舍五入
		 * double=sqrt()获得平方根
		*/
		double a=Math.rint(2.25);
		System.out.println(a);
		long b=Math.round(5.61);
		System.out.println(b);
		int c=Math.round(2.25f);
		System.out.println(c);
		double d=Math.pow(2,3);
		System.out.println(d);
		//返回0-9的整数
		int value=(int)(Math.random()*10);
		System.out.println(value);
		//5.0-10.9的小数
		//((Math.random()*6)+5);---------相乘损失精度
		//Math.random()计算小数可能有精度损失，可以使用Random()类
		/*boolean nextBoolean() 
		返回下一个伪随机数，从这个随机数发生器的序列中均匀分布 boolean值。  
		void nextBytes(byte[] bytes) 
		生成随机字节并将它们放入用户提供的字节数组中。  
		double nextDouble() 
		返回下一个伪随机数，从这个随机数发生器的序列中 0.0和 1.0之间的 double值 0.0分布。  
		float nextFloat() 
		返回下一个伪随机数，从这个随机数发生器的序列中 0.0和 1.0之间的 float值 0.0分布。  
		double nextGaussian() 
		从该随机数发生器的序列返回下一个伪随机数，高斯（“正”）分布 double值，平均值为 0.0 ，标准差为 1.0 。  
		int nextInt() 
		返回下一个伪随机数，从这个随机数发生器的序列中均匀分布 int值。  
		int nextInt(int bound) 
		返回伪随机的，均匀分布 int值介于0（含）和指定值（不包括），从该随机数生成器的序列绘制。  
		long nextLong() 
		返回下一个伪，均匀分布 long从这个随机数生成器的序列值。  
		void setSeed(long seed) 
		使用单个 long种子设置该随机数生成器的种子。 */ 
		System.out.println("******************************************");
		
		
		
		
		Random r=new Random();
		int e=r.nextInt();
		int f=r.nextInt(10);//返回大于等于0小于10的整数   [0,10)
		System.out.println(e);
		System.out.println(f);
		double g=r.nextDouble();
		float h=r.nextFloat();
		System.out.println(g);
		System.out.println(h);
		//5.0--10.9
		//整数部分：r.nextInt(6)+5     小数部分：r.nextFloat()
		float x=r.nextInt(6)+5+r.nextFloat();
		System.out.println("x="+x);
		System.out.println("******************************************");
		
		
		
		
		//UUID 没有任何继承关系，32位16进制，生成数据库表格主键  uuid.timestamp();//产生时间戳
		UUID uuid=UUID.randomUUID();
		System.out.println(uuid.toString());
		System.out.println("******************************************");
		
		
		//BigInteger 乘：multiple  除：divide
		//java.math包
		//四则运算：add()	subStract()		multiply()		divide()
		BigInteger bi=new BigInteger("500");
		BigInteger result=bi.multiply(new BigInteger("10"));
		System.out.println(result.toString());
		//BigDecimal   超过double取值范围  属于java.math
		//可以通过string long int 参数构造
		//四则运算：add()	subStract()		multiply()		divide()
		//scale()设置小数之后处理方式
		BigDecimal bd=new BigDecimal("100.123456");
		bd=bd.setScale(2, BigDecimal.ROUND_DOWN);//小数点之后保留两位，向下取整
		System.out.println(bd);
		System.out.println("******************************************");
		
		
		//格式化：DeCimalFormat
		//java.text 一般用来格式化
		DecimalFormat df=new DecimalFormat("000.0##");//0必须存在#可有可无
		String dfstr=df.format(12.12698);//四舍五入
		System.out.println(dfstr);
	}

}
