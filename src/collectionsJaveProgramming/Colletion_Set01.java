package collectionsJaveProgramming;

import java.util.HashSet;
import java.util.TreeSet;

public class Colletion_Set01 {

	public static void main(String[] args) {
		
		HashSet set = new HashSet<>();         // {((3/2) * current capacity) + 1}, this is new memory which is going to be created in teh heap area
		set.add(20);
		set.add(40);
		set.add(80);
		set.add(30);
		set.add("Nobita");
		set.add(null);
		set.add(15);
		set.add(80);
		set.add(70);
		System.out.println(set);   //insertion order is not maintained, duplicated are not
								   //allowed(during compile time we can add it, but during runtime
								   //it will throw runtime error
								   // only one null is allowed(because duplicated are not allowed
								   // heterogeneous elements are allowed
		
		//new HashSet<>(c);
		
		//new HashSet<>(initialCapacity);
		
		//new HashSet<>(initialCapacity, loadFactor);
		
		//TREE SET
		
		TreeSet set1 = new TreeSet<>();		// in interview, check if the files are imported
		set1.add(20);
		set1.add(10);
		set1.add(80);
		set1.add(70);
		set1.add(30);
		
		try {
		set1.add("tyss");  //ClassCastException: java.lang.Integer cannot be cast to java.lang.String, no heterogeneous insertion
		set1.add(40);    //
		}
		catch(Exception e) {
			set1.add(50);  //
		}
		
		//set1.add(null);   //java.lang.NullPointerException
		System.out.println(set1);  //get element in sorted accending order
		System.out.println(set1.descendingSet()); // method to sort in descending order
		
		
		
	}

}
