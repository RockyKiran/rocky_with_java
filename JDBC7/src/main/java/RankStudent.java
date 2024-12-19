import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.mysql.cj.jdbc.Driver;



public class RankStudent {
	static Student12restr crud=new Student12restr();
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("........😍WELCOME BUDDY😍..............");
		boolean value=true;
		do {
			System.out.println();
			System.out.println("..........What you want,can you chose in below option:-- \n \n 1.Registration \n 2.Update Rank \n 3.Exit");
			int key=sc.nextInt();
			switch (key) {
			case 1:System.out.println("saved dudee😉😉😉.....");
			save();
//			updateRank();
				break;
			case 2:System.out.println("Update ranking dudee🫡🫡🫡.....");
			updateRank();
			break;
			case 3:System.out.println("exit dudee😏😏😏....."); 
			value=false;
			break;
			default:
				System.out.println("Enter Proper Value bro... (use ur Common sense😤😤)");
			}
		} while (value);
		System.out.println(".........Thank you Buddy For Doing SomeThing😂😂..........");
		System.out.println("............Visit again😁😁😁 ........");

	}

	static void updateRank() throws SQLException {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		boolean check=true;
		List<Integer> data=new ArrayList<>();
		do {
			System.out.println("Enter your choice:---");
			System.out.println("1.Enter mark to Rank \n2.Exit");
			int choice=sc.nextInt();
//			List<String> data=new ArrayList<>();
			if (choice==1) {
				System.out.println("Enter mark to ranking:-");
				int mark=sc.nextInt();
				data.add(mark);	
			}
			else {
				check=false;	
			}	
		} while (check);
		System.out.println(data);
		Collections.sort(data);
		System.out.println(data);
		int n=1;
		double m=Integer.MAX_VALUE;
		int remp = 0;
		for( Integer o:data) {
			if(m>o) {
				remp=n;
				o=n++;
				m=o;	
			}
			else {
				o=remp;	
			}
		}
//		DriverManager.registerDriver(new Driver());
//		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student1?user=root&password=root");
//		 PreparedStatement ps = con.prepareStatement("select id,name,mark,rank from student "); 
//		ResultSet rs = ps.executeQuery();
//		Collections.sort(data);
//		while(rs.next()) {
//			String id=rs.getString(1);
//			System.out.println(id);
//			System.out.println(rs.getString(2));
//			System.out.println(rs.getInt(3));
//			System.out.println(rs.getInt(4));
//			System.out.println();
//			System.out.println("_______________________________________");
//		}
//		
//		ps.close();
//		con.close();
//		System.out.println();
//		System.out.println();
//		System.out.println("updated ranking  Successfully..................");
//	

	}

	private static void save() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id in Integer Type:- ");
		int id=sc.nextInt();
		System.out.println("Enter name in String Type:- ");
		String name=sc.next();
		System.out.println("Enter mark in Integer Type:- ");
		int mark=sc.nextInt();
		Student12 student=new Student12(id, name, mark);
		try {
			crud.saveStudent(student);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			save();
		}
		
	}

}
