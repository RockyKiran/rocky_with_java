import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.mysql.cj.jdbc.Driver;


public class Student12restr {
	static RankStudent back=new RankStudent();
	public void saveStudent(Student12 s) throws SQLException {
		// TODO Auto-generated method stub
//		System.out.println(s);
		DriverManager.registerDriver(new Driver());
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student1?user=root&password=root");
		PreparedStatement ps = con.prepareStatement("insert into student12 values(?,?,?,?)");
		ps.setInt(1,s.getId());
		ps.setString(2,s.getName());
		ps.setInt(3,s.getMark());
		ps.setInt(4, s.getRank());
		ps.execute();
		ps.close();
		con.close();
		System.out.println();
		System.out.println();
		System.out.println("registration Successfully..................");
	

}
//	public void rank(Student12 s) throws SQLException {
//		Scanner sc =new Scanner(System.in);
//		boolean check=true;
//		List<Integer> data=new ArrayList<>();
//		do {
//			System.out.println("Enter your choice:---");
//			System.out.println("1.Enter mark to Rank \n2.Exit");
//			int choice=sc.nextInt();
////			List<String> data=new ArrayList<>();
//			if (choice==1) {
//				System.out.println("Enter mark to ranking:-");
//				int mark=sc.nextInt();
//				data.add(mark);	
//			}
//			else {
//				
////				RankStudent.updateRank();
//				check=false;
//				
//			}	
//		} while (check);
//		DriverManager.registerDriver(new Driver());
//		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student1?user=root&password=root");
//		PreparedStatement ps = con.prepareStatement("UPDATE student SET rank = ? WHERE mark=?");
//		ps.setInt(1,s.getRank());	
//		ps.setInt(2,s.getMark());
//		for (Integer rank : data) {
//			ps.setInt(1, rank);
//			ps.addBatch();
//			System.out.println(rank  +": added into batch");
//		}
//		int[] eb = ps.executeBatch();
//		for (int i : eb) {
//			System.out.println(i);
//		}
//		
//		ResultSet rs = ps.executeQuery("select id,name,mark,rank from student ");
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
	}

//}
