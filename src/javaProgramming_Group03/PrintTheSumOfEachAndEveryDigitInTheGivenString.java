package javaProgramming_Group03;

import java.util.Scanner;

public class PrintTheSumOfEachAndEveryDigitInTheGivenString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String s = sc.next();
		int sum = 0;
		
		for (int i = 0; i < s.length(); i++) {
			if ((s.charAt(i)>='0' && s.charAt(i)<='9')) {
				int n = s.charAt(i) - 48;
				sum = sum + n;
			}
		}
		System.out.println("Sum of all digits in string is: "+sum);
	}
}
