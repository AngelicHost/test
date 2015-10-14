package dao.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;

import util.JDBCUtil;
import dao.ProjectDao;
import entity.Project;

public class ProjectDaoimpl implements ProjectDao<Project>{

	@Override
	public void save(Project obj) {
		Connection conn =  JDBCUtil.getConnection();
		String sql = "insert into"+obj.getName()+"(id,evaluate,costTime,what,ok) values(?,?,?,?,?)";
		Object[] o = {getId(obj.getDate()),obj.getEvaluate(),obj.getCostTime(),obj.getWhat(),obj.isOk()};
		QueryRunner qr = new QueryRunner();
		try {
			qr.insert(conn, sql, null,o);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void update(Project obj) {
		
		
	}

	@Override
	public Project select(String pName) {
		
		return null;
	}
	
	private int getId(String date){
		Connection conn =  JDBCUtil.getConnection();
		String sql = "select id from dates where date=? ";
	    int t = 0;
		try {
			PreparedStatement p = conn.prepareStatement(sql);
			p.setString(1, date);
			ResultSet rs = p.executeQuery();
			if (rs!=null)
				t = rs.getInt(1);
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return t;
	}
	

}
