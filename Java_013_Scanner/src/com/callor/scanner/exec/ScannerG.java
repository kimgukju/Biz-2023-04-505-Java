package com.callor.scanner.exec;

import java.util.Scanner;

public class ScannerG {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] nums = new int[6];
		int numsSaveIndex = 0;

		while (true) {
			int rndNum = (int) (Math.random() * 45) + 1;
			int searchIndex;
			for (searchIndex = 0; searchIndex < nums.length; searchIndex++) {
				if (nums[searchIndex] == rndNum) {
					break;
				}
			}
			if (searchIndex < nums.length) {
				continue;
			}

			while (true) {

				System.out.println(rndNum);
				System.out.println("1~45 중 정수를 입력하세요");
				System.out.print("입력(QUIT 입력 종료) : ");
				String strNum = scan.nextLine();
				if (strNum.equals("QUIT")) {
					System.out.println("종료되었습니다");
					return;
				}

				int intNum = 0;
				try {
					intNum = Integer.valueOf(strNum);
				} catch (Exception e) {
					System.out.println("입력값 오류!");
					System.out.println("정수만 입력하세요");
					continue;
				}

				if (intNum < 0 || intNum > 45) {
					System.out.println("1~45 범위 내의 정수를 입력하세요");
				} else if (intNum == rndNum) {
					System.out.println("정답입니다");
					nums[numsSaveIndex++] = rndNum;
					break;
				} else if (intNum < rndNum) {
					System.err.println("랜덤수보다 작은수입니다");
				} else if (intNum > rndNum) {
					System.err.println("랜덤수보다 큰수입니다");
				}

			}
			if (numsSaveIndex >= nums.length) {
				break;
			}
		}
		System.out.println("GAME OVER");
		for(int i = 0; i < nums.length; i++) {
			System.out.printf("%d\t",nums[i]);
		}
		System.out.println();
		System.out.println("오름차순으로 정리");
		for(int out = 0; out < nums.length; out++ ) {
			for(int in = out + 1 ; in < nums.length; in++ ) {
				if(nums[out] > nums[in]) {
					int _temp = nums[in];
					nums[in] = nums[out];
					nums[out] = _temp;
				}
			}
		}
		for(int i = 0; i < nums.length; i++) {
			System.out.printf("%3d\t", nums[i]);
		}
		System.out.println();
	}
}
