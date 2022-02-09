package javaProgramming_Group03;

import java.util.LinkedHashSet;

public class PositionOfEachCharInTheGivenString {

	public static void main(String[] args) {
		String str = "Tester";
		str = str.toLowerCase();
		
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for (int i = 0; i < str.length(); i++) {
			set.add(str.charAt(i));
		}
		
		for (Character ch : set) {
			//find the position from the first index
			for (int i = 0; i < str.length(); i++) {
				if (ch == str.charAt(i)) {
					System.out.println(ch+" "+(i+1));
					break;
				}
			}
			/*
			//find the position from the last index
			for (int i = str.length()-1; i >= 0; i--) {
				if (ch == str.charAt(i)) {
					System.out.println(ch+" "+(i+1));
					break; //break takes you out of the loop
				}
			}   */
		}
	}
}
