package com.callor.controller;

public class ControllerB {

	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			int RndNum = (int) (Math.random() * 50) + 51;
			if (RndNum % 2 == 0) {
				System.out.println(RndNum + "는(은) 짝수다");
			} else if (RndNum % 2 == 1) {
				System.err.println(RndNum + "는(은) 홀수다");
			}

		}
	}
}
