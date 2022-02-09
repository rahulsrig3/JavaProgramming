package javaProgramming_Group01;

import java.util.HashSet;
import java.util.TreeSet;

public class OccuranceOfEachCharacterInTheGivenString {

	public static void main(String[] args) {
		
		String str = "HelloBrother";
		String s = str.toLowerCase();
		
		char[] ch = s.toCharArray();
		
		TreeSet set = new TreeSet<>();
		
		for (int i = 0; i < ch.length; i++) 
		{
			int count = 0;
			for (int j = 0; j < ch.length; j++) 
			{
				if(ch[i]==ch[j])
				{
					count++;
				}	
			}
			String st = "number of times "+ch[i]+" occurs is "+count+"\n";
			set.add(st);
			//System.out.println("number of times "+ch[i]+" occurs is "+count);
		}
		
			System.out.println(set);
		
	}
}
