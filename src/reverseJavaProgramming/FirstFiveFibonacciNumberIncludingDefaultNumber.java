package reverseJavaProgramming;

public class FirstFiveFibonacciNumberIncludingDefaultNumber {

	public static void main(String[] args) {
		//output:- 0 1 1 2 3
		int a = 0;
		int b = 1;
		int temp = 0;
		System.out.println(a);
		System.out.println(b);
		
		for (int i = 0; i < 3; i++) {
			temp = a + b;
			a = b;
			b = temp;
			System.out.println(b);
		}

	}

}
