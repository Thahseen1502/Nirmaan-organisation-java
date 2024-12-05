package day10;

public class Main {
public static void main(String[] args) {
	
	Car def = new Car();
	def.displayCarDetils();
	
	Car single = new Car("BMW");
	single.displayCarDetils();
	
	Car two = new Car(2023,"TaTa");
	two.displayCarDetils();
}
}
