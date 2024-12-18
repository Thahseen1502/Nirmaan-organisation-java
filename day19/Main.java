package day19;

import java.util.Scanner;

public class Main implements IEx2 {

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public int sub(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}
	@Override
	public int div(int a, int b) {
		// TODO Auto-generated method stub
		return a/b;
	}
	@Override
	public int mul(int a, int b) {
		// TODO Auto-generated method stub
		return a*b;
	}

	

	public static void main(String[] args) {
		Main obj = new Main();
		Scanner scan = new Scanner (System.in);
		try {
		System.out.println("Enter 1st value:");
		int a = scan.nextInt();
		System.out.println("Enter 2nd value:");
		int b = scan.nextInt();
		
		System.out.println(obj.add(a, b));
		System.out.println(obj.sub(a, b));
		try {
			System.out.println(obj.div(a, b));
		}catch (Exception e ){
			System.out.println(e);
		}
		System.out.println(obj.mul(a, b));
		}catch(Exception n) {
			System.out.println(n);
		}
	}
}
