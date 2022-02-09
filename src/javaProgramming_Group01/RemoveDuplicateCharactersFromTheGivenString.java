package javaProgramming_Group01;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class RemoveDuplicateCharactersFromTheGivenString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String s = sc.next().toLowerCase();
		
		//store each character of string into set
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for (int i = 0; i < s.length(); i++) {
			set.add(s.charAt(i));
		}
		
		//print each character of set
		for (Character ch : set) {
			System.out.print(ch);  //output : helo
		}
	}

}
