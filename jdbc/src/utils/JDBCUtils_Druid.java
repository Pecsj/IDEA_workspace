package utils;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import javax.sql.DataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;

public class JDBCUtils_Druid {
	private static DataSource ds;
	
	//静态块加载配置文件获取连接池
	static {
		Properties pro=new Properties();
		InputStream inStream=JDBCUtils_Druid.class.getClassLoader().getResourceAsStream("druid.properties");
		try {
			pro.load(inStream);
			ds=DruidDataSourceFactory.createDataSource(pro);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//获取连接
	public static Connection getConnection() {
		Connection conn=null;
		try {
			conn = ds.getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	//关闭连接
	public static void close(Connection conn,PreparedStatement pstmt) {
		close(conn,pstmt,null);
	}
	public static void close(Connection conn,PreparedStatement pstmt,ResultSet rs) {
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
		
		if(conn!=null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	//获取DataSource对象
	public static DataSource getDataSource() {
		return ds;
	}
	
	
	
}
