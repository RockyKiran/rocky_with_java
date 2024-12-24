package jdbcproject.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

import jdbcproject.dto.StudentDetails;

public class StudentRestr {


	public void saveStudent(StudentDetails s) throws SQLException {
		// TODO Auto-generated method stub
//		System.out.println(s);
		DriverManager.registerDriver(new Driver());
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_project?user=root&password=root");
		PreparedStatement ps = con.prepareStatement("insert into studentdetails values(?,?,?,?,?,?,?,?,?)");
		ps.setInt(1,s.getId());
		ps.setString(2,s.getName());
		ps.setString(3,s.getEmail() );
		ps.setLong(4,s.getPhNo());
		ps.setString(5,s.getGender());
		ps.setInt(6,s.getAge());
		ps.setString(7,s.getPassword());
		ps.setString(8,s.getAdd());
		ps.setString(9,s.getQualification());
		ps.execute();
		ps.close();
		con.close();
		System.out.println();
		System.out.println();
		System.out.println("registration Successfully..................");
	}

}
