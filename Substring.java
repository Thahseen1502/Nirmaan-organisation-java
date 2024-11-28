package day5;
import java.util.Scanner;

public class Substring {
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter you name:");
		String name=scan.nextLine();
		System.out.println(name);
		System.out.println("Length:");
		System.out.println(name.length());
		System.out.println("Starting index:");
		System.out.println(name.substring(4));
		System.out.println("Start and end:");
		System.out.println(name.substring(0,8));
		System.out.println("CharAt:");
		System.out.println(name.charAt(11));
	}

}
