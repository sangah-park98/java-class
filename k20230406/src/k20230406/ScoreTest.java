package k20230406;

import java.util.Scanner;

public class ScoreTest {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		/*
		System.out.print("java 점수: ");
		int java = scanner.nextInt();
		System.out.print("jsp 점수: ");
		int jsp = scanner.nextInt();
		System.out.print("spring 점수: ");
		int spring = scanner.nextInt();
		*/
		
		System.out.print("3과목 점수를 입력하세요: ");
		int java = scanner.nextInt();
		int jsp = scanner.nextInt();
		int spring = scanner.nextInt();
		
		
		int total = java + jsp + spring;
		double avg = (double)total / 3;
		
		System.out.printf("총점 : %3d점 , 평균 : %.2f점\n", total, avg);

//1)		
//		if(avg >= 90) {
//			System.out.println("A");
//		}
//	 	else if(90 < avg && avg >= 80) {
//	 		System.out.println("B"); 
//	 	} else if(avg < 80 && avg >=70) {
//	 		System.out.println("C");
//	 	} else if(avg <70 && avg >=60) {
//	 		System.out.println("D");
//	 	} else {
//	 		System.out.println("F");
//	 	}
		
//2)
		if(avg >= 90) {
			System.out.println("A");
		}
	 	else if(avg >= 80) {
	 		System.out.println("B"); 
	 	} else if(avg >=70) {
	 		System.out.println("C");
	 	} else if(avg >=60) {
	 		System.out.println("D");
	 	} else {
	 		System.out.println("F");
	 	}
				
	}
}