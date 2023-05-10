package k20230413;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class JuminNumTest2 {
	
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		System.out.print("주민등록번호 13자리를 '-'없이 입력하세요: ");
		String jumin = scanner.nextLine().trim();
		
//		8304221185600 => 아기공룡 둘리 주민등록번호
		System.out.println(jumin.substring(0,2)); //83
		System.out.println(jumin.charAt(0)); //8
		System.out.println(jumin.charAt(2)); //0

//		Integer.parseInt(): 인수로 지정된 문자열을 정수로 변환한다.
//		Double.parseDouble(): 인수로 지정된 문자열을 실수로 변환한다.
//		Boolean.parseBoolean(): 인수로 지정된 문자열을 논리값(true,false)로 변환한다.
		int year = Integer.parseInt(jumin.substring(0,2));
		System.out.println(year); 
		System.out.println(Integer.parseInt('1' + "")); 
//		정수가 와야 하는데 1만 쓰면 문자이므로 뒤에 ""를 붙여서 에러가 발생하지 않게 해준다.
	
		/*if(jumin.charAt(6) <= '2') {
			year += 1900;
		} else {
			year += 2000;
		}*/
		year += jumin.charAt(6) <= '2' ? 1900 : 2000;
		System.out.println(year);
		
//		컴퓨터의 날짜 데이터를 얻어와서 년도만 꺼낸다.
		Date date = new Date();
		System.out.println("나이: " + (date.getYear() + 1900 - year)); //date.getYear() + 1900 더해야 올해 년도 나옴
		Calendar calendar = Calendar.getInstance();
		System.out.println("나이: " + (calendar.get(calendar.YEAR)- year));
	
	}
}
