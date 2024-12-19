import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class CreateTable {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		DriverManager.registerDriver(new Driver());
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc2?user=root&password=root");
		Statement sta = con.createStatement();
		sta.execute("create table emp (id int primary key,name varchar(45),email varchar(45) UNIQUE NOT NULL,salary int,phNo BIGINT(10) UNIQUE)");
		sta.close();
		con.close();
		System.out.println();
		System.out.println("CREATED............");

	}

}
