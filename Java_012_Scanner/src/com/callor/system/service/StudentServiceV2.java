package com.callor.system.service;

import java.util.Scanner;

import com.callor.system.models.StudentDto;

public class StudentServiceV2 {
	
	private StudentDto[] stList;
	
	public void inputStudents() {
		Scanner scan = new Scanner(System.in);
		stList = new StudentDto[5];
		int i = 0;
		for(i=0; i<5; i++) {
			stList[i] = new StudentDto();
			
			System.out.println("학생정보를 입력하세요");
			System.out.print("학번을 입력하세요 >> ");
			String stNum = scan.nextLine();
			
			System.out.print("이름을 입력하세요 >> ");
			String stName = scan.nextLine();
			
			System.out.print("학과를 입력하세요 >> ");
			String stDept = scan.nextLine();
			
			int intGrade = 0;
			while(true) {
				System.out.print("학년을 입력하세요 >> ");
				String stGrade = scan.nextLine();
				try {
					intGrade = Integer.valueOf(stGrade);
				} catch (Exception e) {
					System.out.println("학년은 정수로만 입력하세요");
					continue;
				}
				if(intGrade < 1 || intGrade > 4) {
					System.out.println("학년은 1~4 범위에서 입력하세요");
					continue;
				}
				break;
			}
			
			
			
			
			System.out.print("전화번호를 입력하세요 >> ");
			String stTel = scan.nextLine();
			
			stList[i].setStNum(stNum);
			stList[i].setStName(stName);
			stList[i].setStDept(stDept);
			stList[i].setStGrade(intGrade);
			stList[i].setStTel(stTel);
			
			
			System.out.println(stList[i].toString());
		}

	}
		
	
	public void printStudents() {
		System.out.println("=".repeat(80));
		System.out.println("학번	이름	학과	   학년		전화번호");
		System.out.println("-".repeat(80));
		for(int i=0; i<5; i++) {
			System.out.printf("%s\t%s\t%s\t\t%d\t%s\n", 
					stList[i].getStNum() , stList[i].getStName(), stList[i].getStDept(),
					stList[i].getStGrade(), stList[i].getStTel());
			//System.out.println(stList[i]);
		}
		System.out.println("=".repeat(80));
		
	}

}
