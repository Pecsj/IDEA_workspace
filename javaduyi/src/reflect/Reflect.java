package reflect;

import java.lang.reflect.*;

@SuppressWarnings("all")
public class Reflect {
	public static void main(String[] args) {
		
		
		/*
		 * 反射机制涉及类：
		 * Class		类
		 * Package		包
		 * Field		字段
		 * Method		方法
		 * Constructor	构造方法
		 * Annotation	注解
		 * 
		 */
		
		Person p1=new Person();
		
		//获取class对象的方法
		/*
		 * 1.Class.forName(str:路径)
		 * 2.类名.class
		 * 3.对象.class
		 * 
		 */
		Class clazz=p1.getClass();
		
		//class常用方法
		/*
		 * 1.int:getModifiers();获取修饰符，多个修饰符相加(Linux文件权限)
		 * 2.String:	getName()		getSimpleName()
		 * 3.Package:	getPackage()
		 * 4.Class:		getSuperClass()
		 * 5.Field:		getField()		getFields()
		 * 6.Method:	getMethod()		getMethods()
		 * 7.Class[]	getInterfaces()
		 * 8.Object		newInstance()默认调用无参数构造方法
		 * 
		 */
		Class[] clazzArray=clazz.getInterfaces();
		for(Class c:clazzArray) {
			System.out.println(c.getName());
		}
		
		/*
		 * Field常用方法
		 * getName()	getModifiers()
		 * Class:	getType() 获取属性类型
		 * 
		 * 操作属性
		 * Field.set(Object:对象,"值")
		 * Field.get(对象);
		 * 
		 * 私有操作
		 * Field:	getDeclaredField()	getDeclaredFields()//获取
		 * Field.setAccessible()//可以操作
		 * 
		 */
		
		try {
			Field f=clazz.getField("field2");//属性是公有的
			f.set(p1, 100);
			int name=(int)f.get(p1);//从p1对象获得field1属性
			System.out.println(name);
			
			//修改和获取私有属性
			Field pf=clazz.getDeclaredField("field1");
			pf.setAccessible(true);
			pf.set(p1, 200);
			System.out.println(pf.get(p1));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		/*
		 * Method类
		 * clazz.getMethod(name:"function",Type:String.class)通过名字和参数确定
		 * clazz.getMethods(方法名，参数类型列表)			只有公有方法
		 * clazz.getDeclaredMethod(方法名，参数类型列表)
		 * clazz.getDeclaredMethods(方法名，参数类型列表)	获取公有+私有方法
		 * 
		 * 
		 * getModifiers()	getName()
		 * class:	getReturnType()
		 * class[]:	getParameterTypes()获取参数方法列表类型
		 * class[]:	getExceptionTypes()获取方法抛出异常类型
		 * 
		 * (造型)Method.invoke(对象，...参数列表)	调用参数
		 * 
		 */
		try {
			Method m=clazz.getMethod("fun2",null);//null或者为空
			System.out.println("方法名："+m.getName());
			System.out.println(m.invoke(p1));
			
			Method pm=clazz.getDeclaredMethod("fun1");
			pm.setAccessible(true);
			pm.invoke(p1);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		/*
		 * Constructor构造方法(反射注入：利用属性类型的包装类的构造方法)
		 * clazz.getConstructor(参数列表)
		 * con.getModifiers();
            		con.getName();
            		con.getParameterTypes();
            		con.getExceptionTypes();
		如何操作构造方法
		执行一次   创建对象
		Object = newInstance(执行构造方法时的所有参数);
		con.setAccessible(true);
		 * 
		 */
		
		try {
			Constructor con=clazz.getConstructor();//有参数传递参数
			Person p2=(Person)con.newInstance();
			System.out.println(p2);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
	}
}
