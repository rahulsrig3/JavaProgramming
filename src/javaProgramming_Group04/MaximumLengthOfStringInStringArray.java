package javaProgramming_Group04;

import java.util.Scanner;

public class MaximumLengthOfStringInStringArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int size = sc.nextInt();
		String[] strArr = new String[size];
		System.out.println("Enter the string values in string array: ");
		for (int i = 0; i < size; i++) {
			strArr[i] = sc.next();
		}
		
		String maxElement = strArr[0];
		for (int i = 0; i < strArr.length; i++) {
			if (maxElement.length() < strArr[i].length()) {
				maxElement = strArr[i];
			}
		}
		
		for (int i = 0; i < strArr.length; i++) {
			if (maxElement.length() == strArr[i].length()) {
				System.out.println("Maximum length string in String array: "+strArr[i]);
			}
		}
	}
}
