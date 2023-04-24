package com.callor.classes.exec;

import com.callor.classes.module.ServiceB;

public class ExecK {
	
	public static void main(String[] args) {
		String name = "홍길동";
		int kor = (int)(Math.random()*50) + 51;
		int eng = (int)(Math.random()*50) + 51;
		int math = (int)(Math.random()*50) + 51;
		ServiceB serviceB = new ServiceB();
		serviceB.scorePrint(name, kor, eng, math);		
		
	}

}
