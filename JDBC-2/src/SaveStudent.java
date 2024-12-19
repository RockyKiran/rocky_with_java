import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SaveStudent {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc?user=root&password=root");
		Statement sta = con.createStatement();
		sta.execute("insert into student values(9,'Som','som@gmail.com',1234567899,'male',25,'MBBS')");
		sta.close();
		con.close();
		System.out.println("rocky...............");
	}

}
