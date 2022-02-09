package javaProgramming_Group02;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class RemoveDuplicateWordsFromTheGivenString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String s = sc.nextLine().toLowerCase();
		String[] str = s.split(" ");
		
		//step 1: store each word of string into set collection
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		for (int i = 0; i < str.length; i++) {
			set.add(str[i]);
		}
		
		//step 2: print after removing duplicates
		for (String st : set) {
			System.out.print(st+" ");
		}
	}
}
