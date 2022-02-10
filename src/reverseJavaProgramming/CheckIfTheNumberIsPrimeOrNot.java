package reverseJavaProgramming;

public class CheckIfTheNumberIsPrimeOrNot {

	public static void main(String[] args) {
		
		int num = 23;
		int i=2;
		while (i<=num) {
			if (num%i==0) {
				break;
			}
			else{
				i++;
			}
		}
		
		if (num==i) {
			System.out.println("prime number");
		}
		else {
			System.out.println("not a prime number");
		}
		
		
		/*
		//Another way using count
		
		int num = 13;
		int count = 0;
		
		for (int i = 2; i < num-1; i++) {
			if (num%i==0) {
				count++;
			}
		}
		
		if(count==0)
		{
			System.out.println("prime number");
		}
		else
		{
			System.out.println("not a prime number");
		}  */	
	}
}
