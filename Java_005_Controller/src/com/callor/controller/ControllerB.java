package com.callor.controller;

public class ControllerB {
	
	public static void main(String[] args) {
		int rndNum = (int)(Math.random()*50) + 51;
		// i 을 2~ 자신 -1 까지 연속된 정수를
		// 만들어 내는 코드
		int primeCount = 0;
		for(int i = 2; i <rndNum; i++) { 
			if(rndNum % i == 0) {
				// System.out.println(rndNum + " 소수가 아님");
				primeCount ++;
				break;
			}
		}
		if(primeCount > 0) {
			System.out.println(rndNum + " 는 소수가 아님");
		} else {
			System.out.println(rndNum + " 는 소수");
		}
		if (primeCount == 0) {
			System.out.println(rndNum + " 는 소수");
		} else {
			System.out.println(rndNum + " 는 소수가 아님");
		}
		
		// yesNo flag 변수(boolean 변수 사용)
		boolean isPrime = true;
		for(int i = 2; i < rndNum; i++) {
			if(rndNum % i == 0) {
				isPrime = false;
				break;
			}
		}
		if(isPrime) {
			System.out.println(rndNum + "는 소수다(boolean)");
		} else {
			System.out.println(rndNum + "는 소수가 아님(boolean)");
		}
		
	}

}


//for(int i = 2 ; i<=rndNum; i++) {
		//	if (rndNum != i && rndNum % i == 0) {
		//		break;
		//	}
		//	else if (rndNum == i ) {
		//		System.out.print(rndNum +"는 소수다?");
		//	}
		//}
