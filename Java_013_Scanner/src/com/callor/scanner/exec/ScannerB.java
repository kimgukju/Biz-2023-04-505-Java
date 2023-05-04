package com.callor.scanner.exec;

import java.util.Scanner;

public class ScannerB {
	
	private static int getNum() {
		Scanner scan = new Scanner(System.in);
		int num = 0;
		while(true) {
			System.out.println("3이상의 양의 정수를 입력하세요");
			System.out.print("정수( QUIT: 종료) >> ");
			String strNum = scan.nextLine();
			if(strNum.equals("QUIT")) {
				return -1;
			}
			try {
				num = Integer.valueOf(strNum);
//				if(num < 3) {
//					continue;
//				}
				// continue 키워드를 사용하고 싶지 않으면
				if(num >= 3 ) {
					break;
				}
				break;
			} catch (Exception e) {
				System.out.println("정수만을 정확히 입력해주세요");
			}
			
		}
	
		return num;
	}
	
	// 매개변수를 통하여 전달받은 num 변수의 값이
	// prime이 아니면 -1을 return, prime이면 num 변수의 값을 return
	public static int prime(int num) {
		int index = 0;
		for(index = 2; index < num; index++) {
			if(num % index == 0) {
				return -1;
			} 
		}
		return num;
	}
	
	public static void main(String[] args) {
		
		int num = getNum();
		if(num < 0 ) {
			System.out.println("GAME OVER");
			// main() method에서 return 명령이 실행되면
			// 프로젝트 코드 전체를 중단하라
			return; 
		}

		// prime() method는 전달받은 num "변수의 값"이
		// prime 이면 num를 return, 아니면 -1을 return 한다
		// return 한 결과를 다시 result 변수에 저장한다
		int result = prime(num);
		
		// num 변수에 저장된 값을 보고 prime인지 아닌지 판단한다
		if(result > 0) {
			System.out.println(num + " 는 소수");
		} else {
			System.err.println(num + " 는 소수가 아님");
		}
			
	}

}
