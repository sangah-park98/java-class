package CodingTest;

import java.util.Scanner;

public class Gugudan {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("출력할 단을 입력하세요.");
		int N = sc.nextInt();
		
		
		for(int i=1; i<=9; i++) {
			System.out.println(N + "*" + i);
		}
	}
}
