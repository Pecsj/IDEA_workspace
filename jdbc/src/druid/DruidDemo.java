package druid;

import java.io.InputStream;
import java.sql.Connection;
import java.util.Properties;

import javax.sql.DataSource;

import com.alibaba.druid.pool.DruidDataSourceFactory;

public class DruidDemo {

	public static void main(String[] args) throws Exception {
		//导入jar包
		//加载配置文件
		Properties pro=new Properties();
		DruidDemo ddm=new DruidDemo();
		InputStream inStream=ddm.getClass().getClassLoader().getResourceAsStream("druid.properties");
		pro.load(inStream);
		//过去连接池对象
		DataSource ds=DruidDataSourceFactory.createDataSource(pro);
		//获取连接
		Connection conn=ds.getConnection();
		
		System.out.println(conn);
	}

}
