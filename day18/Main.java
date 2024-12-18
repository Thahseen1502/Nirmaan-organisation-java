package day18;

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
		System.out.println(obj.add(10, 40));
		System.out.println(obj.sub(10, 40));
		System.out.println(obj.div(10, 40));
		System.out.println(obj.mul(10, 40));
		}
		
	}

