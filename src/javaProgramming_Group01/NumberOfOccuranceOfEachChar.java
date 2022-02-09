package javaProgramming_Group01;

import java.util.HashSet;

public class NumberOfOccuranceOfEachChar {

	public static void main(String[] args) {

		String s = "hello";
		//step 1: store each character of string into set
		HashSet<Character> set = new HashSet<Character>();
		for (int i = 0; i < s.length(); i++) {
			set.add(s.charAt(i));  //to add the string element in the
								   //set and converting into character
		}
		
		//step 2: compare each character of set to original string
		for (Character ch : set) { //set is going to take the reference of hashset
								// and ch is going to hold one character in every iteration
								// character is a wrapper class/generic type(inbuilt class we have in java.util.package
								// if nothing is there,then it will consider it as object
			int count = 0;
			for (int i = 0; i < s.length(); i++) {
				if (ch == s.charAt(i)) {
					//step 3: if each character is matching, increment the count
					count++;
				}
			}
			//step 4: print both character and count
			System.out.println(ch+" "+count);
		}
		
		
		// h=1, e =1, l=2, o=1
		//l=2
		//h=1, e=1, o=1 (heo) //unique characters 
		//remove duplicates: helo
		//

	}

}
