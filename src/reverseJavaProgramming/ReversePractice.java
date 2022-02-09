package reverseJavaProgramming;

public class ReversePractice {

	/*
	public static void main(String[] args) {
		
		String s = "test";
		
		for (int i = s.length()-1; i >= 0; i--) {  //we are using length method because there is a length mehtod on string class
												   //if we dont do s.length()-1, then we get 
			System.out.print(s.charAt(i));
		}  */
		
		
		//without using length mehthod (using for-each loop)
		public static void main(String[] args) {
			
			String strng = "testing";
			char[] s = strng.toCharArray();
			int count = 0;
			for (char c : s) {		// how does for-each work 
									// only for array or collection we can go for for-each loop
				count++;
			}
			System.out.println(count);
			
			for (int i = count-1; i>=0 ; i--) {
				System.out.print(s[i]);
			}
			
			/*
			public static void main(String[] args) {
				String s = "testing";
				for (int i = 0; i < s.length(); ) {
					System.out.println(s.charAt(i)); //first condition = infinite loop printing 't'
				}
			}
			*/
	
			/*
			//run the for loop without condition
			public static void main(String[] args) {
				String s = "testing";
				for (int i = 0; ; i++) {
					System.out.println(s.charAt(i));
					//by default it will take it as true, it will print all the characters
					//of the string and 
					//then will throw exception java.lang.StringIndexOutOfBoundsException
				}
			}
			*/
	
		}

	
}

