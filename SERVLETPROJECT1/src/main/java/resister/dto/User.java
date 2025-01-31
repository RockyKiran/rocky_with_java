package resister.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@NoArgsConstructor
@Data
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String fname;
	String lname;
	@Column(unique = true)
	String email;
	String gender;
	long phno;
	String pwd;
	int age;
	public User(String fname, String lname, String email, String gender, long phno, String pwd, int age) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.gender = gender;
		this.phno = phno;
		this.pwd = pwd;
		this.age = age;
	}
	

}
