package CodingTest;

import java.util.Scanner;

public class Cfourprogram {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("세 수 a,b,c를 입력하세요: ");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		int addSum = (a+b)%c;
		int sumSum = ((a%c) + (b%c))%c;
		int multiply = (a*b)%c;
		int multimulti = ((a%c) * (b%c))%c;
		
		System.out.println(addSum);
		System.out.println(sumSum);
		System.out.println(multiply);
		System.out.println(multimulti);
		
	}
}
