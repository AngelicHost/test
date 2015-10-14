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
	 * ɾ���ǰ�����ɾ��,Ҳ����˵,�������Ӧ����Ŀ���ݶ��ᱻɾ����
	 * @see dao.Dao#delete(int)
	 */
	@Override
	public void delete(String date) {
		
	}

	/*
	 * (non-Javadoc)
	 * save����Ľ�����ĳһ����Ŀ������
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
	 * ��������ͬ��Ҳ�������Ŀ���ݵ�
	 * @see dao.Dao#update(java.lang.Object)
	 */
	@Override
	public void update(Project obj,String date) {
	
		
	}

	/*
	 * (non-Javadoc)
	 * ������ʾ�����ѵǼǵ�������Ϣ,�����ǰ�����ȫ��ȡ������װ������(���˷���,ֻ��������Ҫ��ʹ�òű���ȡ)
	 * @see dao.Dao#selectAll()
	 */
	@Override
	public List<Daily> selectAll() {
		
		return null;
	}

	/*
	 * (non-Javadoc)
	 * ֻȡ�������ݵ�ok�ֶ�ֵ,��ֻ��Ҫ֪�����ֶ��Ƿ�������񼴿�
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
