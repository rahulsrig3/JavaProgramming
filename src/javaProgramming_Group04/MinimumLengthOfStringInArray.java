package javaProgramming_Group04;

import java.util.Scanner;

public class MinimumLengthOfStringInArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int size = sc.nextInt();
		String[] strArr = new String[size];
		System.out.println("Enter the string elements: ");
		for (int i = 0; i < size; i++) {
			strArr[i] = sc.next();
		}
		
		String minLength = strArr[1];
		for (int i = 1; i < strArr.length; i++) {
			if (minLength.length() > strArr[i].length()) {
				minLength = strArr[i];
			}
		}
		
		for (int i = 0; i < strArr.length; i++) {
			if (minLength.length() == strArr[i].length()) {
				System.out.println("Minimum length string in String Array: "+strArr[i]);
			}
		}
	}
}
