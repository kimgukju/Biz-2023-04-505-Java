package com.callor.scanner.exec;

import java.util.Scanner;

public class ScannerA {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = 0;
		while(true) {
			System.out.print("정수를 입력하세요 >> ");
			String strNum = scan.nextLine();
			
			try {
				num = Integer.valueOf(strNum);
				break;
			} catch (Exception e) {
				System.out.println("정수만을 입력해주세요");
			}
			
		}
		//num = scan.nextInt();
		int index = 0;
		for(index = 2; index < num; index++) {
			if(num % index == 0) {
				break;
			} 
		}
		
		// for() 반복문이 끝났을때
		// num가 소수와 num가 소수가 아닌경우
		if(num <= index) {
			System.out.println(num + " 는 소수");
		} else {
			System.err.println(num + " 는 소수가 아님");
		}
			
	}

}
