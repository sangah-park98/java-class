package k20230412;

import java.util.Scanner;

public class WeekdayTest {
	
	public static void main(String[] args) {
		
//		요일을 계산할 년, 월, 일을 입력받는다.
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("요일을 계산할 년,월,일을 입력하세요: ");
		int year = scanner.nextInt();
		int month = scanner.nextInt();
		int day = scanner.nextInt();
		int total =0;
//		서기 1년 1월 1일부터 요일을 계산하기 위해 입력한 날짜까지 지난 날짜수를 계산한다.
//		계산된 날짜를 7로 나눈 나머지가 0이면 일요일, 1이면 월요일, ... 5면 금요일, 6이면 토요일

//		서기 1년 1월 1일부터 입력한 날짜의 전년도 12월 31일까지 지난 날짜를 계산한다.
		int sum = 	(year-1) *365 + 
					(year-1)/4 - 
	                (year-1)/100 +
	                (year-1)/400;
	        
	        int[] lastDay= {31,28,31,30,31,30,31,31,30,31,30,31};
	        
//		윤년 : 4로 나누어 떨어지거나 100으로 나누어 떨어지지 않고 400으로 나누어 떨어진다.
	        if((year%4==0 && year%100!=0)||(year%400==0)) 
	        {
	            lastDay[1]=29;
	        }
	        else
	        {
	            lastDay[1]=28;
	        }
	        
	        for(int i=0;i<month-1;i++)
	        {
	            total+=lastDay[i];
	        }
	        
	        //입력된 DAY
	        total+=day;
	        
//		요일을 출력한다.
	        int week=total%7;
	        char[] strWeek= {'일','월','화','수','목','금','토'};
	        System.out.println(strWeek[week]+"요일입니다");
	    }
	}

			
	
