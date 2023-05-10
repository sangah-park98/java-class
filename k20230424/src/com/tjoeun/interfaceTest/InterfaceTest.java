package com.tjoeun.interfaceTest;


class Point {
	int x, y;
	void move() {}
}

class Shape {
//	final을 필드 선언시 앞에 붙여주면 그 필드는 프로그램에서 값을 변경할 수 없다. => 상수
//	상수는 다른 변수와 구분하기 위해서 일반적으로 대문자로 만들어 사용한다.
//	final을 메소드 선언 시 앞에 붙여주면 그 메소드는 Override 시켜서 사용할 수 없다.
//	final을 클래스 선언 시 앞에 붙여주면 그 클래스는 상속시켜 사용할 수 없다.
//	public static final double PI = 3.141592; // 정적 필드, 상수
	
//	상수는 반드시 선언과 동시에 초기화시켜야 한다.
//	static을 붙여서 선언한 상수는 "="을 사용해서 초기화 시켜야 하고 
//	static을 붙이지 않고 선언한 상수는 "="을 이용해도 되고 생성자를 이용해도 된다.
	public final double PI;
	public Shape() {
		PI = 3.141592;
	}
}

//  자바는 다중 상속을 지원하지 않기 때문에 아래와 같이 상속하면 에러가 발생된다.
//  class Line extends point, shape () {} // 에러 발생
//  interface는 class의 특별한 형태로 무조건 상수(public static final)와 추상 메소드
//	(public abstract)로만 구성된다.

interface Draw {
//	상수는 반드시 선언과 동시(객체가 생성될 때)에 초기화를 시켜야 한다.
//	public static final double PI; // 에러 발생
//	public static final double PI = 3.141592;
	double PI = 3.141592;
//	인터페이스 필드는 무조건 상수만 가질 수 있으므로 필드 선언 시 앞의 내용을 생락하면 
//	public static final을 자동으로 붙여준다.
	int LIMIT = 1000;
	
//	인터페이스는 무조건 추상 메소드만 가질 수 있기 때문에 일반 메소드를 선언하면 에러가 발생된다.
//	public void rotate() {} // 에러 발생
	public abstract void movemove(); // 추상 메소드
//	인터페이스는 메소드 선언 시 앞의 내용을 생략하면 public abstract을 자동으로 붙여준다.
	void erase(); // 이렇게 해도 추상 메소드
	
}

interface Graphic {
	void rotate();
	void resize();
}

//	클래스는 인터페이스를 상속받을 수 없기 때문에 에러가 발생된다.
//	class Line extends Graphic {} // 에러 발생

//	인터페이스는 클래스를 상속받을 수 없기 때문에 에러가 발생된다.
//	interface Graphics extends point {}

//	클래스는 클래스끼리 인터페이스는 인터페이스끼리 상속을 시켜야 한다.
//	클래스는 다중 상속을 허용하지 않지만 인터페이스는 다중 상속을 허용한다.

interface Graphics extends Draw, Graphic {
//	아무런 내용을 가지지 않는 인터페이스를 표시(marker) 인터페이스라 부른다.	
}

//	클래스에 클래스를 붙여서 사용하려면 extends 예약어를 사용해서 상속을 시키고 
//	클래스에 인터페이스를 붙여서 사용하려면 implements 예약어를 사용해서 구현시켜 사용한다.
//	Line 클래스는 Point 클래스를 상속받고 Draw, Graphic 인터페이스를 구현받아 만든다.
class Line extends Point implements Draw, Graphic {

	@Override
	public void rotate() {
		
	}

	@Override
	public void resize() {} 
// 인터페이스 오버라이드는 사용하지 않는다고 해서 삭제하면 안된다.
//	resize() {}를 사용하지 않으면 작게 줄여서 표시하면 보기에 용이

	@Override
	public void movemove() {
		
	}

	@Override
	public void erase() {
		
	}
	
}

public class InterfaceTest {
	
	public static void main(String[] args) { // static 선언하면 객체 없이 바로 "."으로 접근 가능
	
		System.out.println("Math.PI: " + Math.PI);
//		final 필드(상수)의 값을 변경하려 했으므로 에러가 발생된다.
		//		Math.PI = 1.2323; // 에러 발생
		
//		클래스 객체를 만들어서 상수에 접근할 수 있다.
		Shape shape = new Shape();
		System.out.println("shape.PI: " + shape.PI);
		
//		static으로 선언한 필드나 메소드는 객체를 생성하지 않고 클래스 이름에 "."을 찍어서
//		접근할 수 있다.
//		System.out.println("Shape.PI: " +Shape.PI);
		
		
		System.out.println("Draw.PI: " + Draw.PI);
		System.out.println("Draw.LIMIT: " + Draw.LIMIT);
	
	
	}
}
