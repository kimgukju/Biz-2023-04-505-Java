package com.callor.system.service;

import java.util.Scanner;

import com.callor.system.models.StudentDto;

public class StudentServiceV1 {
	
	public void inputStudent() {
		StudentDto student = new StudentDto();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("학생정보를 입력하세요");
		System.out.print("학번을 입력하세요 >> ");
		String stNum = scan.nextLine();
		//student.setStNum(scan.nextLine());
		
		System.out.print("이름을 입력하세요 >> ");
		String stName = scan.nextLine();
		//student.setStName(scan.nextLine());
		
		System.out.print("학과를 입력하세요 >> ");
		String stDept = scan.nextLine();
		//student.setStDept(scan.nextLine());
		
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
			//student.setStGrade(scan.nextInt());
			break;
		}
		
		
		
		
		System.out.print("전화번호를 입력하세요 >> ");
		String stTel = scan.nextLine();
		//student.setStTel(scan.nextLine());
		
		student.setStNum(stNum);
		student.setStName(stName);
		student.setStDept(stDept);
		student.setStGrade(intGrade);
		student.setStTel(stTel);
		
		
		System.out.println(student.toString());
		
	}

}
