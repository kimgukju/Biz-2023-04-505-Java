package com.callor.scanner.exec;

import java.util.Scanner;

public class ScannerE {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = 0;
		while (true) {
			System.out.println("GAME START");
			int rndNum = (int) (Math.random() * 10) + 1;
			while (true) {
				System.out.println("1~10 수를 입력해보세요");
				System.out.print("(QUIT 입력시 종료) : ");
				String strNum = scan.nextLine();
				if (strNum.equals("QUIT")) {
					System.out.println("GAME OVER");
					return;
				}
				num = Integer.valueOf(strNum);
				try {
					if (num == rndNum) {
						System.out.println("★잘했어요★");
						System.out.println();
						break;
					} else if(num < rndNum) {
						System.err.println("작은 수를 입력했어요");
					} else if(num > rndNum) {
						System.err.println("큰 수를 입력했어요");
					}
					continue;
					// ㅇㅇ
					// else {
					  //	if(num < rndNum) {
					  //		System.err.println("작은 수를 입력했어요");
					  //	} 
					  //	if(num > rndNum) {
					  //		System.err.println("큰 수를 입력했어요");
					  //	}
					 //	continue;
				     //	}
				} catch (Exception e) {
					System.out.println("정수를 정확히 입력해주세요");
				}
			}
		}

	}

}
