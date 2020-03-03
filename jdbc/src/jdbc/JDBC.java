package jdbc;

import java.sql.*;
import java.util.Scanner;

public class JDBC {
	private Connection conn;//最后统一关闭
	private Statement stmt;//最后统一关闭
	private ResultSet rs=null;
	private PreparedStatement pstmt=null;//防sql注入
	
	//[静态]块注册驱动（mysql5.5以后可省略）
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	//获取链接和sql对象
	public void getconn_stmt(String dateBase) {
		try {
			conn=DriverManager.getConnection("jdbc:mysql:///"+dateBase,"root","123456");
			stmt=conn.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if(conn==null) {
			System.out.println("链接数据库失败");
		}
	}
	//业务结束，关闭对象
	public void closeconn_stmt() {
		if(stmt!=null) {
			try {
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if(conn!=null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if(rs!=null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if(pstmt!=null) {
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if(stmt==null||conn==null||rs==null||pstmt==null) {//只有boolean才能使用||
			System.out.println("关闭失败");
		}
	}
	//更新
	public void update(String DDLSql) {
		try {
			stmt.executeUpdate(DDLSql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	//查询
	public void select(String sql) {
		try {
			rs=stmt.executeQuery(sql);
			while(rs.next()) {//光标向下一行并且此行存在数据返回true
				StringBuffer sb=new StringBuffer();
				sb.append(rs.getInt(1)+"\t");
				sb.append(rs.getString(2)+"\t");
				sb.append(rs.getInt(3)+"\n");
				System.out.println(sb.toString());
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	//安全查询（防sql注入）登陆

	public void preSelect() {
		try {
			String sql="Select * from user where name=? and age=?";
			Scanner sc=new Scanner(System.in);
			pstmt=conn.prepareStatement(sql);
			System.out.println("输入账号");
			String name=sc.next();
			System.out.println("输入年龄");
			int age=sc.nextInt();
			
			//拼接sql语句
			pstmt.setString(1,name);
			pstmt.setInt(2, age);
			//比较登陆
			ResultSet rs=pstmt.executeQuery();
			if(rs.next()) {
				System.out.println("登陆成功");
			}else {
				System.out.println("登陆失败");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		JDBC jdbc=new JDBC();
		//连接数据库
		jdbc.getconn_stmt("test");
		
		//添加
		//jdbc.update("INSERT INTO user(name,age) VALUES ('常胜杰',23)");
		//查询
		jdbc.select("SELECT * FROM user");
		//删除
		//jdbc.update("DELETE FROM user WHERE name='常胜杰'");
		
		//使用preparestatement安全登陆
		jdbc.preSelect();
		
		
		//关闭连接
		jdbc.closeconn_stmt();
	}
	
}
