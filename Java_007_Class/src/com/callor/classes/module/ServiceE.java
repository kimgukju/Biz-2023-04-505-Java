package com.callor.classes.module;

public class ServiceE {
	
	public void score(int num1, int num2, int num3) {
		int total = num1+num2+num3;
		float avg = (float)total/3;
		System.out.printf("국어점수 : %d 영어점수 : %d 수학점수 : %d "
				+ "\n총점 : %d\n평균 : %2.1f",num1,num2,num3,total,avg);
	}
}
