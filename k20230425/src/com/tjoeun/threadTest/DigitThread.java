package com.tjoeun.threadTest;

//	Thread 클래스를 상속받고 run() 메소드를 Override해서 멀티 스레드를 구현한다.
public class DigitThread extends Thread {

	@Override
	public void run() {
		
//		1 ~ 26을 0.2초 간격으로 출력한다.
		for(int i=1; i<26; i++) { // for(char ch='A'; ch<='Z'; ch++) {
			System.out.print(i); // System.out.print(ch);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
