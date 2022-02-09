package javaProgramming_Group02;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class NumberOfOccuranceOfEachWordInTheGivenString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String s = sc.nextLine().toLowerCase();
		String[] str = s.split(" "); //space is also a special character
		
		//step 1: store each word of string in set
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		for (int i = 0; i < str.length; i++) {
			set.add(str[i]);
		}
		
		//step 2: compare each string of set to string array
		for (String st : set) { //
			int count = 0;
			for (int i = 0; i < str.length; i++) {
				if (st.equalsIgnoreCase(str[i])) { //taking one word from set
								//and comparing with all elements of string array
					//step 3: if each string element is matching, increment the count
					count++;
				}
			}
			//step 4: print both string and count
			System.out.println(st+" "+count);
		}
		
		
		//split() will take input in form of string, 
		//when we call split, it will dynamically create a new array
		

	}

}
