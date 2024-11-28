package day5oops;

public class oops {

	String name="";
	int age ;
	int rollnum;
	String dob;
	
	
	
	void Start() {
		System.out.println("Student starts running.");
	}
	void Stop() {
		System.out.println("Student stops running.");
	}
	String Play() {
		return "Playing Football";
	}
	
	public static void main(String args[]) {
		
		
		oops std1 = new oops();
		std1.name = "Thahseen";
		std1.age = 22;
		std1.rollnum=2355;
		std1.dob="15/06/2002";
		std1.Start();
		System.out.println("name:"+std1.name+" "+"age:"+std1.age+" "+"rollnum:"+std1.rollnum+" "+"dob:"+std1.dob);
		System.out.println(std1.Play());
		std1.Stop();

		oops std2 = new oops();
		std2.name = "Haritha";
		std2.age = 23;
		std2.rollnum=5050;
		std2.dob="23/11/2001";
		std2.Start();
		System.out.println("name:"+std2.name+" "+"age:"+std2.age+" "+"rollnum:"+std2.rollnum+" "+"dob:"+std2.dob);
		System.out.println(std2.Play());
		std2.Stop();
	}
	
}
