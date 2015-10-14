package dao.daoimpl;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;

import util.JDBCUtil;
import dao.DailyDao;

public class DailyDaoimpl implements DailyDao  {

	@Override
	public void delete(String date) {
		Connection conn =  JDBCUtil.getConnection();
		String sql = "delect from dates where DATE=?";
		QueryRunner qr = new QueryRunner();
		try {
			qr.update(conn, sql, date);
			if (conn!=null)
				conn.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}

	@Override
	public List selectAll() {
		
		return null;
	}

	@Override
	public Object selectByDate(String date) {
		
		return null;
	}
	

}
