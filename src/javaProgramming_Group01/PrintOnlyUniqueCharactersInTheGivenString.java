package javaProgramming_Group01;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class PrintOnlyUniqueCharactersInTheGivenString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String s = sc.next().toLowerCase();
		
		//store each character of string into set
		//HashSet<Character> set = new HashSet<Character>();
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for (int i = 0; i < s.length(); i++) {
			set.add(s.charAt(i));
		}
		
		//compare each character of the set to original string
		for (Character ch : set) {
			int count = 0;
			for (int i = 0; i < s.length(); i++) {
				if (ch == s.charAt(i)) {
					//if character is matching increment the count
					count++;
				}
			}
			//print only the unique characters
			if (count==1) {
				//System.out.println(ch+" "+count);
				System.out.print(ch);// output as heo
			}
		}
	}
}
