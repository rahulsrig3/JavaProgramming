package javaProgramming_Group03;

import java.util.Scanner;

public class PrintTheVowelsInTheGivenString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the stirng: ");
		String s = sc.next().toLowerCase();
		
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)=='a'|| s.charAt(i)=='e'|| s.charAt(i)=='i'|| 
					s.charAt(i)=='o'|| s.charAt(i)=='u') {
				System.out.print(s.charAt(i));
			}
		}
	}
}
