package com.tjoeun.daemonThreadTest;

public class BGMThread extends Thread {

	@Override
	public void run() {
		
		while(true) {
			System.out.println("배경 음악이 나오는 중...");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}
