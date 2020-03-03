package jdbctemplete;

import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import utils.JDBCUtils_Druid;

public class SpringJdbc {
	private JdbcTemplate template=new JdbcTemplate(JDBCUtils_Druid.getDataSource());
	
	//测试增加数据
	@Test
	public void test1() {
		String sql="insert user values(3,?,?,?,5000)";
		int count=template.update(sql,"dlh","123",24);
		System.out.println(count);
	}
	//测试删除数据
	
	//测试修改数据
	@Test
	public void test3() {
		String sql="update user set balance=? where name=?";
		int count=template.update(sql,10000,"csj");
		System.out.println(count);
	}
	//测试查询数据queryForMap只能封装一个结果
	@Test
	public void test4() {
		String sql="select * from user where name='csj'";
		Map<String,Object> usermap=template.queryForMap(sql);
		System.out.println(usermap);
	}
	//测试用咧查询数据queryForList,将Map集合封装到List方法中
	@Test
	public void test5() {
		String sql="select * from user";
		List<Map<String,Object>> userlist=template.queryForList(sql);
		System.out.println(userlist);
	}
	//测试用咧查询query,封装为javaBean
	@Test
	public void test6() {
		
		String sql="select * from user";
		//注意UserBean中要用基本类型的封装类，防止出现null情况报错
		List<UserBean> userList=template.query(sql, new BeanPropertyRowMapper<UserBean>(UserBean.class));
		for (UserBean userBean : userList) {
			System.out.println(userBean);
		}
	}
	
	//聚合函数结果
	@Test
	public void test7() {
		String sql="select count(id) from user";
		int all=template.queryForObject(sql, Integer.class);
		System.out.println(all);
	}
	
	
	
}
