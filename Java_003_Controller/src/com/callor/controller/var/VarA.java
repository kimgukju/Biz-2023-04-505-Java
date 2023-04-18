package com.callor.controller.var;

public class VarA {
	public static void main(String[] args) {
		int intKor = 82;
		int intEng = 76;
		int intMath = 95;
		
		//int intTotal = intKor + intEng + intMath; 같은거
		int intTotal = intKor;
		intTotal += intEng;
		intTotal += intMath;
		
		float floatAvg = (float)intTotal/3;
		System.out.println("================================");
		System.out.printf("국어 :%3d\n",intKor);
		System.out.printf("영어 :%3d\n",intEng);
		System.out.printf("수학 :%3d\n",intMath);
		//System.out.println("국어:"+intKor); 
		//System.out.println("영어:"+intEng); 
		//System.out.println("수학:"+intMath);
		System.out.println("--------------------------------");
		System.out.printf("총점 : %d,	평균: %5.2f",intTotal,floatAvg);
		//System.out.print("총점:"+intTotal+", 평균:"+intAvg);
		
	}

}
