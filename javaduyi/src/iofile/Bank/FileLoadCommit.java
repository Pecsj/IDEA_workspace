package iofile.Bank;

import java.io.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 * 通用底层数据操作类
 * 取出-写入
 * @author Administrator
 */
public class FileLoadCommit {
	private String datapath;//存储文件路径
	//构造方法
	public FileLoadCommit() {}
	public FileLoadCommit(String path) {
		datapath=path.replace('\\', '/');
	}
	//将数据加载，并以Map集合的形式返回
	public HashMap<String,User> fileLoad() {
		FileReader fileReader=null;
		BufferedReader bufferedReader=null;
		HashMap<String,User> userMap=new HashMap<String,User>();
		try {
			File file=new File(datapath);
			fileReader = new FileReader(file);
			bufferedReader = new BufferedReader(fileReader);//缓冲字符流
			/**
			 * 错误用法
			 * String[] data=bufferedReader.readLine().split("-");
			 * 当readLine()为null时，出现NullPointerException
			 * 注意可能为空的结果不要连环操作
			 */
			String str=bufferedReader.readLine();
			User user=null;
			while(str!=null) {//写入map集合
				//System.out.println(data.length);
				String[] data=str.split("-");
				user = new User(data[0],data[1],data[2]);
				userMap.put(data[0], user);
				str=bufferedReader.readLine();//再次读取数据
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally {//关闭字符流和缓冲流
			try {
				if(fileReader!=null)
				fileReader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				if(bufferedReader!=null)
				bufferedReader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		return userMap;
	}
	
	//提交数据修改
	public boolean commit(HashMap<String,User> userMap) {
		boolean bool=false;
		FileWriter fw=null;
		BufferedWriter bw=null;
		File file=new File(this.datapath);
		
		try {
			fw=new FileWriter(file);
			bw=new BufferedWriter(fw);
			
			Set<String> set=userMap.keySet();
			Iterator<String> iterator=set.iterator();//获取键值的迭代对象
			//Iterator<String> it=userMap.keySet().iterator()
			
			/**
			 * 错误用法:直接使用next()
			 * String name=iterator.next();
			 * User user=userMap.get(name);
			 * 先用hashNext()判断，再用next()取值，否则可能出现NoSuchElementException
			 */
			
			while(iterator.hasNext()) {//迭代到对象不为空时
				String name=iterator.next();
				User user=userMap.get(name);
				StringBuilder strBuilder=new StringBuilder(user.getName());
				strBuilder.append('-');
				strBuilder.append(user.getPassword());
				strBuilder.append('-');
				strBuilder.append(user.getBalance());
				bw.write(strBuilder.toString());
				bw.newLine();
				bw.flush();
				bool=true;
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(fw!=null)
					fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				if(bw!=null)
					bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return bool;
	}
	
	
	
	
	
	
	
	
	
}
