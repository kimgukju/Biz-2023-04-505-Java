package com.callor.scanner.exec;

import java.util.Scanner;

public class ScannerD {

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
						System.out.println("==========");
						System.out.println("★잘했어요★");
						System.out.println("==========");
						break;
					} else {
						System.err.println("다시 해보세요");
						continue;
					}
				} catch (Exception e) {
					continue;
				}
//				num = Integer.valueOf(strNum);
//				if(num == rndNum) {
//					System.out.println("==========");
//					System.out.println("★잘했어요★");
//					System.out.println("==========");
//					break;
//				} else {
//					System.err.println("다시 해보세요");
//					continue;
//				}
			}
		}

	}

}
