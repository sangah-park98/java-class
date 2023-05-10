package com.tjoeun.collectionTest;

import java.util.HashSet;
import java.util.Random;

public class HashSetTest {

	public static void main(String[] args) {
		
//		HashSet은 중복되는 데이터 입력을 허용하지 않는다.
//		데이터를 입력하는 순서와 입력된 데이터가 실제로 저장되는 순서가 달라 get(), set()
//		메소드가 제공되지 않는다.
//		arrayList는 get(), set()으로 데이터를 얻어온다.
		
		HashSet<Integer> hset = new HashSet<>(); // 정수를 기억하는 HashSet 객체가 만들어졌다. 
//			  <데이터타입> : 반드시 클래스 타입으로! int-> integer 
//		add(value) 메소드는 HashSet에 value를 저장한다.
		hset.add(500); // 데이터를 넣어준다.
		
//		size() 메소드는 HashSet에 저장된 데이터의 개수를 얻어온다. 
		System.out.println(hset.size() + ": " + hset);
		hset.add(100);
		System.out.println(hset.size() + ": " + hset);
		hset.add(100); // 중복되는 데이터는 저장되지 않는다.
		System.out.println(hset.size() + ": " + hset);
		hset.add(999);
		System.out.println(hset.size() + ": " + hset);
		hset.add(5);
		System.out.println(hset.size() + ": " + hset);
		
		
//		remove(value) 메소드는 HashSet에 저장된 value를 제거한다.
		hset.remove(500);
		System.out.println(hset.size() + ": " + hset);
		
		
//		clear() 메소드는 HashSet에 저장된 모든 데이터를 제거한다.
		hset.clear();
		System.out.println(hset.size() + ": " + hset);
		System.out.println("---------------------");
//		로또 1등 번호
		Random random = new Random();
		while(true) {
			int lotto = random.nextInt(45) + 1;
			hset.add(lotto);
			System.out.println(lotto);
			if(hset.size() == 6) {
				break;
				
			}
		}
		System.out.println("로또 1등 번호: " + hset);
		
//		보너스 번호
		int bonus;
		while(true) {
			bonus = random.nextInt(45) +1;
			hset.add(bonus);
			if(hset.size() ==7) {
				break;
			}
		}
		hset.remove(bonus);
		System.out.println("로또 1등 번호: " + hset + ", 보너스 번호: " + bonus);
		
		while(true) {
			bonus = random.nextInt(45) + 1;
			System.out.println(bonus);
//			contains() 메소드는 HashSet 객체에 인수로 지정된 데이터가 포함되어 있으면 true,
//			그렇지 않으면 false를 리턴한다.
//			if(hset.contains(bonus) == false) {
			if(hset.contains(bonus)==false) { 
//			 hset 안에 bonus가 포함되어 있니? 결과가 false면 나간다.
				break;
				
			}
		}
		System.out.println("로또 1등 번호: " + hset + ", 보너스 번호: " + bonus);
		
	}

}
