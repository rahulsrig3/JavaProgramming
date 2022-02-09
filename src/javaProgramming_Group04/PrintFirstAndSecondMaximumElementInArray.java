package javaProgramming_Group04;

import java.util.Scanner;

public class PrintFirstAndSecondMaximumElementInArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int size = sc.nextInt();

		int[] arr = new int[size];
		System.out.println("Enter the elements of array: ");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();		
		}
		
		for (int i = 0; i < size; i++) {
			for (int j = i+1; j < size; j++) {
				if (arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("First maximum element from the Array: "+arr[0]);
		System.out.println("Second maximum element from the Array: "+arr[1]);
	}
}
