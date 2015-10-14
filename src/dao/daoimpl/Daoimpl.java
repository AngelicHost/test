package dao.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.List;
import org.apache.commons.dbutils.QueryRunner;
import com.sun.tools.jxc.SchemaGenerator.Runner;
import util.JDBCUtil;
import dao.Dao;
import entity.Daily;
import entity.Project;

public class Daoimpl  implements Dao<Project,Daily>{

	String[] project = {"java","thinkinginjava","algorithms","dianlu","modian","jifen","gailvlun"};
	
	/*
	 * (non-Javadoc)
	 * 删除是按日期删除,也就是说,日期相对应的项目数据都会被删除掉
	 * @see dao.Dao#delete(int)
	 */
	@Override
	public void delete(String date) {
		
	}

	/*
	 * (non-Javadoc)
	 * save保存的仅仅是某一个项目的数据
	 * @see dao.Dao#save(java.lang.Object)
	 */
	@Override
	public void save(Project pro,String date) {
		
		Connection conn =  JDBCUtil.getConnection();
		String  sql = "insert into "+pro.getName()+"where date";
		QueryRunner qr = new QueryRunner();
		try {
			qr.insert(conn, sql, null,date);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		for (int i=0;i<project.length;i++){
			sql = "insert into"+project[i]+"(id,evaluate,costTime,what,ok) values(?,?,?,?,?)";
			
		}
	}

	/*
	 * (non-Javadoc)
	 * 更新数据同样也是针对项目数据的
	 * @see dao.Dao#update(java.lang.Object)
	 */
	@Override
	public void update(Project obj,String date) {
	
		
	}

	/*
	 * (non-Javadoc)
	 * 仅仅显示所有已登记的日期信息,而不是把数据全部取出来封装到里面(懒人方案,只有数据需要被使用才被读取)
	 * @see dao.Dao#selectAll()
	 */
	@Override
	public List<Daily> selectAll() {
		
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 只取出该数据的ok字段值,即只需要知道该字段是否完成任务即可
	 * @see dao.Dao#selectByDate(java.lang.String)
	 */
	@Override
	public Daily selectByDate(String date) {
		
		return null;
	}
	
	public Project select(String pName,String date){
		
		return null;
		
	}
}
