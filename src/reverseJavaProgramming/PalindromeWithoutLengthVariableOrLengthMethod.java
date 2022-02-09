package reverseJavaProgramming;

import java.util.Scanner;

public class PalindromeWithoutLengthVariableOrLengthMethod {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		
		//String s = "Madam";
		//String s1 = s.toLowerCase();
		String s = sc.next().toLowerCase();
		char[] ch = s.toCharArray();
		
		int count = 0,x=0,count2=0;
		for (char c : ch) {	
			count++;
		}
		
		for (int i = count - 1; i>=0; i--) {
				if (s.charAt(x)==ch[i]) {
					count2++;
				}
				x++;
			}
		System.out.println(count);
		System.out.println(count2);
		
		if (count==count2) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not a palindrome");
		}
		}

	
}


