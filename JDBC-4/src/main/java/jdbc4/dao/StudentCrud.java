package jdbc4.dao;
//dao---- data access object
//here we will perform crud operation like(delete,save,fetch,update)

//import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

import jdbc4.dto.Student;

public class StudentCrud {
	public void saveStudent(Student s) throws SQLException {
//		System.out.println(s);
		DriverManager.registerDriver(new Driver());
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc?user=root&password=root");
		PreparedStatement ps = con.prepareStatement("insert into student values(?,?,?,?,?,?,?)");
		ps.setInt(1,s.getId());
		ps.setString(2,s.getName() );
		ps.setString(3,s.getEmail() );
		ps.setLong(4, s.getPhNo());
		ps.setString(5, s.getGender());
		ps.setInt(6, s.getAge());
		ps.setString(7, s.getQualification());
		ps.execute();
		ps.close();
		con.close();
		System.out.println();
		System.out.println();
		System.out.println("Rocky..................");

	}

	public void deleteStudent() {

	}

	public void fetchStudent() {

	}

	public void updateStudent() {

	}

	public void exitSudent() {

	}

}
