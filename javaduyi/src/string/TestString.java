package string;

public class TestString {

	public static void main(String[] args) {
		String a="你好";
		String b="你好";
		System.out.println(a==b);//从常量池取值，用的同一份内存
		//==		equals(重写)
		/*
		 * 重写方法：
		 * equals()	hashCode()	compareTo()	toString()
		 * 常用方法：
		 * chatAt()	 codePoint()
		 * indexOf()  lastIndexOf()
		 * substring()  split()  replace() replaceAll()
		 * length()   concat()   contains()  trim()
		 * gitBytes()   toCharArray()
		 * 一般：
		 * toUpperCase()   toLowerCase()
		 * startsWith()    endsWith()
		 * isEmpty()
		 */
		
		
		
		/* StringBuilder:
		 * String类中没有的方法 append() insert() delete() deleteCharAt() reverse()
		 * String类中同名的方法 charAt() codePointAt() length() indexOf() lastIndexOf()
		 * substring() replace() 一般常用的方法 ensureCapacity() capacity() setCharAt()
		 * setLength() trimToSize();
		 */
		
		
		 /*regex:
		 * 正则表达式regex (Regular Expression) 正则表达式有固定的规律的格式，匹配字符串
		 * 1.用于字符串格式的校验
		 * 2.按照某种字符串的格式 进行拆分 替换 
		 * 3.在比较大段的字符串中寻找 符合某种格式的子字符串 有一些匹配格式的符号写法 [abc] [^abc]
		 * [a-zA-Z] [a-z[^bc]] 
		 * . \d \D \s \S \w \W 
		 * 有一些用来匹配出现次数 ? 0-1 *0-n +1-n {n} {n,} {n,m} 
		 * Pattern p = Pattern.compile("regex"); Matcher m = p.matcher(str);
		 * m.matches();//String类中的方法类似 m.find(); m.group();
		 */
		
	}

}
