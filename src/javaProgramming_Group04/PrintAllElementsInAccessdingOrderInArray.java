package javaProgramming_Group04;

import java.util.Scanner;

public class PrintAllElementsInAccessdingOrderInArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int size = sc.nextInt();
		
		int[] arr1 = new int[size];
		System.out.println("Enter the array elements: ");
		for (int i = 0; i < size; i++) {
			arr1[i] = sc.nextInt();
		}
			
		for (int i = 0; i < arr1.length; i++) {
			for (int j = i+1; j < arr1.length; j++) {
				if (arr1[i] > arr1[j]) {
					int temp = arr1[i];//use reference variable to store 
									   //greater number
					arr1[i] = arr1[j]; //swapping
					arr1[j] = temp;
				}
			}
		}
		
		for (int x : arr1) {
			System.out.println("Array in ascending order: "+x);
		}	
	}
}
