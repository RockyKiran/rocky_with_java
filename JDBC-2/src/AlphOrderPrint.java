import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class AlphOrderPrint {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		DriverManager.registerDriver(new Driver());
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc?user=root&password=root");
		PreparedStatement ps = con.prepareStatement("SELECT * FROM student ORDER BY name ASC");
		ResultSet data = ps.executeQuery();
		while(data.next()) {
			String id=data.getString(1);
			System.out.println(id);
			System.out.println(data.getString(2));
			System.out.println(data.getString(3));
			System.out.println(data.getLong(4));
			System.out.println(data.getString(5));
			System.out.println(data.getInt(6));
			System.out.println(data.getString(7));
			System.out.println();
			System.out.println("_______________________________________");
		}
		ps.close();
		con.close();
		System.out.println();
		System.out.println();
//		System.out.println("Rocky..................");

	}

}
