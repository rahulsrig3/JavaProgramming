package javaProgramming_Group01;

import java.util.HashSet;
import java.util.Scanner;

public class PrintOnlyDuplicateCharactersInTheGivenString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String s = sc.next().toLowerCase();
		
		//step 1: store each character of string into set
		HashSet<Character> set =  new HashSet<Character>();
		
		for (int i = 0; i < s.length(); i++) {
			set.add(s.charAt(i));
		}
		
		//compare each character of set to original string
		for (Character ch : set) {
			int count = 0;
			for (int i = 0; i < s.length(); i++) {
				if (ch == s.charAt(i)) {
					//if each character is matching, increment the count
					count++;	
				}
			}
			//print only the duplicate characters and count
			if (count>1) {
				System.out.println(ch+" "+count);
			}
		}
	}
}
