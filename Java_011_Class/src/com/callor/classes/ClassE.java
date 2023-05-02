package com.callor.classes;

import java.util.Scanner;

public class ClassE {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		
		System.out.print("1번째 정수를 입력하세요 : ");
		num1 = scan.nextInt();
		System.out.print("2번째 정수를 입력하세요 : ");
		num2 = scan.nextInt();
		
		System.out.printf("합 : %d, 차 : %d, 곱 : %d, 나누기 : %2.2f",
							num1+num2, num1-num2, num1*num2, (float)num1/num2);
		
	}

}
