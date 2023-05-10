package k20230410;

public class StarTest {

	public static void main(String[] args) {

//		*
//		**
//		***
//		****
//		*****

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("---------");
//		*****
//		****
//		***
//		**
//		*

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= 4 - i; j++) { // for(int j=i; j<5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("---------");

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= 3 - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("---------");

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i - 1; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= 4 - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("---------");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			for (int j = 0; j < 7 - i * 2; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				if(j!=4) {
				System.out.print("*");
				}
			}
			System.out.println();
		}
		
		System.out.println("----------");
		
		for (int i = 0; i < 5; i++) {
			for (int j = 5-i-1; j<0; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
