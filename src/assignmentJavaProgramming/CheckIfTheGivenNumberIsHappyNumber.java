package assignmentJavaProgramming;

public class CheckIfTheGivenNumberIsHappyNumber {
	
	public static void happyNumber(int num) {
		int rem = 0, sum = 0;
		while (num>0) {
			rem = num % 10;
			sum = sum + rem;
			num = num / 10;
		}
		if (sum > 9) {
			num = sum;
			happyNumber(num);
		}
		else {
			System.out.println("Happy number: "+sum);
		}
	}

	public static void main(String[] args) {
		int num = 678;
		happyNumber(num);
		
	}
}
