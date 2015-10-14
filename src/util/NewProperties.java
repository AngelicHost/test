package util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class NewProperties {

	public static void main(String[] args) {
		String path = NewProperties.class.getResource("/").getPath();
		String ps = path.substring(0,path.length()-8);
		System.out.println(ps);
		File file = new File(ps+"db.properties");
		if (!file.exists()){
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		Properties p = new Properties();
		InputStream in;
		try {
			in = new FileInputStream(file);
			p.load(in);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		p.setProperty("user", "root");
		p.setProperty("password", "123456");
		p.setProperty("url", "jdbc:mysql://localhost:3306/Test?useUnicode=true&characterEncoding=utf8");
		p.setProperty("driverClass", "com.mysql.jdbc.Driver");
		OutputStream out;
		try {
			out = new FileOutputStream(file);
			p.store(out, null);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
