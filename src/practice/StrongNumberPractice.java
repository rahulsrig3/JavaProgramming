package practice;

import java.util.Scanner;

public class StrongNumberPractice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int snum = sc.nextInt();
		
		int rem, sum = 0;
		int temp = snum;
		int fact;
		while(temp>0) {
			fact = 1;
			rem = temp % 10;//5
			while (rem>0) {
				fact = fact * rem;
				rem--;
			}
			sum = sum + fact;
			temp = temp / 10;
		}
		if (sum == snum) {
			System.out.println("StrongNumber");
		}
		else {
			System.out.println("not a StrongNumber: "+sum);
		}
	}	

}
