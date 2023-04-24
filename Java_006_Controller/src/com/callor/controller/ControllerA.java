package com.callor.controller;

public class ControllerA {
	/*
	 * java.exe 도구가 ControllerA.class 파일을 읽어서 
	 * 메모리에 load 하고 제일 먼저 호출 하는 method()
	 * 시작점 메소드 , 진입점 메소드
	 */
	public static void main(String[] args) {
		
		// return type이 void 이므로 단독으로만
		// 호출하여 명령을 실행 할 수 있다
		prime();
		// prime() method는 return type이 void 이기 때문에
		// 다른 명령문에 포함되거나
		// if( prime() ) { }
		
		// 변수의 값을 생성할 수 없다
		// boolean yesPrime = prime();
		
		// 변수에 대입하는 값도 생성 할 수 없다
		//boolean yesPrime;
		//yesPrime = prime();

	
	} // end main

	/*
	 * 매개변수도 없고, return type 이 void(없다라고 표현)
	 * prime() method 선언
	 */
	public static void prime() {
		int rndNum = (int)(Math.random()*50) + 51;
		int index = 0;
		for(index = 2 ; index < rndNum; index++) {
			if(index % 2 == 0) {
				break;
			}
		}
		if(rndNum <= index) {
			System.out.println(rndNum + " 는 소수");
		} else {
			System.out.println(rndNum + " 는 소수가 아님");
		}
	}
}
