package day23;

import java.util.Scanner;

public class OddEcvenCount {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a numer: ");
		int num = scan.nextInt();
		int sum=0;
		int Esum=0;
		int Even_count=0;
			int odd_count=	0;
			for(int i=1;i<=num;i++) {
				if(i%2==0) {
					Even_count+=1;
					Esum+=i;
					
				}
				else
				{
					odd_count+=1;
					sum+=i;
					
				}
			
			}
			System.out.println("Odd Count & sum");
			System.out.println(odd_count);
			System.out.println(sum);
			System.out.println("Even Count & sum");
			System.out.println(Even_count);
			System.out.println(Esum);
		
			
//		int count=	0;
//		int sum = 0;
//		for(int i=1;i<=100;i++) {
//			if(i%2!=0) {
//				count++;
//				sum += i;
//			}
//		}
//		System.out.println("count" + count);
//		System.out.println("sum" +sum);

		
	}
}
