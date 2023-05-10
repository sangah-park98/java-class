package k20230410;

import java.util.Arrays;
import java.util.Scanner;

public class FibonacchiTest2 {
	
	public static void main(String[] args) {
		
		int a=1, b=1, sum=2;

		Scanner s = new Scanner(System.in);
		System.out.print("수를 입력하세요: " );
		int n = s.nextInt(); //1항과 2항은 이미 계산된 상태이므로 3번째 항부터 n번째 항까지 합계만 구한다.
		
//		입력받은 피보나치 수열의 합계를 계산할 항의 개수만큼 배열을 만든다.
		int[] fibo = new int[n];
//		배열의 0번째, 1번째 인덱스 요소를 각각 1로 초기화시킨다.
		fibo[0] = 1;
		fibo[1] = 1;
		sum = 2; 
		
//		피보나치 수열의 각 항 값으로 배열을 채우고 피보나치 수열의 합계를 계산한다.
		for(int i=3; i<=n; i++) {
			fibo[i-1] = fibo[i-3] + fibo[i-2];
			sum += fibo[i-1];
		}
//		System.out.println(sum + ", " + Arrays.toString(fibo));
		
//		1)
		System.out.printf("피보나치 수열의 %d번째 항의 합: %d = ",n,sum);
		for(int i=0; i<fibo.length-1; i++) {
			System.out.print(fibo[i] + " + ");
		}
		System.out.println(fibo[fibo.length-1]);
		
//		2)
		System.out.printf("피보나치 수열의 %d번째 항의 합: %d = ",n,sum);
		for(int i=0; i<fibo.length; i++) {
			if(i>0) {
				System.out.print(" + ");
			}
			System.out.print(fibo[i]);
		}
		System.out.println();
	}
}
