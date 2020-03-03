package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc03 {

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql:///studetmanager","root","123456");
			stmt=conn.createStatement();
			
			//String sql="update student set cid=1 where stuid=11";
			String sql="delete from student where stuid=11";
			
			int i= stmt.executeUpdate(sql);
			System.out.println(i);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
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
