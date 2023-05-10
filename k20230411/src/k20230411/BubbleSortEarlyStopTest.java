package k20230411;

import java.util.Arrays;

public class BubbleSortEarlyStopTest {

	public static void main(String[] args) {

		int[] data = { 8, 3, 4, 9, 1 };

		for (int i = 0; i < data.length - 1; i++) { // 회전수 제어

//		 ⓐflag라는 이름의 변수를 만들어 0으로 초기화한다.
			int flag = 0; //(boolean IsFlag = true;)

			for (int j = 0; j < data.length - 1 - i; j++) { // 비교 위치 설정
				if (data[j] > data[j + 1]) {
					int temp = data[j];
					data[j] = data[j + 1];
					data[j + 1] = temp;

					flag = 1; //(IsFlag = false;
//		 ⓑ  값교환이 이루어지면 flag변수에 1을 저장한다.
				}
			} // 회전 종료
			System.out.println(Arrays.toString(data));
//		 ⓒ 정렬이 완료된 경우 값교환 작업이 진행되지 않기 때문에 flag변수는 0을 유지하게 된다.
			if (flag == 0) { // (if(IsFlag) 
//				정렬이 완료된 상태라면 더 이상 회전할 필요가 없으므로 i반복을 탈출한다.
				break;
				
			} // 정렬 종료
			System.out.println(Arrays.toString(data));
		}
	}
}
