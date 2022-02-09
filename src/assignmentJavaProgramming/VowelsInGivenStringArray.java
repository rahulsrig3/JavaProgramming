package assignmentJavaProgramming;

public class VowelsInGivenStringArray {

	public static void main(String[] args) {
		
		String[] str = {"apple", "banana"};
		for (String st : str) {
			int count=0;
			for (int i = 0; i < st.length(); i++) {
				if (st.charAt(i)=='a' || st.charAt(i)=='e' || st.charAt(i)=='i' || 
						st.charAt(i)=='o' || st.charAt(i)=='u') {
					count++;
				}
			}
			System.out.println(st+": "+count);
		}
	}
}
