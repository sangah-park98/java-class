package k20230407;

import java.util.Random;
import java.util.Scanner;

public class LottoTest {
	
	public static void main(String[] args) {
		
//		추첨기를 만든다
//		추첨기에 공을 넣는다
//		섞는다
//		1등 번호를 출력한다.
		
		int[] lotto = new int[45];
		
		for(int i=0; i<lotto.length; i++) {
			lotto[i] = i+1;
		}
		
		for(int i=0; i<lotto.length; i++) {
			if ((i + 1) % 13 == 0) {
				System.out.println();
			}
		}
		System.out.println("---------------섞기 전");
		
		Random random = new Random();
		for(int i=0; i<10000; i++) {
			int r = random.nextInt(44) + 1;
			int temp = lotto[0];
			lotto[0] = lotto[r];
			lotto[r] = temp;
		}
		
		for(int i=0; i<lotto.length; i++) {
			System.out.printf("%2d ", lotto[i]);
			if ((i + 1) % 10 == 0) {
				System.out.println();
			}
	}
		System.out.println("--------------------섞은 후");

		System.out.print("1등 번호: ");
		for(int i=0; i<6; i++) {
			System.out.printf("%2d ", lotto[i]);
			
			
		}
		
		System.out.printf("보너스: %2d ", lotto[6]);
	}
}
	

