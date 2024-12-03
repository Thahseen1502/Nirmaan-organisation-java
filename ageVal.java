package day7;
import java.util.Scanner;

public class ageVal {

	
	
	    void agevalidate(int age) {
	    	if(age>=18) {
	    		System.out.println("Adult");
	    	}
	    	else{
	    		System.out.println("teenage");
	    	}
	    }
	    public static void main(String[] args) {
	    	ageVal age = new ageVal();
	    	Scanner sc = new Scanner(System.in);
	    	System.out.println("Enter your age: ");
	    	int UserAge = sc.nextInt();
	    	age.agevalidate(UserAge);
	    }
	    
	}
	

