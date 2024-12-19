import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class CrateTbleExist {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
				DriverManager.registerDriver(new Driver());
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc3?createDatabaseIfNotExist=true", "root", "root");
		Statement sta = con.createStatement();
		sta.execute("create table IF NOT EXISTS dept (dept_id int primary key,Dname varchar(45),email varchar(45) UNIQUE NOT NULL,salary int,phNo BIGINT(10) UNIQUE)");
		sta.close();
		con.close();
		System.out.println("CREATED.............");
	}

}
