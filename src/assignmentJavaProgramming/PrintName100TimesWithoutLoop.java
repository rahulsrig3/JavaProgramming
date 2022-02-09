package assignmentJavaProgramming;

public class PrintName100TimesWithoutLoop {
	
	/*public static void namePrint(int i) {
		System.out.println("Rahul");
		print(i + 1);
	} */
	
	public static void print(int i) {
		if(i<100) 
		{
			System.out.println("Rahul");
			print(i + 1);
			//namePrint(i);
		}
	}

	public static void main(String[] args) {
		
		print(0);
		
	}
}
