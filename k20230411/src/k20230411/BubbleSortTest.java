package k20230411;

import java.util.Arrays;

public class BubbleSortTest {
	
	public static void main(String[] args) {
		
		int[] data = {8, 3, 4, 9, 1};
		
		for(int i=0; i<data.length-1; i++) { //회전수 제어
			for(int j=0; j<data.length-1-i; j++) { //비교 위치 설정
				if(data[j] > data[j+1]) {
					int temp = data[j];
					data[j] = data[j+1];
					data[j+1] = temp;
				}
			} //회전 종료
			System.out.println(Arrays.toString(data));
		} //정렬 종료
		System.out.println("---------------");
		System.out.println(Arrays.toString(data));
	}
}
