import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.cj.jdbc.Driver;

public class PreparedStatementDynamic {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		String name=sc.next();
		int age=sc.nextInt();
		
		DriverManager.registerDriver(new Driver());
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc?user=root&password=root");
//		PreparedStatement ps = con.prepareStatement("select id,name from student where qualification='btech'");
		PreparedStatement ps = con.prepareStatement("select id,name from student where qualification=? AND age=?");
		ps.setString(1, name);
		ps.setInt(2,age);
//		ps.executeUpdate();
//		ps.execute();
		ResultSet data = ps.executeQuery();
		while(data.next()) {
			System.out.println(data.getInt(1));
			System.out.println(data.getString(2));
			System.out.println();
		}

	}

}
