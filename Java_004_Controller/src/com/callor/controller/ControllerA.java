package com.callor.controller;

public class ControllerA {

	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			int intRan = ((int) (Math.random() * 50) + 51);
			if(intRan < 51 || intRan > 100) {
				System.out.println(" Over");
			}
			else {
				System.out.printf("%d는 51~100범위의 수",intRan);
			}
			//if (intRan >= 51 && intRan <= 100) {
			//	System.out.printf("%d는 51~100 범위의 수", intRan);
			//}
			System.out.println();
		}
	}
}
