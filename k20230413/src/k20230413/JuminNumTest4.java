package k20230413;

import java.util.Scanner;

public class JuminNumTest4 {
	public static void main(String[] args) {
//		8304221185600 => 아기공룡 둘리 주민등록번호

		Scanner scanner = new Scanner(System.in);
		System.out.print("주민등록번호 13자리를 '-'없이 입력하세요: ");
		String jumin = scanner.nextLine().trim();
		
//		주민번호 각 자리 숫자에 가중치를 곱한 합계를 계산한다.
		String check = "2345678923435"; //가중치
		int sum = 0;
		for(int i=0; i<12; i++) {
			sum += (jumin.charAt(i) - '0') * (check.charAt(i) - '0'); //문자0이 코드값 48
			//'0'해줘야 숫자로 변환 가능
			/*
		 sum += Integer.parseInt(jumin.charAt(i) + "") * Integer.parseInt(check.charAt(i) + "");
			 */
		}
		System.out.println(sum);
		
//		주민등록번호의 각 자리 숫자와 가중치를 곱한 합계를 11로 나눈 나머지를 11에서 뺀다.
//		뺀 결과가 10 이상이면 10의 자리는 버리고 1의 자리만 취한다.
		int result = (11 - sum % 11) % 10;
		
//		위 식의 결과를 주민등록번호 마지막 자리와 비교해서 같으면 정상, 그렇지 않으면 오류
		if(result == jumin.charAt(12) -'0') {
			System.out.println("정상");
		} else {
			System.out.println("오류");
		}
	}
}