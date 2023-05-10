package k20230413;

import java.util.Scanner;

public class BusinessNumber {
	
	public static void main(String[] args) {
//		네이버 사업자 등록번호 : 2208162517
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("사업자 등록번호 10자리를 '-'없이 입력하세요: ");
		String bsNum = scanner.nextLine().trim();
		
		String check = "137137135";
		int sum = 0;
//		사업자등록번호의 9번째 자리까지 각 자리의 숫자와 가중치를 곱한 결과의 1자리 합계를 계산한다.
		
		for(int i=0; i<9; i++) {
			sum += Integer.parseInt(bsNum.charAt(i) +"")* Integer.parseInt(check.charAt(i) +"")%10;  
														//(i<8 ? i+2 : i-6);
		}
//		사업자 등록번호의 9번째 자리에 가중치를 곱한 결과의 10의 자리를 더한다.
		sum += Integer.parseInt(bsNum.charAt(8) + "") * Integer.parseInt(check.charAt(8) +"")/10;
		System.out.println(sum);

//		사업자 등록번호의 가중치와 9번째 자리까지 연산 결과에 사업자등록번호의 10번째
//		자리의 숫자를 더한다.
		sum += bsNum.charAt(9) -48;
		
//		최종 결과가 10의 배수면 정상, 그렇지 않으면 오류
		System.out.println(sum %10==0 ? "정상" : "오류");
	}
}
