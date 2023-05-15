package CodingTest;

import java.util.Scanner;

public class Cbulgiyear {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("현재 년도로 바꿀 불기 연도를 입력하세요: ");
		int bulgiYear = scanner.nextInt();
		int addYear = bulgiYear - 543;
		
		System.out.println(addYear);
	}
}
