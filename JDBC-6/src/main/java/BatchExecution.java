import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BatchExecution {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		boolean check=true;
		List<String> data=new ArrayList<>();
		do {
			System.out.println("Enter your choice:---");
			System.out.println("1.Enter name to Delete \n 2.Exit");
			int choice=sc.nextInt();
//			List<String> data=new ArrayList<>();
			if (choice==1) {
				System.out.println("Enter name to Delete:-");
				String name=sc.next();
				data.add(name);	
			}
			else {
				check=false;
			}	
		} while (check);
		System.out.println(data);
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc?user=root&password=root");
		PreparedStatement ps = con.prepareStatement("delete from student where name=?");
		for (String name : data) {
			ps.setString(1, name);
			ps.addBatch();
			System.out.println(name  +": added into batch");
			
		}
		int[] eb = ps.executeBatch();
		for (int i : eb) {
			System.out.println(i);
		}
	}
	

}
