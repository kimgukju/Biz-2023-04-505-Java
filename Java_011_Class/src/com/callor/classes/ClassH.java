package com.callor.classes;

import java.util.Scanner;

public class ClassH {

	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;

		// 인터넷에서 do~while 문이란걸 찾아서 해봤는데 해결 못했습니다
		// 저는 num1에 정수값 입력하고 정수값이 아닐시 Game Over 나오며 즉시 중단 해보려했는데 
		// 문자열이나 실수값 넣을시 타입이 안맞다뜨며 오류가 뜹니다
		do {
			System.out.println("do~while문");
			System.out.println("두 개의 정수를 입력하세요");
			System.out.print("정수1 >> ");

			num1 = scan.nextInt();
			if(num1 != scan.nextInt()) {
				System.out.println("Game Over!!");
				break;
			}

			
			System.out.print("정수2 >> ");
			num2 = scan.nextInt();
			if(num2 != scan.nextInt()) {
				System.out.println("Game Over!!");
				break;
			}
			System.out.printf("%d + %d = %d\n\n", 
							num1, num2, num1+num2);
		} while(true);
		
		
		
	}

}
