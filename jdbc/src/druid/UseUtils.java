package druid;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import utils.JDBCUtils_Druid;

public class UseUtils {

	public static void main(String[] args) {
		//使用Druid——JDBCUtils实现事务转账
		Connection conn=null;
		PreparedStatement pstmt1=null;
		PreparedStatement pstmt2=null;
		Scanner sc=new Scanner(System.in);
		try {
			conn=JDBCUtils_Druid.getConnection();
			
			//转账人
			String sql1="update user set balance=balance-? where name=?";
			pstmt1=conn.prepareStatement(sql1);
			//收款人
			String sql2="update user set balance=balance+? where name=?";
			pstmt2=conn.prepareStatement(sql2);
			
			System.out.println("输入转款人：");
			String name1=sc.next();
			System.out.println("输入收款人：");
			String name2=sc.next();
			System.out.println("输入转账金额：");
			int money=sc.nextInt();
			
			pstmt1.setInt(1, money);
			pstmt1.setString(2,name1);
			pstmt2.setInt(1, money);
			pstmt2.setString(2,name2);
			
			conn.setAutoCommit(false);//关闭自动提交，开始事务
			pstmt1.executeUpdate();
			//int i=3/0;
			pstmt2.executeUpdate();
			conn.commit();//提交事务
			System.out.println("转账成功");
		} catch (Exception e) {
			//发生错误，回滚事务
			try {
				if(conn!=null) {
					conn.rollback();
					System.out.println("转账失败");
				}
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		}finally {
			JDBCUtils_Druid.close(conn, pstmt1);
			JDBCUtils_Druid.close(conn, pstmt2);
		}
		
	}

}
