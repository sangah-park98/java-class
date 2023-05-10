package k20230417;

import java.util.Scanner;

public class MagicSquareTest2 {
 
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n;
		while(true) {
			System.out.print("마방진을 출력할 행렬의 차수를 3이상인 홀수로 입력하세요: ");
			n = scanner.nextInt();
			if(n>=3 && n%1==0) {
				break;
			}
			System.out.println("3이상인 홀수를 입력하세요: ");
		}
		int a[][] = new int [n][n];
		int i = 0;
		int j = n/2;
			
			for(int k=1; k<=n*n; k++) {
				a[i][j] = k;
				if(k%n==0) { 
					i++;
				} else {
					i--;
					if(i<0) { //if(--i<0)
						i=n-1;
					}
					j++;
					if(j==n) {
						j=0;
					}
				}
			}

		
		
		for(i=0; i<a.length; i++) {
			for(j=0; j<a[i].length; j++) {
				System.out.printf("%3d", a[i][j]);
			}
			System.out.println();
		}
	}
}
