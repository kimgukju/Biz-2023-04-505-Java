package com.callor.scanner.exec;

import java.util.Scanner;

import com.callor.scanner.config.PublicConfig;

public class ScannerF1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] nums = new int[6];
		int numsSaveIndex = 0; // nums의 "어느 위치"를 알려줄 변수
		
		// nums 배열에 한번도 저장되지 않는 rndNum 값 찾기(만들기)
		while(true) {
			int rndNum = (int)(Math.random() * 45 + 1);
			int searchIndex;
			for(searchIndex = 0; searchIndex < nums.length; searchIndex++) {
				if(nums[searchIndex] == rndNum) {
					break;
				}
			}
			// rndNum에 저장된 값이 nums 요소에 있으면 다시 while() 처음으로
			if(searchIndex < nums.length) {
				continue;
			}
			
			// 여기에 도달하면 rndNum는 중복되지 않는 랜덤 수 
			while(true) {
				System.out.println(PublicConfig.dLine);
				System.out.println(rndNum);
				
				System.out.println("1~45 정수 입력(QUIT : 종료) >> ");
				String strNum = scan.nextLine();
				if(strNum.equals("QUIT")) {
					System.out.println("게임을 중단합니다");
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
				System.out.println(PublicConfig.sLine);
				if(intNum < 0 || intNum > 45) {
					System.out.println("1~45 범위의 정수 값을 입력하세요");
				} else if(intNum == rndNum) {
					System.out.println("잘했어요");
					// nums 배열의 "어느 위치"에 rndNum를 저장해야 한다.
					nums[numsSaveIndex++] = rndNum; // for문이 아니라 numsSaveIndex에 ++ 해도 ㄱㅊ음
					break;
				} else if(intNum < rndNum) {
					System.out.printf("%d, 입력값이 작아요\n",intNum);
				} else if(intNum > rndNum) {
					System.out.printf("%d, 입력값이 커요\n",intNum);
				}
				
				
			} // 숫자 맞추기 while
			// 참잘했어요 후 break를 만났을때 진행 되는 곳
			if(numsSaveIndex >= nums.length) {
				break;
			}
		} // 1st while
		System.out.println("GAME OVER");
		for(int i = 0; i < nums.length; i++) {
			System.out.printf("%d\t",nums[i]);
			
		}
		
	}
	
}
