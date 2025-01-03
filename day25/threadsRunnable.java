package day25;

 class Animal{
	 
 }
class Ex1 extends Animal implements Runnable{
	public void run() {
	for(int i=0;i<=50;i++) {
		System.out.println("Ex1 :" + i);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
}

class Ex2 extends Animal implements Runnable{
	public void run() {
	for(int i=0;i<=50;i++) {
		System.out.println("Ex2 :" + i);
		try {
			Thread.sleep(800);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
}

public class threadsRunnable {
	
	public static void main(String[] args) {
		Ex1 ex1 = new Ex1();
		Ex2 ex2 = new Ex2();

		
		
		Thread T1 = new Thread(ex1);
		Thread T2 = new Thread(ex2);
		
		T1.start();
		T2.start();
	}
		
	
}
