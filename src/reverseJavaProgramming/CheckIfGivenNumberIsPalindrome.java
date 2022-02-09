package reverseJavaProgramming;

public class CheckIfGivenNumberIsPalindrome {

	public static void main(String[] args) {
		
		int num = 23432;
		int temp = num;
		int rem = 0;
		int sum = 0;
		while (temp>0) {
			
			rem = temp % 10;
			sum = (sum *10) + rem;
			temp = temp / 10;
		}
		
		if (sum==num) {
			System.out.println("palindrome");
		}	
		}
}
