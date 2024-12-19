import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class DeleteStudentTbl {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		DriverManager.registerDriver(new Driver());
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc?user=root&password=root");
		Statement sta = con.createStatement();
//		sta.execute(null)
//		sta.executeUpdate(null);
//		sta.executeQuery(null);
		
		sta.execute("DELETE FROM student WHERE qualification = 'MCA' AND email = 'satya@gmail.com'");
		sta.close();
		con.close();
		System.out.println("Rocky.............");

	}

}
