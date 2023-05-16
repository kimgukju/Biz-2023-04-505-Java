package com.callor.student.service.impl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

import com.callor.student.models.StudentDto;
import com.callor.student.utils.Config;
import com.callor.student.utils.Index;
import com.callor.student.utils.Line;

/*
 * insertStudent(), 
 * printStudent(), loadStudent() 모두 상속받는다
 * 
 */
public class StudentServiceImplV2 extends StudentServiceImplV1{
	
	protected StudentDto inputStudent() {
		
		System.out.println(Line.dLine(60));
		System.out.println("학생정보 입력, 종료하려면 QUIT 입력");
		System.out.println(Line.sLine(60));
		
		String stNum = "";
		StudentDto stDto = new StudentDto();
		while(true) {
			System.out.print("학번 >> ");
			 stNum = scan.nextLine();
			if(stNum.equals("QUIT")) break;
			
			
			try {
				int intNum = Integer.valueOf(stNum);
				stNum = String.format("%04d", intNum);
				  
				
			} catch (Exception e) {
				System.out.println("정수를 입력하세요");
				continue;
			}
			break;
			
		}
		if(stNum.equals("QUIT")) return null;
		
		for(StudentDto dto : stdList) {
			if(dto.stNum.equals(stNum)) {
				System.out.println("동일한 학번이 있습니다");
				
				// dto의 어떤 데이터가 stDto가 저장될까??
				stDto = dto;
			}
		}
		
		System.out.printf("이름(%s) >> ",
				stDto.stName == null ? "신규" : stDto.stName);
		String stName = scan.nextLine();
		if(stName.equals("")) {
			stName = stDto.stName;
		}
		if(stName.equals("QUIT")) return null;
		if(stName.equals("")) {
			stName = stDto.stName;
		}
		
		
		System.out.printf("학과(%s) >> ",
				stDto.stDept == null ? "신규" : stDto.stDept); // ? X(맞으면) : Y(아니면)
		String stDept = scan.nextLine();
		if(stDept.equals("QUIT")) return null;
		if(stDept.equals("")) {
			stDept = stDto.stDept;
		}
		
		int intGrade = 0;
		
		while(true) {
			System.out.printf("학년(%s) >> ",
					stDto.stGrade == 0 ? 0 : stDto.stGrade);
			String stGrade = scan.nextLine();
			if(stGrade.equals("QUIT")) break;
			try {
				if(stDto.stGrade != 0 && stGrade.equals("")) {
					intGrade = stDto.stGrade;
				}
				intGrade = Integer.valueOf(stGrade);
			} catch (Exception e) {
				System.out.println("학년은 정수로 입력해주세요");
				continue;
			}
			if(intGrade < 1 || intGrade > 4) {
				System.out.println("학년은 1~4 범위 내의 숫자로 적어주세요");
				continue;
			}
			break;
		}
		if(intGrade == 0) {
			return null;
		}
		
		System.out.printf("전화번호(%s) >> ",
				stDto.stTel == null ? "신규" : stDto.stTel);
		String stTel = scan.nextLine();
		if(stTel.equals("QUIT")) return null;
		if(stTel.equals("")) {
			stTel = stDto.stTel;
		}
		
		stDto.stNum = stNum;
		stDto.stName = stName;
		stDto.stDept = stDept;
		stDto.stGrade = Integer.valueOf(intGrade);
		stDto.stTel = stTel;
		
		//stdList.add(stDto);
		return stDto;
	}
	 
	@Override
	public void insertStudent() {
		
		// V2에서 상속받은 V1 의 insertStudent() 를 먼저 
		// 실행해 달라
		// super.insertStudent();
		
		while(true) {
			StudentDto stDto = this.inputStudent();
			if(stDto == null) break;
			stdList.add(stDto);
			int index = 0 ;
			for(index = 0; index < stdList.size(); index++) {
				// inputStudent()가 return 한 dto 하고
				// stdList 의 요소중에서 참조한 dto 하고
				// 주소가 일치하냐?
				// 주소가 일치하다 ==> stdList에 있는 요소이다
				if(stdList.get(index) == stDto) {
					break;
				}
			}
			if(index >= stdList.size()) {
				stdList.add(stDto);
			}
		}
		
		
		// 그리고 나머지는 내가 처리할께
		OutputStream os = null;
		PrintWriter out = null;
		
		try {
			os = new FileOutputStream(Config.STUDENT_FILE);
			out = new PrintWriter(os);
			
			for(StudentDto dto : stdList) {
				out.printf("%s,",dto.stNum);
				out.printf("%s,",dto.stName);
				out.printf("%s,",dto.stDept);
				out.printf("%d,",dto.stGrade);
				out.printf("%s\n",dto.stTel);
			}
			out.close();
			os.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public void loadStudent() {
		
		InputStream is = null;
		Scanner scan = null;
		
		try {
			is = new FileInputStream(Config.STUDENT_FILE);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		scan = new Scanner(is);
		
		int rows = 0;
		while(scan.hasNext()) {
			String line = scan.nextLine();
			String[] student = line.split(",");
			rows ++;
			try {
				StudentDto stDto = new StudentDto();
				stDto.stNum = student[Index.STUDENT.ST_NUM];
				stDto.stName = student[Index.STUDENT.ST_NAME];
				stDto.stDept = student[Index.STUDENT.ST_DEPT];
				stDto.stGrade = Integer.valueOf(student[Index.STUDENT.ST_GRADE]);
				stDto.stTel = student[Index.STUDENT.ST_TEL];
				stdList.add(stDto);
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(rows + " 라인에서 Exception 발생");
			}
		}
		System.out.println("Load 한 데이터 개수 : " + stdList.size());
	}
	
	public void deleteStudent() {
		Scanner scan = new Scanner(System.in);
		System.out.println(Line.dLine(100));
		System.out.println("학생정보 삭제, 삭제할 학번을 입력");
		System.out.print("학번(Enter : 종료) >>");
		String stNum = scan.nextLine();
		if(stNum.equals("")) {
			return;
		}
		StudentDto stDto = null;
	//	for(StudentDto dto : stdList) {
	//		if(dto.stNum.equals(stNum)) {
	//			stDto = dto;
	//			break;
	//		}
	//	}
		
		int index = 0;
		for(index = 0; index < stdList.size(); index++) {
			if(stdList.get(index).stNum.equals(stNum)) {
				System.out.println(Line.sLine(100));
				System.out.println(stdList.get(index));
				System.out.println(Line.sLine(100));
				break;
			}
		}
		
		if(index < stdList.size()) {
			System.out.print("학생정보를 삭제 할까요?(Y 입력시 삭제) >> ");
			String yesNo = scan.nextLine();
			if(yesNo.equals("Y")) {
				stdList.remove(index);
			} 
		}
		return;
		
		// 내가한건디 갮이네
		//StudentDto stDto = this.inputStudent();
		//while(true) {
		//	
		//	System.out.print("삭제할 학번 >>");
		//	String delNum = scan.nextLine();
		//	if(delNum.equals(null)) {
		//		System.out.println("학번을 확인하세요");
		//		continue;
		//		
		//	} else if(delNum.equals(stDto.stNum)) {
		//		System.out.printf("삭제할 데이터는 %s 입니다",stDto.stNum);
		//		System.out.println("정말 삭제할까요?(Y/N)");
		//		String check = scan.nextLine();
		//		if(check.equals("Y")) {
		//			delNum = "";
		//		}
		//	}
		//	break;
		//}
		
	}
	
	
}
