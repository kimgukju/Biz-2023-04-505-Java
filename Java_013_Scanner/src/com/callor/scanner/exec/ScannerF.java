package com.callor.scanner.exec;

import java.util.Scanner;

public class ScannerF {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] nums = new int[6];
		// int num = 0;
		int i = 0;
		while (true) {
			System.out.println("GAME START");
			for (i = 0; i < nums.length; i++) {
				int rndNum = (int) (Math.random() * 45) + 1;
				while (true) {
					System.out.println("1~45 정수를 입력해보세요");
					System.out.print("(QUIT 입력시 종료) : ");
					String strNum = scan.nextLine();
					if (strNum.equals("QUIT")) {
						System.out.println("GAME OVER");
						return;
					}
					nums[i] = Integer.valueOf(strNum);
					try {
						if (nums[i] < 0 || nums[i] > 45) {
							System.out.println("1~45까지 범위의 정수만 입력하세요");
						} else if (nums[i] == rndNum) {
							System.out.println("★잘했어요★");
							System.out.println();
							break;
						} else if (nums[i] < rndNum) {
							System.err.println("작은 수를 입력했어요");
						} else if (nums[i] > rndNum) {
							System.err.println("큰 수를 입력했어요");
						}
						continue;
					} catch (Exception e) {
						System.out.println("정수를 정확히 입력해주세요");
					}
				}
				if (i == (nums.length - 1)) {
					for (i = 0; i < nums.length; i++) {
						System.out.printf("nums[%d]의 값 : %d\n", i, nums[i]);
					}
					System.out.println("6개 다 맞췄네요!");
				}
			}
			break;
		}
	}
}
