package com.callor.var.controller;

public class ControlB {
	
	public static void main(String[] args) {
		
		double douRnd = Math.random(); // Math.random()은 0~ 0.99999 중 임의의 수(난수)
		douRnd = douRnd * 10;
		int intRnd = (int)douRnd; // 강제형변환 
		
		System.out.println( douRnd );
		System.out.println( intRnd );
		
		intRnd = (int)(Math.random() * 10); // 강제형변환
	}

}
