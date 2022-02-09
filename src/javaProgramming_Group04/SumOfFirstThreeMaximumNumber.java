package javaProgramming_Group04;

import java.util.Scanner;

public class SumOfFirstThreeMaximumNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		
		System.out.println("Enter the elements of array: ");	
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		int sum = 0;
		for (int i = 0; i < 3; i++) {
			sum = sum + arr[i];
		}
		System.out.println("Sum of first three maximum elements of array: "+sum);
	}

}
