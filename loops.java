package day3;
import java.util.Scanner;
public class loops {
	
	public static void main(String args[]) {
		
		//Nested-if
		
//		Scanner scan=new Scanner(System.in);
//		System.out.println("Enter your marks:");
//		int marks = scan .nextInt();
//		if(marks>=35 ) {
//		if(marks>=90) {
//			System.out.println("Grade A");
//			}
//		else if(marks>=70) {
//			System.out.println("Grade B");
//		}
//		else if(marks>=50) {
//			System.out.println("Grade C");
//		}
//		else {
//		System.out.println("Grade D");
//		}
//		}
//		else {
//			System.out.println("Fail");
//		}
//		
		
		//Tables for loop
		// Scanner scan=new Scanner(System.in);
		// System.out.println("Enter number:");
		// int num = scan.nextInt();
		
		
		// for(int i=1;i<=10;i++) {
		// 	System.out.println(num+"x"+i+"="+i*num);
		// }

			//NESTED FOR LOOP
		
		
		for(int i=1;i<=10;i++) {
			for(int j=1;j<=5;j++) {
				System.out.println(j);
			}
			System.out.println("End");
		}
	}

}

