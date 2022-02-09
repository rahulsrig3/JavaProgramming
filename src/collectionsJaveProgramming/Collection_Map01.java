package collectionsJaveProgramming;

import java.util.HashMap;
import java.util.TreeMap;

public class Collection_Map01 {

	public static void main(String[] args) {
		
		/*
		HashMap map = new HashMap<Integer, String>();
		map.put(10, "rahul");
		map.put(20, "santosh");
		map.put(30, "sanjeeb");
		map.put(50, "priyanka");
		map.put(40, "bishwa");
		map.put(40, "kajal");  
		map.put(40, 100);
		map.put("name", "yellow");
		map.put(null, 100);
		map.put(null, null);
		System.out.println(map);  //insertion order is not maintained wrt key, we are using put method, multiple parameters
								// duplicate keys are not allowed(it will override the values), but duplicate values are allowed
							// values can be heterogeneous

		*/
		
		TreeMap map = new TreeMap<>();
		map.put('m', "ravi");
		map.put('o', "santosh");
		map.put('z', "naga");
		map.put('p', "suraj");
		map.put('a', "rahul"); 
		map.put('d', 10);
		//map.put(101, "uvw");  //ClassCastException: java.lang.Character cannot be cast to java.lang.Integer
		System.out.println(map);  //sorted order based on key(even alphabetical), 
		
	
	}

}
