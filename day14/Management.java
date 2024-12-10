package day14;
import java .util.Scanner;
public class Management {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Employee emp=new Employee(100,"Thahseen",9876543210l,"MCA");
		
		boolean isTrue = true;
		int choice;
		while(isTrue) {
			System.out.println("Select an option:");
			System.out.println("1. Add Employee Details");
			System.out.println("2. Update Employee Details");
			System.out.println("3. Show Employee Details");
			System.out.println("4. Update single  Employee Detail");
			System.out.println("0. Exit");
			System.out.println();
			
			System.out.println("Enter your choice:");
			choice = scan.nextInt();
			
			
			switch(choice) {
			case 1:{
				
				System.out.println("Enter Employee id: ");
				int id = scan.nextInt();
				scan.nextLine();
				System.out.println("Enter Employee Name:");
				String name= scan.nextLine();
				
				System.out.println("Enter Phone number:");
				long phno =scan.nextLong();
				scan.nextLine();
				System.out.println("Enetr Department:");
				String dept = scan.nextLine();
				
//				emp.setId(id);
//				emp.setName(name);
//				emp.setPhno(phno);
//				emp.setDept(dept);
				emp = new Employee(id,name,phno,dept);
				System.out.println("Successfully Added Employee Details");
			System.out.println();
				break;	
			}
			case 2:{
				
				System.out.println("Enter Employee id: ");
				int id = scan.nextInt();
				scan.nextLine();
				System.out.println("Enter Employee Name:");
				String name= scan.nextLine();
				
				System.out.println("Enter Phone number:");
				long phno =scan.nextLong();
				scan.nextLine();
				System.out.println("Enetr Department:");
				String dept = scan.nextLine();
				
				emp.setId(id);
				emp.setName(name);
				emp.setPhno(phno);
				emp.setDept(dept);
				
				System.out.println("Successfully Updated Employee Details");
			System.out.println();
				break;	
			}
			
			case 3:{
				System.out.println(emp.toString());
				System.out.println();
				break;
			}
			case 0:{
				System.out.println("Thank you , You Logged out");
				isTrue=false;
				break;
			}
			case 4:{
				while(isTrue) {
				 System.out.println("Select the field to update:");
				    System.out.println("1. Update Employee ID");
				    System.out.println("2. Update Employee Name");
				    System.out.println("1. Update Employee phno");
				    System.out.println("2. Update Employee Department");
				    System.out.println("0. Go Back");
				    System.out.println();
				    
				    int updateChoice = scan.nextInt();
				    scan.nextLine(); 
				    boolean isUpdateMode = true; 
				    switch(updateChoice) {
				        case 1: {
				            System.out.println("Enter new Employee ID: ");
				            int newId = scan.nextInt();
				            scan.nextLine();
				            emp.setId(newId); 
				            System.out.println("Employee ID successfully updated.");
				            break;
				        }
				        case 2: {
				            System.out.println("Enter new Employee Name: ");
				            String newName = scan.nextLine();
				            emp.setName(newName);  
				            System.out.println("Employee Name successfully updated.");
				            break;
				        }
				        case 3: {
				            System.out.println("Enter new Employee Phno: ");
				            int newphno = scan.nextInt();
				            scan.nextLine();
				            emp.setPhno(newphno); 
				            System.out.println("Employee phno successfully updated.");
				            break;
				        }
				        case 4: {
				            System.out.println("Enter new Employee Department: ");
				            String newdept = scan.nextLine();
				            emp.setDept(newdept);  
				            System.out.println("Employee Department successfully updated.");
				            break;
				        }
				        case 0: {
				            System.out.println("Main Menu");
				            isUpdateMode=false;
				        	
				        	break;
				        	
				        }
				       default:{
				    	   System.out.println("Enter correct option");
				       }
				       
				    }
				}	
				break;
			}
			default:{
				System.out.println("Enter correct choice");
			}
			}
		}
		
	}
	
}
