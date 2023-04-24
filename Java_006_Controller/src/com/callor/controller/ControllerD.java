package com.callor.controller;

public class ControllerD {

	public static int prime() {
		int rndNum = (int) (Math.random() * 50) + 51;
		for (int i = 2; i < rndNum; i++) {
			if (rndNum % i == 0) {
				return 0;
			}
		}
		return rndNum;
	}

	public static void main(String[] args) {
		int countPrime = 0;
		int sumPrime = 0;
		for (int i = 0; i < 100; i++) {
			int rndNum = prime();
			if (rndNum > 0) {
				countPrime ++;
				sumPrime += rndNum;
				System.out.println(rndNum + "는(은) 소수");
			}
		} // end for
		System.out.println(sumPrime + "는(은) 소수의 합");
		System.out.printf("소수의 개수 : %d개\n",countPrime);
	}
}
