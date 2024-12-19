import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.cj.jdbc.Driver;

public class DltUsingCallable {

	public static void main(String[] args) throws SQLException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your id ");
		int id=sc.nextInt();
		
		// TODO Auto-generated method stub
		DriverManager.registerDriver(new Driver());
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc?user=root&password=root");
	CallableStatement cs=con.prepareCall("call jdbc.new_procedure(?)");
		cs.setInt(1, id);
		cs.execute();
		cs.close();
		con.close();
		System.out.println("deleted........!");
		
	}

}
