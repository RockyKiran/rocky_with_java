import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class Step2 {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		DriverManager.registerDriver(new Driver());
		String url="jdbc:mysql://localhost:3306/db";
		String user="root";
		String pwd="root";
		DriverManager.getConnection(url, user, pwd);
		System.out.println("Roicky...");

	}

}
