package com.callor.classes.module;

public class ServiceC {
	
	public void guguDan(int num) {
		System.out.println("==================");
		System.out.println(num + "단 구구단");
		for(int i=1 ; i<10; i++ ) {
			System.out.printf("%d * %d = %d\n", num, i, num * i);
		}
		System.out.println("-----------------");
	}

}
