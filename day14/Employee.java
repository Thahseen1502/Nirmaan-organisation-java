package day14;

public class Employee {

	
	private int id;
	private String name;
	private long phno;
	private String dept;


	
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", phno=" + phno + ", dept=" + dept + "]";
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
	public long getPhno() {
		return phno;
	}
	public void setPhno(long phno) {
		this.phno = phno;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}

	public Employee() {
		
	}

	public Employee(int id, String name, long phno, String dept) {
		
		this.id = id;
		this.name = name;
		this.phno = phno;
		this.dept = dept;
	}
	
	
	
	
	
	
	
}
