package com.tjoeun.abstractClass;

import java.util.ArrayList;

//	추상메소드에서도 일반 메소드를 가질 수 있다.
//	부모 꺼 그대로 자식이 쓰려면 상속받아 일반 메소드로 쓰고
//	다형성을 구현해서 이름은 같지만 기능은 다르게 써야 할 때는 추상 메소드로 구현한다.
abstract class Animal {
//	public void move() {
//		System.out.println("동물이 움직입니다.");
//	}
//}
	public abstract void move(); // 추상 메소드
	public void eating() { // 일반 메소드
	}
}

//	Human 클래스는 Animal 클래스를 상속받아 만든다.
class Human extends Animal {
	@Override
	public void move() {
		System.out.println("사람이 두 발로 걷습니다.");
	}
	public void run() {
		System.out.println("사람이 뛰어갑니다.");
	}
}

//	Tiger 클래스는 Animal 클래스를 상속받아 만든다.
class Tiger extends Animal {
	@Override
	public void move() {
		System.out.println("호랑이가 네 발로 걷습니다.");
	}
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
}

//	Eagle 클래스는 Animal 클래스를 상속받아 만든다.
class Eagle extends Animal {
	@Override
	public void move() {
		System.out.println("독수리가 하늘을 날아갑니다.");
	}
	public void flying() {
		System.out.println("독수리가 날개를 달고 멀리 날아갑니다.");
	}
}


public class InstanceOfTest { //12:43
	
	public static void main(String[] args) {
		
		Animal[] animals = {new Human(), new Eagle(), new Tiger()};
		animals[0].move();
		animals[1].move();
		animals[2].move();
		System.out.println("--------------------------");
		
//		upcasting, 자식 => 부모
		Animal hAnimal = new Human();
		Animal eAnimal = new Eagle();
		Animal tAnimal = new Tiger();
//		main() 이라는 static 메소드에서 moveAnimal()을 바로 실행하기 때문에
//		moveAnimal() 메소드는 반드시 static으로 선언된 메소드이어야 한다.
//		private static void moveAnimal(Animal animal) {}
		moveAnimal(hAnimal);
		moveAnimal(eAnimal);
		moveAnimal(tAnimal);
//		moveAnimal(new Human());
		System.out.println("--------------------------");
		
//		현재 클래스 자신의 객체를 생성해서 moveAnimal2() 메소드를 실행하게 되면 
//		static 메소드로 만들지 않고도 실행할 수 있다.
//		private void moveAnimal2(Animal animal) { // static이 붙지 않는 메소드 실행 가능
		InstanceOfTest test  = new InstanceOfTest(); // 자신의 클래스 객체를 만든다.
		test.moveAnimal2(hAnimal);
		test.moveAnimal2(eAnimal);
		test.moveAnimal2(tAnimal);
		System.out.println("--------------------------");
		
		ArrayList<Animal> animalList = new ArrayList<>();
		animalList.add(hAnimal);
		animalList.add(tAnimal);
		animalList.add(eAnimal);
		for(Animal animal : animalList) {
			animal.move();
		}
		System.out.println("--------------------------");
		
		for(int i=0; i<animalList.size(); i++) {
			Animal animal = animalList.get(i);
//		downcasting: upcasting된 클래스를 다시 원래의 타입으로 형변환시킨다.
//		instanceof 연산자를 사용해서 형변환이 가능한지 확인한 후 downcasting을 실행한다.
		if(animal instanceof Human) {
			Human human = (Human) animal; // downcasting, 부모에 저장된 자식 객체 => 자식
			human.run();
		} else if(animal instanceof Tiger){
			Tiger tiger = (Tiger) animal;
			tiger.hunting();
		} else if(animal instanceof Eagle) {
			Eagle eagle = (Eagle) animal;
			eagle.flying();
		} else {
			System.out.println("downcasting");
			}
		}
	}

	
	
	private void moveAnimal2(Animal animal) {
		animal.move();
		
	}

	private static void moveAnimal(Animal animal) {
		animal.move();
	}

}
