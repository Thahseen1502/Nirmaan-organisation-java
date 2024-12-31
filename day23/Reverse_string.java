package day23;

public class Reverse_string {
	public static void main(String[] args) {
		
		//Reverse a String
		
		String name="Thahseen";
		String name_rev="";
		
		for(int i=name.length()-1;i>=0;i--) {
			//System.out.print(name.charAt(i));
		name_rev+=name.charAt(i);
		}
		System.out.println(name_rev);
		
		
	
		
	}

}
