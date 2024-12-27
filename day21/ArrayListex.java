package day21;
import java .util.ArrayList;
import java.util.Collections;
import java.util.Comparator; 
public class ArrayListex {
public static void main(String[] args) {
	
	ArrayList list = new ArrayList();
	list.add(10);
	list.add(20);
	list.add(90);
	list.add(40);
	list.add(50);
	list.add("Thahseen");
	list.addFirst(1000);
	System.out.println("Original list : "+list);
	System.out.println("Remove :"+list.remove("Thahseen"));
	System.out.println(list);
	System.out.println("Contains :"+list.contains(60));
	System.out.println("Remove data without index value: "+list.remove(Integer.valueOf(10)));
	System.out.println("REmove data using index value: "+list.remove(3));
	System.out.println("List :"+list);
	
	
	ArrayList<Integer>list2=new ArrayList<Integer>();
	list2.add(100);
	list2.add(200);
	list2.add(300);
	list2.add(400);
	list2.add(500);
	System.out.println("Original list : "+list2);
	list.addAll(list2);
	System.out.println(list);
	Collections.sort(list);//Ascending order
	System.out.println("Ascending order:"+list);
	Collections.sort(list, Comparator.reverseOrder());//Descending order
	System.out.println("Descending order: "+list);

	Object [] arr = list2.toArray();
	System.out.println(arr);
	for(Object a:arr) {
		System.out.println(a);
	}

	System.out.println();
	Integer[]arr1 =new Integer[list2.size()];
	list2.toArray(arr1);
	System.out.println(arr1[0]);
}
}
