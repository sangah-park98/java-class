package CodingTest;

import java.util.Scanner;

public class Ifcompare {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
			
		System.out.print("비교할 두 정수 a,b를 입력하세요: ");
		while(scanner.hasNext()) {
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
			if(a>b) {
				System.out.println(">");
			} else if(a<b) {
				System.out.println("<");
			} else {
				System.out.println("==");
			}
		}
	}
}
