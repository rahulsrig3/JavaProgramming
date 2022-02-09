package javaProgramming_Group03;

import java.util.Scanner;

public class ProgramToSegregateAlphabetsAndSpecialCharAndNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String s = sc.next();
		
		String alpha = "";        //ASCII VALUE: (a = 97,z = 122)
		String num = "";			// (A = 65, Z = 90)
		String spec = "";			//(0 = 48, 9 = 57)
		
		for (int i = 0; i < s.length(); i++) {
			if ((s.charAt(i)>='A' && s.charAt(i)<='Z')||
					(s.charAt(i)>='a' && s.charAt(i)<='z')) {
				
				alpha = alpha + s.charAt(i);
				//System.out.println("Alphabetical values: "+s.charAt(i));
			}
			else if ((s.charAt(i)>='0' && s.charAt(i)<='9')) {
				num = num + s.charAt(i);
				//System.out.println("Numberical values: "+s.charAt(i));
			}
			else {
				spec = spec + s.charAt(i);
				//System.out.println("special characters: "+s.charAt(i));
			}
		}
		System.out.println("Alphabetical values: "+alpha);
		System.out.println("Numerical values: "+num);
		System.out.println("Special characters: "+spec);
	}
}
