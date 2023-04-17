package com.callor.var.controller;

public class ControlF {
	
	public static void main(String[] args) {
		
		int intRnd = (int)(Math.random() * 10) + 1;
		if(intRnd % 3 == 0) {
			int intResult = intRnd * 3;
			System.out.println(intRnd + "는(은) 3의 배수이며 x3은 "+ intResult);
		}
		else {
			System.err.println(intRnd + "는(은) 3의 배수가 아니다");
		}
		/*
		 * intResult 변수는 if() {} 의 scope를 갖는다
		 * = if() {} block 내부에서만 생명을 유지한다
		 * 즉, if() {} 을 벗어나면 intResult 변수는
		 * 참조(읽기, 쓰기(할당)) 할 수 없다
		 */
		//System.out.println(intResult);
	}

}
