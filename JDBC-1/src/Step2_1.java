import java.io.FileInputStream;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import com.mysql.cj.jdbc.Driver;

public class Step2_1 {

	public static void main(String[] args) throws SQLException, IOException {
		// TODO Auto-generated method stub
		DriverManager.registerDriver(new Driver());
		FileInputStream stream=new FileInputStream("db.Properties");
		
		Properties p=new Properties();
		p.load(stream);
		DriverManager.getConnection("jdbc:mysql://localhost:3306/db", p);
		System.out.println("rocky.........");
		

	}

}
