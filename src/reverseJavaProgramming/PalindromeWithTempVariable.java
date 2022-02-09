package reverseJavaProgramming;

import java.util.Scanner;

public class PalindromeWithTempVariable {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String s = sc.next();
		
		//char[] ch = s.toCharArray();
		String str = "";  //empty string
		
		for (int i = s.length() - 1; i >=0; i--) {
			str = str + s.charAt(i) ;  //charAt() is only used for String
		}
		
		if (s.equalsIgnoreCase(str)) {   //equals or equalsIgnoreCase mehtods are used to copare strings only
			System.out.println("palindrome "+str);
		}
		else {
			System.out.println("not a palindrome");
		}

	}

}
