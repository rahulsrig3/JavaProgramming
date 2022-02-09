package javaProgramming_Group02;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class PrintOnlyDuplicateWordsInTheGivenString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String s = sc.nextLine().toLowerCase();
		String[] str = s.split(" ");
		
		//step 1: store each word of string in set
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		for (int i = 0; i < str.length; i++) {
			set.add(str[i]);
		}
		
		//step 2: compare each string of set to string array
		for (String st : set) {
			int count = 0;
			for (int i = 0; i < str.length; i++) {
				if (st.equals(str[i])) {
					//step 3: if each string element is matching, increment the count
					count++;
				}
			}
			//step 4: print only duplicate words from the given array
			if (count>1) {
				System.out.println(st+" "+count);
			}
		}
	}
}
