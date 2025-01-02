package day24;
import java.util.HashSet;
public class ManagementHashSet {

	public static void main(String[] args) {
		BookHashset b1 = new BookHashset(1,"Nirmaan","Thahseen",1000,5);
		BookHashset b2 = new BookHashset(2,"Infosys","Fathima",1000,2);
		HashSet<BookHashset> hs = new HashSet<BookHashset>();
		hs.add(b1);
		hs.add(b2);
		
		
		System.out.println(hs);
		System.out.println(b1.equals(b2));
	}
}
