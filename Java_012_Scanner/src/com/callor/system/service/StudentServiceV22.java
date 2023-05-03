package com.callor.system.service;

import java.util.Scanner;

import com.callor.system.models.StudentDto;

public class StudentServiceV22 {
	
	// 학생리스트를 담을 배열 선언
	private StudentDto[] stList;
	
	public void inputStudents() {
		Scanner scan = new Scanner(System.in);
		
		// 요소가 5개인 배열을 선언
		// 배열의 요소는 초기화가 안된 상태, 사용이 불가한 상태
		stList = new StudentDto[5];
		
		// 학생 수 만큼 반복
		for (int i = 0; i< stList.length; i++) {
			
			System.out.println("학생정보를 입력하세요");
			int intNum=0;
			
			while(true) {
				System.out.print("학번(1~5) >> ");
				String stNum = scan.nextLine();
				try {
					intNum = Integer.valueOf(stNum);
				} catch (Exception e) {
					System.out.println("학번은 정수로 입력하세요");
					continue;
				}
				// 학번에서 -1을 입력하면 더이상 입력받지 않기
				if(intNum < 0 ) {
					// method를 종료하라
					return;
				}
				if(intNum < 1 || intNum > stList.length +1 ) {
					System.out.println("학번은 1~5까지 입력하세요");
					continue;
				}
				break;
			}
			
		}
		
		
		
		
	}
	

}
