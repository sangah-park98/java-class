package k20230410;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class LottoTest2 {

	public static void main(String[] args) {

		int[] lotto = new int[45];
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = i + 1;
		}

//		복권 구매 금액을 입력받는다.
		Random random = new Random();
		Scanner s = new Scanner(System.in);
		System.out.print("금액> ");
		int price = s.nextInt();

//		입력한 금액만큼 반복하며 자동 로또 번호를 생성한다.
		for (int j = 0; j < price / 1000; j++) {
			for (int i = 0; i < 10000; i++) {
				int r = random.nextInt(44) + 1;
				int temp = lotto[0];
				lotto[0] = lotto[r];
				lotto[r] = temp;
			}
//			로또 번호 정렬
			int[] arr = new int[6];
			for(int i=0; i<6; i++) {
				arr[i] = lotto[i];
			}
//			Arrays.sort(arr);
			for(int i=0; i<5; i++) { // 선택 위치, 회전수
				for(int k=i+1; k<6; k++) {
					if(arr[i]>arr[k]) {
						int temp = arr[i];
						arr[i] = arr[k];
						arr[k] = temp;
					} 
				}
			}
			
			System.out.printf("%3d GAME: ",j + 1);
			for (int i = 0; i < 6; i++) {
				System.out.printf("%02d ", arr[i]);
			}
			System.out.println();
			if((j+1)%10==0) {
				System.out.println("---------------------------");
			}
		}
	}
}
