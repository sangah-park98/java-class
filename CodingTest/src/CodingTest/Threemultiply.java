package CodingTest;

import java.util.Scanner;

public class Threemultiply {
   public static void main(String[] args) {
      
      Scanner scanner = new Scanner(System.in);
      int A = scanner.nextInt();
      int B = scanner.nextInt();
      int mul1 = A * ((B%100)%(10));
      int mul2 = (A * ((B%100)-(B%100)%(10))/10);
      int mul3 = A * (B/100);
      int mul4 = A * B;
      System.out.println(mul1);
      System.out.println(mul2);
      System.out.println(mul3);
      System.out.println(mul4);
	   
//	   int num1 = scanner.nextInt(); // (1)의 위치에 들어갈 세 자리 자연수
//	    int num2 = scanner.nextInt(); // (2)의 위치에 들어갈 세 자리 자연수
//
//	    int num3 = num1 * (num2 % 10); // (3) 위치 값
//	    int num4 = num1 * ((num2 % 100) / 10); // (4) 위치 값
//	    int num5 = num1 * (num2 / 100); // (5) 위치 값
//	    int num6 = num3 + (num4 * 10) + (num5 * 100); // (6) 위치 값
//
//	    System.out.println(num3);
//	    System.out.println(num4);
//	    System.out.println(num5);
//	    System.out.println(num6);
	}
   }

