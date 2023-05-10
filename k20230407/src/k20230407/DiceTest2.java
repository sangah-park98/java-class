package k20230407;

import java.util.Random;

public class DiceTest2 {

	public static void main(String[] args) {
		
//		주사위를 10번 굴려서 발생된 눈의 개수를 센다.
		Random random = new Random();
//		주사위의 눈을 개수를 기억할 변수를 선언만 한다. => 모두 0으로 자동 초기화된다.
		int[] num = new int[6];
		for(int i=0; i<10; i++) {
//			주사위 눈을 무작위로 발생시킨다.
			int dice = random.nextInt(6)+1;
			System.out.println(dice);
			num[dice-1]++; //num[random.nextInt(6)]++;
			
		}
//		주사위 눈의 개수를 출력한다.
		
		for(int i=0; i<num.length; i++) {
			System.out.println(i + 1 + "의 개수: " + num[i]);
		}
	}
}
