import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class ExecuteDQLCommand {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		DriverManager.registerDriver(new Driver());
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc?user=root&password=root");
		Statement sta = con.createStatement();
		ResultSet rs = sta.executeQuery("select name,email from student");
		while(rs.next()) {
			String id=rs.getString(1);
			System.out.println(id);
			System.out.println(rs.getString(2));
//			System.out.println(rs.getString(3));
//			System.out.println(rs.getLong(4));
//			System.out.println(rs.getString(5));
//			System.out.println(rs.getInt(6));
//			System.out.println(rs.getString(7));
//			System.out.println();
			System.out.println("_______________________________________");
		}
		
		sta.close();
		con.close();
//		System.out.println("Rocky.............");

	}

}
