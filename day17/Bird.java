package day17;

public class Bird  implements IAnimal{

	
@Override
	
	public void move() {
		
		System.out.println("The bird flies in the sky");
	}
	
	public void speak() {
		System.out.println("The bird says: Chirp Chirp!");
	}
	
public static void main(String[] args) {
		
		Dog dog = new Dog();
		Bird bird = new Bird();
		dog.speak();
		dog.move();
		bird.speak();
		bird.move();
		
		System.out.println(IAnimal.isMammal("dog"));
		System.out.println(IAnimal.Category);
		
		
		
	}
	
	
}
