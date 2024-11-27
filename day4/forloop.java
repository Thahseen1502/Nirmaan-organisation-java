package day4;

import java.util.Scanner;

public class forloop {
	public static void main(String args[]) {

		//print name
		
//		for(int i=1; i<=100;i++) {
//			if(i%5==0) {
//				System.out.println("Thahseen");
//			}else {
//				System.out.println(i);
//			}
//		}
		
		
		//Even or odd
		
//		for(int i = 1; i<=100;i++) {
//			if(i%2==0 ) {
//				System.out.println(i+"-"+"Even");
//			}else{
//				System.out.println(i+"-"+"Odd");
//			}
//		}
//		
		
		//Simple calc
		
		
		Scanner scan = new Scanner(System.in);
		
//		System.out.println("Addition = 0");
//		System.out.println("Subtraction = 1");
//		System.out.println("Multiplication = 2");
//		System.out.println("Division = 3");
//		System.out.println("Modulus = 4");
//		System.out.println("Exit = 5");
//		
//		System.out.println();
//		System.out.println("Enter your Choice:");
//		
//		
//		int choice=scan.nextInt();
//	System.out.println("Enter firstnum:");
//	int fnum=scan.nextInt();
//	System.out.println("Enter secondnum:");
//	int snum = scan.nextInt();


boolean isTrue=true;
		
		
while(isTrue) {

	
	System.out.println("Addition = 0");
	System.out.println("Subtraction = 1");
	System.out.println("Multiplication = 2");
	System.out.println("Division = 3");
	System.out.println("Modulus = 4");
	System.out.println("Exit = 5");
	
	System.out.println();
	System.out.println("Enter your Choice:");
	
	
	int choice=scan.nextInt();


switch (choice) {

case 0: {
	System.out.println("Enter firstnum:");
	int fnum=scan.nextInt();
	System.out.println("Enter secondnum:");
	int snum = scan.nextInt();
	
	int result=fnum+snum;
System.out.println("Total:"+result);
System.out.println();
	break;
}
case 1: {
	System.out.println("Enter firstnum:");
	int fnum=scan.nextInt();
	System.out.println("Enter secondnum:");
	int snum = scan.nextInt();
	
	int result=fnum-snum;
System.out.println("Total:"+result);
System.out.println();
break;
}
case 2: {
	System.out.println("Enter firstnum:");
	int fnum=scan.nextInt();
	System.out.println("Enter secondnum:");
	int snum = scan.nextInt();
	
	long result=(long)fnum*snum;
System.out.println("Total:"+result);
System.out.println();
break;
}
case 3: {
	System.out.println("Enter firstnum:");
	int fnum=scan.nextInt();
	System.out.println("Enter secondnum:");
	int snum = scan.nextInt();
	
	int result=fnum/snum;
System.out.println("Total:"+result);
System.out.println();
break;
}
case 4: {
	System.out.println("Enter firstnum:");
	int fnum=scan.nextInt();
	System.out.println("Enter secondnum:");
	int snum = scan.nextInt();
	
	int result=fnum%snum;
System.out.println("Total:"+result);
System.out.println();
break;
}
case 5:{
	
	isTrue = false;
	System.out.println("Thank you :)");

	break;
}
default:{
	
	System.out.println("Invalid choice");
	
}
}
	
}
		
	}
}


