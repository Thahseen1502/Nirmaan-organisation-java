package day12;
import java.util.Scanner;
public class SingleBookManagement {

	public static void main(String[] args) {
		
		
		Book series = new Book("Rich Dad Poor Dad","Robert Kiyosaki, Sharon Lechter",500,2);
		Scanner scan = new Scanner(System.in);
		boolean isTrue = true;
		
		int choice;
		while(isTrue) {
			System.out.println("Select an option:");
			System.out.println("1. Add/Update Book Details");
			System.out.println("2. Show Book Details");
			System.out.println("0. Exit");
			System.out.println();
			
			System.out.println("Enter your choice:");
			choice = scan.nextInt();
			scan.nextLine();
			
			switch(choice) {
			case 1:{
				System.out.println("Enter Book Title: ");
				String title = scan.nextLine();
				System.out.println("Enter Book Author:");
				String author= scan.nextLine();
				System.out.println("Enter Price:");
				double price=scan.nextDouble();
				System.out.println("Enetr Number of Copies:");
				int noOfCopies = scan.nextInt();
				
				
				series.setTitle(title);
				series.setAuthor(author);
				series.setPrice(price);
				series.setNoOfCopies(noOfCopies);
				
				System.out.println("Your Details Updated Succssfully.");
				System.out.println();
				
				break;
				
			}
			case 2:{
				System.out.println(series.toString());
			
				break;
			}
			case 0:{
				System.out.println("Program Exit .");
				isTrue=false;
				break;		
			}
			default:{
				System.out.println("Enter the correct choice.");
			}
			}
			
		}
		
	}
	
}
