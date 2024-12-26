package day20;

public class Recursive {

	int num = 0;
	void ex() {
		
		num +=1;
		System.out.println(num);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			
			e.printStackTrace();
		}
		ex();
		
	}
	public static void main(String[] args) {
		Recursive e = new Recursive();
	e.ex();	
	}
}
