package date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class UtilDate {

	public static void main(String[] args) {
		//System类(java.lang)	  Scanner类（java.util）
		//Date一般使用无参数或这long类型构造
		long time=System.currentTimeMillis();//19700101计算机元年
		System.out.println(time);
		
		Date date1=new Date(1578445429313L);
		Date date2=new Date();
		System.out.println(date2);//格林威治时间==toString()
		//常用方法
		//before()  after()
		System.out.println(date1.before(date2)); //date1是否在date2之前
		//setTime()  getTime() 毫秒值
		//d1.compareTo(d2)   d1在d2之前负数     d2在d1之前正数      0相同
		
		
		
		
		//处理Date日期格式     java.text（很多弃用）
		//DateFormat  抽象类
		//SimpleDateFormat   继承DateFormat的子类
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd 星期u HH:mm:ss ");
		System.out.println(sdf.format(date2));
		
		
		
		//Calendar  日历类      代替Date类
		//java.util
		//有protected的构造方法        通常调用getInstance();
		//Calendar---Date----Time
		//常用方法
		//after()	before()	setTime(Date:)
		//setTimeZone(TimeZone value) 以给定的时区值设置时区。 
		//setTimeInMillis(long millis) 从给定的长值设置此日历的当前时间。 
		Calendar ca=Calendar.getInstance();
		int year=ca.get(Calendar.YEAR);
		System.out.println(year);
		ca.set(Calendar.YEAR, 2015);
		System.out.println(ca.get(Calendar.MONTH)+1);
	}

}
