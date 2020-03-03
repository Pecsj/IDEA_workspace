package jdbc;

import java.sql.*;

public class Jdbc01 {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/studetmanager","root","123456");
		
		String sql="update student set phone=123456 where stuid=1";
		Statement stmt=conn.createStatement();
		int i=stmt.executeUpdate(sql);
		System.out.println(i);
		
		stmt.close();
		conn.close();
	}

}
