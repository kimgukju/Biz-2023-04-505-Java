package com.callor.controller;

public class ControllerB {
	
	public static boolean prime() {
		int rndNum = (int)(Math.random()*50) + 51;
		int index = 0;
		for(index = 2 ; index<rndNum ; index++ ) {
			if(index % 2 == 0 ) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		for(int i = 0 ; i < 100 ; i++) {
			/*
			 * prime() method를 실행하여
			 * return 값을 yesPrime에 저장하기
			 * 이때 prime() method의 return type과
			 * yesPrime 의 return type은 같아야 한다
			 */
			boolean yesPrime = prime();
			if(yesPrime) {
				System.out.println("소수");
			} else {
				System.err.println("소수 아님");
			}
		}
	}
}





