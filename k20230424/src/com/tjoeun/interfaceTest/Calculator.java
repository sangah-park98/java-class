package com.tjoeun.interfaceTest;

// 추상 클래스는 일반 메소드와 추상 메소드를 전부 가질 수 있다.
public abstract class Calculator implements Calc {

	public int add(int num1, int num2) {
		return num1 + num2;
	}

	public int sub(int num1, int num2) {
		return num1 - num2;	
	}
	
}
