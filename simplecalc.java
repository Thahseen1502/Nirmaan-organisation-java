package day2;
import java.util.Scanner;

public class simplecalc {
	public static void main(String[]args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Addition = 0");
		System.out.println("Subtraction = 1");
		System.out.println("Multiplication = 2");
		System.out.println("Division = 3");
		System.out.println("Modulus = 4");
		
		System.out.println();
		System.out.println("Enter your Choice:");
		int choice=scan.nextInt();
	System.out.println("Enter firstnum:");
	int fnum=scan.nextInt();
	System.out.println("Enter secondnum:");
int snum = scan.nextInt();

//Else if statement  

//if(choice==0) {
//	int result=fnum+snum;
//	System.out.println("Total:"+result);
//}
//
//else if(choice==1 ) {
//	int result=fnum-snum;
//	System.out.println("Total:"+result);
//	}
//else if(choice==2) {
//	int result=fnum*snum;
//	System.out.println("Total:"+result);
//	}
//else if(choice==3) {
//	int result=fnum/snum;
//	System.out.println("Total:"+result);
//	}
//else if(choice==4) {
//	int result=fnum%snum;
//	System.out.println("Total:"+result);
//	}
//else {
//	System.out.println("Invalid choice");
//}}


//Switch case



switch (choice) {
case 0: {
	int result=fnum+snum;
System.out.println("Total:"+result);
	break;
}
case 1: {
	int result=fnum-snum;
System.out.println("Total:"+result);
break;
}
case 2: {
	long result=(long)fnum*snum;
System.out.println("Total:"+result);
break;
}
case 3: {
	int result=fnum/snum;
System.out.println("Total:"+result);
break;
}
case 4: {
	int result=fnum%snum;
System.out.println("Total:"+result);
break;
}
default:{
	System.out.println("Invalid choice");
}
}
	}

}
