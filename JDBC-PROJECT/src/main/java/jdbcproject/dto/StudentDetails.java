package jdbcproject.dto;

public class StudentDetails {
	 int id;
	 String name;
	 String email;
	 long phNo;
	 String gender;
	 int age;
	String password;
	 String add;
	 String qualification;
	 
	 public StudentDetails(int id, String name, String email, long phNo, String gender, int age, String password,
				String add, String qualification) {
			super();
			this.id = id;
			this.name = name;
			this.email = email;
			this.phNo = phNo;
			this.gender = gender;
			this.age = age;
			this.password = password;
			this.add = add;
			this.qualification = qualification;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAdd() {
		return add;
	}

	public void setAdd(String add) {
		this.add = add;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	@Override
	public String toString() {
		return "StudentDetails [id=" + id + ", name=" + name + ", email=" + email + ", phNo=" + phNo + ", gender="
				+ gender + ", age=" + age + ", password=" + password + ", add=" + add + ", qualification="
				+ qualification + "]";
	}



	
	

}
