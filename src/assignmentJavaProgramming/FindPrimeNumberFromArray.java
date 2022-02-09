package assignmentJavaProgramming;

public class FindPrimeNumberFromArray {

	public static void main(String[] args) {
		int[] num = {3, 7, 8, 11, 16, 17, 23};
		
		for (int i = 0; i < num.length; i++) {
			int n = num[i];
			int a = 2;
			
			while (a <= num[i]) {
				if (num[i] % a == 0) {
					break;
				}
				else {
					a++;
				}
			}
			if (a == num[i]) {
				System.out.println("prime number: "+num[i]);
			}
			else {
				System.out.println("not a prime number: "+num[i]);
			}
		}
	}
}
