package list;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		/*继承关系
		 * Collection					Map
		      存储的都是value					存储的是以key-value形式存在
		  List		Set	
		有序可重复		无序无重复				key无需无重复 value无需可重复
		 */
		
		ArrayList<String> arraylist=new ArrayList<String>();
		arraylist.add("a");
		arraylist.add("b");
		System.out.println(arraylist);
		
		
		/*
		 * ArrayList 1.2     有序可重复
		 * arraylist.get()     注意数组越界
		 * arraylist.size()
		 * arraylist.set()		修改元素
		 * remove()     注意不要重复调用size()   clear()
		 * addAll(Collection<? extends 父类>)     只能传子类
		 * contains()	isEmpty()	indexof()	
		 * Iterator = list.iterator();  //迭代器(通常遍历没有索引)
		 * 
		 * remove(int index)索引	  remove(Object obj)对象		
		 * 默认int			使用new Integer(10);
		 * 
		 * a.removeAll(b)返回差集		从a中删除b中的元素
		 * retainAll()返回交集
		 * List = subList(int begin,int end);
		 * toArray();	集合变成数组
		 * toArray(T[] );
		 * trimToSize();// 变成有效元素个数那么长
		 */
		
		/*
		 * Vector 类  1.0
		 * 1.java.util包 
		 * 2.是ArrayList集合的早期版本 (StringBuffer早期 StringBuilder后来)
		 * Vector底层也是利用(动态)数组的形式存储 Vector是线程同步的(synchronized) 安全性高 效率低
		 * 3.扩容方式与ArrayList不同 默认是扩容2倍 可以通过构造方法创建对象时修改这一机制 
		 * 4.构造方法
		 * 5.常用方法
		 */
		
		/*
			Stack 类	栈
			1.java.util包
			2.构造方法只有一个无参数
			3.除了继承自Vacton类的方法外还有特殊的方法
			
			push(E e)将某一个元素压入栈顶(add())
			E = pop()将某一个元素从栈顶取出并删掉(E = remove())
			
			E = peek()查看栈顶的一个元素 不删除(get())
			boolean = empty()判断栈内元素是否为空(isEmpty())
			int = search()查找给定的元素在占中的位置(indexOf())
		 */
		
		/*
		 *  Queue  接口	1.5
			1.java.util		通常子类LinkedList   ArrayDeque
			2.通常无参数构造方法创建
			3.一般方法
			add()
			element()---->get()
			remove()
			
			boolean = offer(E e);//相当于add	不会抛出异常
			E = peek();//相当于 element方法
			E = poll();剪短//  相当于remove()
		 */
		
	}

}
