package day13;

class Animal{
	
	void makeSound() {
		System.out.println("This animal makes a sound.");
	}
}
class Dog extends Animal{
	@Override
	void makeSound() {
		
		System.out.println("The Dog barks .");
	}
	
}
class Cat extends Dog{
@Override
void makeSound() {
	System.out.println("The Cat meows .");
}
}





public class inheritance {

	public static void main(String[] args) {
		Dog dog= new Dog();
		Cat cat = new Cat();
		dog.makeSound();
		cat.makeSound();
		
	}
	
}
