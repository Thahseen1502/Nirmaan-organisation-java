package day20;

class cal{
	void div(int a , int b)throws Exception{
		System.out.println("Divide"+a/b);
	}
}


public class ExceptionThrows {
	public static void main(String[] args) {
		cal c = new cal();
		try {
			c.div(10, 0);
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
