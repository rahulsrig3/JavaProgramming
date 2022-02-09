package javaProgramming_Group03;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class PrintTheVowelsInTheGivenStringWithoutDuplicate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String s = sc.next().toLowerCase();
		
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		
		for (int i = 0; i < s.length(); i++) {
			set.add(s.charAt(i));
		}
		
		for (Character ch : set) {
			if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				System.out.print(ch);
			}	
		}	
	}
}
