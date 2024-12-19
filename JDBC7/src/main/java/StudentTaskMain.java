import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class StudentTaskMain {
static Student12restr crud=new Student12restr();
	public static List<Student12> fetch() throws SQLException {

		List<Student12> list = new ArrayList<Student12>();
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student1?user=root&password=root");
		PreparedStatement ps = con.prepareStatement("select * from student12 ");

		ResultSet rs = ps.executeQuery();
		while (rs.next()) {

			list.add(new Student12(rs.getInt(1), rs.getString(2), rs.getInt(3)));
		}

		return list;
	}

	public static void updateRank() throws SQLException {
		List<Student12> a1 = fetch();
      System.out.println(a1);
		Collections.sort(a1);

		int n = 1;
		double m = Integer.MAX_VALUE;
		int remp = 0;
		for (Student12 o : a1) {
			if (m > o.mark) {
				remp = n;
				o.rank = n++;
				m = o.mark;
			} else {
				o.rank = remp;
			}
		}

		System.out.println(a1);

		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student1?user=root&password=root");
		PreparedStatement ps = con.prepareStatement("UPDATE `student1`.`student12` SET `rank` = ? WHERE (`id` = ?)");
		for (Student12 student12 : a1) {
			ps.setInt(1, student12.getRank());
			ps.setInt(2, student12.getId());
			ps.addBatch();
		}
		ps.executeBatch();

	}
	
	
	
	
	
	public static void save() {
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
//					updateRank();
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

}
