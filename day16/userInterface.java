package day16;

import java.util.Scanner;

abstract

public class userInterface {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		calculator calc = new calculator();
		boolean isTrue= true;
		while(isTrue) {
			System.out.println("1. Addition");
			System.out.println("2. Subtraction");
			System.out.println("3. Multiplication");
			System.out.println("4. Division");
			System.out.println("0. Exit");
			System.out.println();
			System.out.println("Enter your choice");

			int choice=scan.nextInt();
			if(choice ==1) {
				System.out.println("Enter 1st num: ");
				int fnum = scan.nextInt();
				System.out.println("Enter 2nd num: ");
				int snum = scan.nextInt();
System.out.println(calc.add(fnum,snum));
				}
			else if(choice == 2) {
				System.out.println("Enter 1st num: ");
				int fnum = scan.nextInt();
				System.out.println("Enter 2nd num: ");
				int snum = scan.nextInt();
System.out.println(calc.sub(fnum,snum));
			}
			else if (choice ==3) {
				System.out.println("Enter 1st num: ");
				int fnum = scan.nextInt();
				System.out.println("Enter 2nd num: ");
				int snum = scan.nextInt();
System.out.println(calc.mul(fnum,snum));
			}
			else if(choice == 4) {
				System.out.println("Enter 1st num: ");
				int fnum = scan.nextInt();
				System.out.println("Enter 2nd num: ");
				int snum = scan.nextInt();
System.out.println(calc.div(fnum,snum));
			}
			else if(choice == 0) {
				System.out.println("Exit");
				isTrue=false;
			}
			else {
				System.out.println("Enter correct choice");
			}
		}
		
		
	}

}
