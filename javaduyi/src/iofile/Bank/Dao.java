package iofile.Bank;

import java.util.HashMap;

/**
 * 为银行业务服务的数据持久化层
 * 依靠小弟FileLoadCommit来实现
 * @author Administrator
 *
 */
public class Dao {
	//加载一个小弟
	private FileLoadCommit flc=new FileLoadCommit("src\\iofile\\Bank\\User.data");
	//存储数据
	private HashMap<String,User> userMap=flc.fileLoad();
	
	//满足查找业务
	public User searchUser(String name) {
		return userMap.get(name);
	}
	//实现更新业务
	public boolean update(User user) {
		userMap.put(user.getName(), user);
		System.out.println("集合数量"+userMap.size());
		return flc.commit(userMap);
	}
}
