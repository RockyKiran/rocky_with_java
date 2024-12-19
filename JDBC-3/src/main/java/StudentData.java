import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.cj.jdbc.Driver;

public class StudentData {

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
		PreparedStatement ps = con.prepareStatement("insert into student values(?,?,?,?,?,?,?)");
		ps.setInt(1, id);
		ps.setString(2, name);
		ps.setString(3, email);
		ps.setLong(4, phNo);
		ps.setString(5, gender);
		ps.setInt(6, age);
		ps.setString(7, qulif);
		ps.execute();
		ps.close();
		con.close();
		System.out.println();
		System.out.println();
		System.out.println("Rocky..................");
		

	}

}
