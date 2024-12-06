package day11;

public class employee {
	
	private String name;
	private  int age;
	private String department;
	private int id;
	
	public String getName() {
		
		return name;
	}
	public int getAge() {
		
		return age;
	}
	public String getDepartment() {
	
	return department;
}
	public int getId() {
	
	return id;
}

	public void setName(String name) {
		
		this.name=name;
	}
	public void setAge(int age) {
		
		this.age=age;
	}
	
	public	void setDepartment(String department) {
		
		this.department=department;
	}
	
	public void setId(int id) {
		
		this.id=id;
	}
	
employee(){
	
}
employee(String name,int age ,String department,int id){
	this.name=name;
	this.age=age;
	this.department=department;
	this.id=id;
	
}


public String toString() {
	return "Name: "+name +" "+"Age: "+ age+" "+"Department: " + department+" "+"Id: "+id;
	
}
}
