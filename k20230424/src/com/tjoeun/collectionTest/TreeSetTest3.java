package com.tjoeun.collectionTest;

import java.util.TreeSet;

public class TreeSetTest3 {
	
	public static void main(String[] args) {
		
		TreeSet<Person> tset = new TreeSet<>();
	
//		TreeSet은 HashSet과 달리 데이터를 정렬시켜야 한다.
//		TreeSet에 저장하는 데이터가 단순 데이터일 경우 자바가 알아서 오름차순으로 정렬시켜 주지만
//		클래스로 생성한 복합 데이터일 경우 TreeSet에 저장될 클래스(Person)을 설계할 때 Comparable
//		인터페이스를 구현하고 compareTo() 메소드를 Override해서 정렬 기준으로 사용할 필드에 저장된 데이터를
//		비교하는 코드를 만들어야 한다.
		
		
		tset.add(new Person("홍길동", 20));
		System.out.println(tset.size() + ": " + tset);
		
		tset.add(new Person("홍길동", 20));
		System.out.println(tset.size() + ": " + tset);
		
		tset.add(new Person("홍길동", 35));
		System.out.println(tset.size() + ": " + tset);

		tset.add(new Person("홍길동", 27));
		System.out.println(tset.size() + ": " + tset);
		
		tset.add(new Person("임꺽정", 20));
		System.out.println(tset.size() + ": " + tset);
		
		tset.add(new Person("장길산", 20));
		System.out.println(tset.size() + ": " + tset);
		
		tset.add(new Person("일지매", 12));
		System.out.println(tset.size() + ": " + tset);
		
		
	}
}
