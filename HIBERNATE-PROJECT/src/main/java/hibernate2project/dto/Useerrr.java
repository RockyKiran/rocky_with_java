package hibernate2project.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity

public class Useerrr {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String name;

	String email;
	long phNo;
	int age;
	double mark;
	int userrank;
	@Override
	public String toString() {
		return "Useerrr [id=" + id + ", name=" + name + ", email=" + email + ", phNo=" + phNo + ", age=" + age
				+ ", mark=" + mark + ", rank=" + userrank + "]";
	}
	public Useerrr( String name, String email, long phNo, int age, double mark2) {
		super();
	
		this.name = name;
		this.email = email;
		this.phNo = phNo;
		this.age = age;
		this.mark = mark2;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhNo() {
		return phNo;
	}
	public void setPhNo(long phNo) {
		this.phNo = phNo;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getMark() {
		return mark;
	}
	public void setMark(Double mark) {
		this.mark = mark;
	}
	public int getRank() {
		return userrank;
	}
	public void setRank(int rank) {
		this.userrank = rank;
	}
	public Useerrr() {
		super();
	}
	
	
}
