package k20230410;

import java.util.Scanner;

public class MenuTest2 {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int menuNum = 0;
		while(menuNum != 5) { 
			do {
				System.out.println("----------------------------------------------------");
				System.out.println("1. 입력 | 2. 목록보기 | 3. 수정 | 4. 삭제 | 5. 종료 ");
				System.out.println("----------------------------------------------------");
				System.out.print("원하는 메뉴를 입력하세요: ");
				menuNum = s.nextInt();
			} while(menuNum <1 || menuNum >5);
			
//		여기까지 왔다면 menuNum에 1~5 사이의 정수가 입력되었다는 것을 의미한다.
			switch (menuNum) {
			case 1: 
				System.out.println("입력> ");
				break;
			case 2: 
				System.out.println("목록보기> ");
				break;
			case 3: 
				System.out.println("수정> ");
				break;
			case 4: 
				System.out.println("삭제> ");
				break;
			}
		}
		System.out.println("종료>");
	
	}
}	
