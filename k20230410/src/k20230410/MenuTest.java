package k20230410;

import java.util.Scanner;

public class MenuTest {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int menuNum;
		while(true) { //무한루프 => 무한루프를 탈출할 수 있는 조건과 break를 이용해서 탈출할 수 있어야 한다.
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
				/*
			case 5: 
				System.out.println("종료>");
//				프로그램 강제 종료
				System.exit(0);
				break;
				*/
			}
			if(menuNum==5) {
				break;
			}
		}
		System.out.println("종료>");
	

	
	}
}	
