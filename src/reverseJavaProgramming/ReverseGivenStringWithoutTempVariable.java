package reverseJavaProgramming;

public class ReverseGivenStringWithoutTempVariable {

	public static void main(String[] args) {
		
		String s = "testing";
		
		for (int i = s.length()-1; i>=0; i--) {
			System.out.print(s.charAt(i));
		}
		
//		int a =10;
//		int b = 20;
//		a = a + b;	//30
//		b = a - b;	//30 - 20 //10
//		a = a - b;	//30 - 10 //20
//		System.out.println(a+" "+b);
		
	}
}
