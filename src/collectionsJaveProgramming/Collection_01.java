package collectionsJaveProgramming;

import java.util.ArrayList;
import java.util.LinkedList;

public class Collection_01 {

	public static void main(String[] args) {
		
		//ArrayList  (for searching array list is faster than linked list)
		
		ArrayList list = new ArrayList<>();
		list.add(30);
		list.add(90);
		list.add(20);
		list.add("SDET");
		list.add(null);
		list.add(90);
		list.add(20);
		list.add(null);
		list.add(10);
		
		System.out.println(list); //insertion order is maintained, duplicates are allowed
								  // it is heterogeneous, 
								  //more than one null is allowed(because it allows duplicate)
		
		ArrayList list1 = new ArrayList<>(list);		// passing previous reference as collection here
		System.out.println(list1);
		
		new ArrayList<>(12);
		
		
		//LinkedList   (
		
		new LinkedList<>();      // same as ArrayList
	
	}
	
}
