package reverseJavaProgramming;

import java.util.Scanner;

public class FibonacciNumberTill25IncludingDefaultNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the limit: ");
		int limit = sc.nextInt();
		int a = 0;
		int b = 1;
		
		System.out.println(a); 
		System.out.println(b);
		
		int temp = 0;
		
		for (int i = 0; i < limit; i++) {
			temp = a + b;
			if(temp<limit) {
				a = b;
				b = temp;
				System.out.println(b);
			}
			else {
				break;
			}
		}
	}

}
