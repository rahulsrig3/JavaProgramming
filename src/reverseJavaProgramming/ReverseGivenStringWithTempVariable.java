package reverseJavaProgramming;

public class ReverseGivenStringWithTempVariable {

	public static void main(String[] args) {
		
		String s = "tyss";
		String rev = "";  // do not put space
		for (int i = s.length() - 1; i >= 0; i--)
		{	//i=3,2,1,0 -1>=0
			rev = rev + s.charAt(i); //"",s,s+s,ss+y,ssy+t
			//rev = s.charAt(i) + rev;
			//rev = s.charAt(i); //error because we cannot print char from string directly
		}
		
		System.out.println(rev);

	}

}
