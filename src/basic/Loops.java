package basic;

public class Loops {

	public static void main(String[] args) {
//		System.out.println("1");
//		System.out.println("2");
//		System.out.println("3");
//		System.out.println("4");
//		System.out.println("5");  This is not a good way to print 1-5
		
		int a = 1;   // Initialization 
		while(a<=5) {  // condition
			System.out.println(a);
			a = a+1;   // Increment 
//			a++;
		}
		System.out.println();
		for (int i = 5; i >=1; i--) {
			System.out.println(i);
		}
	}

}
