package program;
import java .util.Scanner;
public class assessment {
	
	// 1) voting 
//	
//  void eligible(int age) {
//		 if(age>=18) {
//				System.out.println("You are eligible to vote 👍");}
//				else {
//					System.out.println("you are under 18");
//				}
//	 }
//	
//	public static void main(String[]args) {
//		
//		Scanner scan = new Scanner (System.in);
//		System.out.print("Enter your age: ");
//		int age = scan .nextInt();
//		assessment obj = new assessment();
//	 obj.eligible(age);
//}
	
	
	
	//2) print jack
//	public static void main(String args[]) {
//		Scanner scan = new Scanner (System.in);
//		System.out.print("Enter name:");
//		String name=scan.nextLine();
//		
//for(int i=1;i<=100;i++) {
//
//	if(i%4==0) {
//		System.out.println(name);
//	}else {
//	System.out.println(i);	}
//}
//		
//
//	}
	
	
	
	//3) skip odd numbers from 1 to 70
	
//	public static void main(String args[]) {
//	Scanner scan = new Scanner(System.in);	
//	System.out.println("Enter your range:");
//	int num = scan.nextInt();
//	for(int i =1;i<=num;i++) {
//		if(i%2==0) {
//			System.out.println(i);
//		}
//		else {
//			continue;
//		}
//	}
//	
//	}

	
	// 4) even or odd
	
//	public static void main(String args[]) {
//		Scanner scan = new Scanner(System.in);	
//		System.out.print("Enter your number:");
//		int num = scan.nextInt();
//	
//			if(num%2==0) {
//				System.out.println(num+ " is Even");
//			}
//			else {
//				System.out.println(num+ " is Odd");
//			}
//
//		
//		}
//	
	
	// 5) String upper and lower case

//  public static void main(String[] args) {
//	
//	  Scanner scan = new Scanner(System.in);
//	  System.out.println("Enter your first name");
//	  String name=scan.next();
//	  System.out.println("Enter you second name");
//	  String name2=scan.next();
//	  System.out.println(name.toUpperCase());
//	  System.out.println(name2.toLowerCase());
//	  
//}
	
	//6) Pass or Fail
	
	
//public static void main(String[] args) {
//	
//
//Scanner scan=new Scanner(System.in);
//System.out.println("Enter your marks:");
//	int marks = scan .nextInt();
//	if(marks>=35 ) {
//	if(marks>=90) {
//		System.out.println("Grade A");
//		}
//	else if(marks>=70) {
//		System.out.println("Grade B");
//	}
//	else if(marks>=50) {
//		System.out.println("Grade C");
//	}
//	else {
//	System.out.println("Grade D");
//	}
//	}
//	else {
//		System.out.println("Fail");
//	}
//	
//	
//}
	
	
	//7)total and avg
	
	
//	int total(int eng, int tam, int sci, int soc ,int mat) {
//		return eng+tam+sci+soc+mat;
//	}
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		System.out.println("ENTER MATHS MARK: ");
//		int mat = scan .nextInt();
//		System.out.println("ENTER ENGLISH MARK: ");
//		int engl = scan .nextInt();
//		System.out.println("ENTER SOCIAL MARK: ");
//		int sst = scan .nextInt();
//		System.out.println("ENTER HINDI MARK: ");
//		int hin = scan .nextInt();
//		System.out.println("ENTER SCIENCE MARK: ");
//		int sci = scan .nextInt();
//		
//		assessment result = new assessment();
//		int tot= result.total(mat,engl,sst,hin,sci);
//		System.out.println("TOTAL: "+tot);
//		float avg = tot/5;
//		System.out.println("Average: "+avg);
//
//	 } 
		
	
	//8)Leap Year
	
	void leap(int year) {
		if((year %4 == 0) && (year%100!=0 || year%400==0)){
			System.out.println("LEAP YEAR");
		}else {
			System.out.println("NOT LEAP YEAR");
		}
	}
	public static void main(String [] args){
		Scanner scan= new Scanner(System.in);
		System.out.println("ENTER YEAR: ");
		int year = scan.nextInt();
		assessment ans=new assessment();
		ans.leap(year);
	
	
	}
}
	
	
