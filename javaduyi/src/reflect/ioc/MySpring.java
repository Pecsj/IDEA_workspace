package reflect.ioc;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;

@SuppressWarnings("all")
public class MySpring {
	
	//控制反转、依赖注入
	public Object newInstance(String className) {
		Object obj=null;
		try {
			Class clazz=Class.forName(className);
			//调用无参数构造方法创建对象s
			obj=clazz.newInstance();
			Field[] fields=clazz.getDeclaredFields();
			//依次给属性赋值
			for(Field field:fields) {
				//调用set方法,组合setField字符串
				String fieldName=field.getName();
				String one=fieldName.substring(0,1).toUpperCase();
				String setField="set"+one+fieldName.substring(1);
				
				//System.out.println(setField);
				//获取set方法的映射对象
				Class fieldType=field.getType();//根据属性类型获取传参值
				Method setMethod=clazz.getMethod(setField, fieldType);
				
				//将客户输入String类型的属性值转型为相应的fieldType，并作为参数调用set方法
				System.out.println("请为"+fieldName+"属性赋值：");
				Scanner sc=new Scanner(System.in);
				String input=sc.nextLine();
				Constructor con=fieldType.getConstructor(String.class);//获取对应包装类的构造对象
				setMethod.invoke(obj, con.newInstance(input));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return obj;
	}

}
