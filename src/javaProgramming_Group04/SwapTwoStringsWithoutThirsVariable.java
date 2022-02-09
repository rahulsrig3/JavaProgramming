package javaProgramming_Group04;

public class SwapTwoStringsWithoutThirsVariable {

	public static void main(String[] args) {
		String s1 = "java";
		String s2 = "python";
		
		s1 = s1 + s2;  //javapython
		
		s2 = s1.substring(0, (s1.length() - s2.length())); //java
		s1 = s1.substring(s2.length()); //python
		
		System.out.println(s1);
		System.out.println(s2);	
		
		/*
		 //SUBSTRING METHODS:
		 string str = "Tester";
		 s.substring(0,3); //Tes
		 s.substring(0,5); //Teste
		 s.substring(3); //ter
		 s.substring(4,5) //e
		 */
		 
	}
}
