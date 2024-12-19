package jdbc4.dto;

public class Student {
	int id;
	String name;
	String email;
	long phNo;
	String gender;
	int age;
	String qualification;
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", phNo=" + phNo + ", gender=" + gender
				+ ", age=" + age + ", qualification=" + qualification + "]";
	}
	public Student(int id, String name, String email, long phNo, String gender, int age, String qualification) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phNo = phNo;
		this.gender = gender;
		this.age = age;
		this.qualification = qualification;
	}
	public Student() {
		super();
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	
	
	

}
