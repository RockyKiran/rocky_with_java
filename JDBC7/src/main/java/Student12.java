
public class Student12 implements Comparable<Student12>  {
	int id;
	String name;
	int mark;
	int rank;
	@Override
	public String toString() {
		return "Student12 [id=" + id + ", name=" + name + ", mark=" + mark + ", rank=" + rank + "]\n";
	}
	public Student12(int id, String name, int mark) {
		super();
		this.id = id;
		this.name = name;
		this.mark = mark;
		
	}
	public Student12() {
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
	public int getMark() {
		return mark;
	}
	public void setMark(int mark) {
		this.mark = mark;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	@Override
	public int compareTo(Student12 o) {
		// TODO Auto-generated method stub
		return (int) (o.mark-this.mark);
		
	}
	

}
