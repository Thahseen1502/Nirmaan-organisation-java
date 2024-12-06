package day11;

public class nirmanorg {
public static void main(String[] args) {
	
	//getter setter 
	
	employee emp1 = new employee();
	System.out.println("Employee 1: ");
	emp1.setName("Thahseen");
	System.out.println("Name: "+emp1.getName());
	emp1.setAge(22);
	System.out.println("Age: "+emp1.getAge());
	emp1.setDepartment("MCA");
	System.out.println("Department: "+emp1.getDepartment());
	emp1.setId(100);
	System.out.println("Id: "+emp1.getId());
	System.out.println();
	
	System.out.println("Employee 2: ");
	employee emp2 = new employee();
	emp2.setName("Haritha");
	System.out.println("Name: "+emp2.getName());
	emp2.setAge(23);
	System.out.println("Age: "+emp2.getAge());
	emp2.setDepartment("Msc");
	System.out.println("Department: "+emp2.getDepartment());
	emp2.setId(101);
	System.out.println("Id: "+emp2.getId());
	System.out.println();
	
	
	//constructor 
	System.out.println("Employee 3: ");
	employee emp3 = new employee("Sanjay",23,"MCA",102) ;
	System.out.println("Name: "+emp3.getName());
	System.out.println("Age: "+emp3.getAge());
	System.out.println("Department: "+emp3.getDepartment());
		System.out.println("Id: "+emp3.getId());
	System.out.println();
	//toString
		System.out.println("Employee details:");
		System.out.println(emp1.toString());
			System.out.println(emp2.toString());
		System.out.println(emp3.toString());
}
}
