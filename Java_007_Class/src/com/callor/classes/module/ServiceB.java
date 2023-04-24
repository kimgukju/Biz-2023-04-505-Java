package com.callor.classes.module;

public class ServiceB {
	
	public void scorePrint(String name,int num1, int num2, int num3) {
		int sum = num1+num2+num3;
		float avg = (float)sum/3;
		
		System.out.println("=============================================");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("---------------------------------------------");
		System.out.printf("%s\t %d\t%d\t%d\t%d\t%2.1f\n",name,num1,num2,num3,sum,avg);
		//System.out.println(name+"   "+num1+"    "+num2+"    "+num3+"   "+sum+"   "+avg);
		System.out.println("=============================================");
		// String은 %s float type은 %f 쓰기
	}
	
}

