package util;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JDBCUtil {

	private static String user = null;
	private static String password = null;
	private static String url = null;
	private static String driverClass = null;
	
	static {
		Properties p = new Properties();
		String path = JDBCUtil.class.getResource("/").getPath();
		String ps = path.substring(0,path.length()-8);
		
	
		try {
			InputStream in = new FileInputStream(ps+"db.properties");
			p.load(in);
		} catch (IOException e) {
			e.printStackTrace();
		}
		user = p.getProperty("user");
		password = p.getProperty("password");
		url = p.getProperty("url");
		driverClass = p.getProperty("driverClass");
		try {
			Class.forName(driverClass);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static  Connection getConnection(){
		try {
			Connection con = DriverManager.getConnection(url,user,password);
			return con;	
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}	
	public static void close(Connection con,Statement state,ResultSet rs){
	
		if (con!=null){
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (state!=null){
			try {
				state.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (rs!=null){
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	public static void close(Connection con, Statement state){
		
	}
	
	public static void main(String[] args) {
		System.out.println(JDBCUtil.getConnection());
	}
}
