package c3p0;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;//jdbc统一接口
import com.mchange.v2.c3p0.ComboPooledDataSource;//连接池

public class C3p0Demo {

	public static void main(String[] args) throws SQLException {
		//连接池(使用默认配置)自动寻找c3po-config.xml配置文件
		DataSource ds=new ComboPooledDataSource();
		//使用指定配置
		//DataSource ds=new ComboPooledDataSource("otherc3p0");
		//获取连接
		Connection conn=ds.getConnection();
		
		System.out.println(conn);
	}

}
