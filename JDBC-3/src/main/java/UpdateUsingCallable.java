 import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.cj.jdbc.Driver;

public class UpdateUsingCallable {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your upadating Qualification:- ");
		String qualif=sc.next();
		System.out.println("Enter which id you want to update their Qualification:- ");
		int id=sc.nextInt();
		DriverManager.registerDriver(new Driver());
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc?user=root&password=root");
		 CallableStatement cs = con.prepareCall("call jdbc.task1(?, ?)");
		 cs.setString(1,qualif);
		 cs.setInt(2, id);
		 cs.execute();
		 cs.close();
		 con.close();
		 System.out.println("updated successfully.........");
		 

	}

}
