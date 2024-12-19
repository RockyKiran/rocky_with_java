import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.cj.jdbc.Driver;

public class InsrtUsingCallable {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter id in Integer Type:- ");
		int id=sc.nextInt();
		System.out.println("Enter name in String Type:- ");
		String name=sc.next();
		System.out.println("Enter gmail in String Type:- ");
		String email=sc.next();
		System.out.println("Enter phone_No in Integer Type:- ");
		long phNo=sc.nextLong();
		System.out.println("Enter gender in String Type:- ");
		String gender=sc.next();
		System.out.println("Enter age in Integer Type:- ");
		int age=sc.nextInt();
		System.out.println("Enter Qualification in String Type:- ");
		String qulif=sc.next();
		
		DriverManager.registerDriver(new Driver());
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc?user=root&password=root");
		CallableStatement cs = con.prepareCall("call jdbc.taskInsert(?,?,?,?,?,?,?)");
		cs.setInt(1, id);
		cs.setString(2, name);
		cs.setString(3, email);
		cs.setLong(4, phNo);
		cs.setString(5, gender);
		cs.setInt(6, age);
		cs.setString(7, qulif);
		cs.execute();
		cs.close();
		con.close();
		sc.close();
		System.out.println();
		System.out.println();
		System.out.println("Inserted succesfully.............");
		
	}

}
