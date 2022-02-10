package javaProgramming_Group05;

public class AdditionOfElementsOfDifferentArrays {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,7,8,9};
		int b[] = {4,5,6,3};
		
		int count = a.length;
		if (a.length < b.length) {
			count = b.length;
		}
		
		for (int i = 0; i < count; i++) {
			try {		//try block will be executed 6 times
				System.out.print((a[i]+b[i])+" ");
			} catch (Exception e) {	//catch block will be executed 2 times
				if (a.length > b.length) {
					System.out.print(a[i]+" ");
				}
				else {
					System.out.print(b[i]+" ");
				}
			}
		}
	}
}
