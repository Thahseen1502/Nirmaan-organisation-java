package day9;

public class Main {

	int a;
	int b;
	

	public static void main(String[] args){
		
		calculator calc = new calculator();
		calc.add(10,20);
		System.out.println(calc.sub(5, 10));
		System.out.println(calc.mul(5, 10));
		System.out.println(calc.div(5, 10));
		System.out.println(calc.mod(5, 10));
	}
	
}
