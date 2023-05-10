package k20230410;

import java.util.Scanner;

public class FibonacchiTest {
	
	public static void main(String[] args) {
		
		int a=1, b=1, sum=2;
//		a = 1번째 항의 값 초기화, n-2번째 항
//		b = 2번째 항의 값 초기화, n-1번째 항
		Scanner s = new Scanner(System.in);
		System.out.print("수를 입력하세요: " );
		int n = s.nextInt(); //1항과 2항은 이미 계산된 상태이므로 3번째 항부터 n번째 항까지 합계만 구한다.
		
		for(int i=3; i<=n; i++) {
			int c = a+b;
			a=b;
			b=c;
			sum+= c;
		}
		System.out.println("피보나치 수열의 " + n + "번째 항의 합 = " + sum);
	}
}
