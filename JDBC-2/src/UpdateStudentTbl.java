import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver; 

public class UpdateStudentTbl {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		DriverManager.registerDriver(new Driver());
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc?user=root&password=root");
		Statement sta = con.createStatement();
		sta.execute("UPDATE student SET email = 'rockykiran8085@gmail.com', phNo = 6372863436 WHERE id = 1 AND name = 'rocky'");
		sta.close();
		con.close();
		System.out.println("Rocky...................");
		
		
	}

}
