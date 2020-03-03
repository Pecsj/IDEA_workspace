package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc02 {

	public static void main(String[] args) {
		Connection conn=null;
		Statement stmt=null;
		try {
			//1.注册驱动
			Class.forName("com.mysql.jdbc.Driver");
			//2.数据库连接对象
			conn=DriverManager.getConnection("jdbc:mysql:///studetmanager","root","123456");
			//3.sql语句对象
			stmt=conn.createStatement();
			//4.sql语句执行
			String sql="insert student value (11,'常胜杰','男','18596213346','1998-3-19','2')";
			int count=stmt.executeUpdate(sql);
			if(count>0) {
				System.out.println("执行成功"+count);
			}else {
				System.out.println("执行失败！");
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
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
			
		}
		
	}

}
