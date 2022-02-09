package assignmentJavaProgramming;

import java.util.LinkedHashSet;

public class VowelsInGivenStringArrayWithoutDuplicates {

	public static void main(String[] args) {
		String[] str = {"Apple", "bAnana"};
		
		for (int i = 0; i < str.length; i++) {
			LinkedHashSet<Character> set = new LinkedHashSet<Character>();

			for (int j = 0; j < str[i].length(); j++) {
				set.add(str[i].toLowerCase().charAt(j));
			}
			int count=0;
			for (Character ch : set) {
				
				if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
					count++;
				}
			}
			System.out.println(str[i]+": "+count);
		}	
	}
}
