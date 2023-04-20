package com.callor.controller;

public class ControllerD {
	public static void main(String[] args) {
		// 임의의 수 100개 만들고 그 중에서 소수만 출력하기
		int index;
		for (int i = 0; i < 100; i++) {
			int rndNum = (int) (Math.random() * 50) + 51;
			for (index = 2; index < rndNum; index++) {
				if (rndNum % index == 0) {
					break;
				}
			}
			if (rndNum <= index) {
				System.out.println(rndNum + "는 소수");
			}
		}
	}
}