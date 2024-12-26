package day20;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionalHandling {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	try {
		System.out.println("Enter your age:");
		int age = scan.nextInt();
		
		if(age>0) {
			System.out.println("Your age is "+age);
		}else {
			throw new ArithmeticException();
		}
		
	}
	catch(InputMismatchException e) {
		System.out.println("Enter a number");
	}
	catch(Exception e) {
		System.out.println(e);
	}
	
	
	finally {
		System.out.println(" Final Done");
	}
}
	

	
}
