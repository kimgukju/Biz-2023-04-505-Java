package com.callor.controller;

public class ControllerE {
	public static void main(String[] args) {
		
		for(int i=0; i<100 ; i++) {
			int intScore = (int)(Math.random()*50)+51;
			//if(intScore < 51 || intScore > 100) {
			if(!(intScore >= 51 && intScore <= 100)) {
				System.out.println(intScore);
			}
		}
		System.out.println("Test End");
		
		// 다음 예제에서 num2 의 최종 값을 확인하고
		// 왜 그렇게 나오는지 설명
		int num1 = 100;
		int num2 = 100;
		if(++num1 > 100 || ++num2 > 100) {
			System.out.println("OK");
			System.out.printf("%d, %d",num1,num2);
		} // || or 연산이므로 앞에 ++num1>100이 true이므로 뒤에  
		  // ++num2는 수행하지 않아 100
		if(--num1 > 100 && --num2 > 100) {
			System.out.println("Hello");
			System.out.printf("%d, %d",num1,num2);
		} // && and 연산이므로 --num1>100이 false이므로 뒤에
		  // ++num2는 이번에도 연산하지 않아 100
	}  
}

// 51~100 임의의 정수