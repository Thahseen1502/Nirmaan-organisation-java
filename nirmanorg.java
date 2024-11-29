package day6;
import java .util. Scanner;
public class nirmanorg {
	
	
	String name;
	int id ;
	float salary;
	String dept;
	
	
	void checkIn(String checked) {
		System.out.println(checked);
	}
	
	public static void main(String args[]) {
		
		Scanner scan = new Scanner (System.in);
		
		nirmanorg emp1 = new nirmanorg();
		emp1.name="Thahseen";
		emp1.id= 100 ;
		emp1.salary=100000;
		emp1.dept="MCA";
emp1.checkIn("Employee 1 is here");
System.out.println("name:"+emp1.name+" "+"id:"+emp1.id+" "+"salary:"+emp1.salary+" "+"department:"+emp1.dept);		


		nirmanorg emp2 = new nirmanorg();
		
		emp2.name=scan.next();
		emp2.id= scan.nextInt() ;
		emp2.salary=scan.nextFloat();
		emp2.dept=scan.next();
		emp1.checkIn("Employee 2 is here");
		System.out.println("name:"+emp2.name+" "+"id:"+emp2.id+" "+"salary:"+emp2.salary+" "+"department:"+emp2.dept);		
	}

}
