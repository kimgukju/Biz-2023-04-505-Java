package com.callor.classes.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.callor.classes.models.StdData;
import com.callor.classes.models.StudentDto;
import com.callor.classes.service.StudentService;

public class StudentServiceImplV1 implements StudentService {
	
	// 클래스 영역에 필드 변수로 StudentDto List type 으로
	// stdList 객체 선언
	private List<StudentDto> stdList; 
	
	public StudentServiceImplV1() {
		// 기본 생성자에서 객체를 초기화(사용할 수 있도록 생성)
		stdList = new ArrayList<>();
	}

	@Override
	public void loadStudent() {
		// STUDENT 문자열 배열 데이터를 forEach(확장 for)를
		// 분해하여 개별 문자열 str 담고 for() {} 에 전달하기
		for(String str : StdData.STUDENT) {
			
			// str 문자열 변수에 저장된 문자열을 컴마(,) 기준으로 다시 분해
			// student 배열에 저장하기
			String[] student = str.split(",");
			// StudentDto class type의 stDto 객체를 생성하고
			// StudentDto type 의 객체를 생성하고
			StudentDto stDto = new StudentDto();
			// student 배열의 각 요소를 Student type 객체 요소(변수)에
			// 저장하기 
			stDto.stNum = student[StdData.ST_NUM];
			stDto.stName = student[StdData.ST_NAME];
			stDto.stDept = student[StdData.ST_DEPT];
			stDto.stGrade = Integer.valueOf(student[StdData.ST_GRADE]);
			stDto.stTel = student[StdData.ST_TEL];
			stDto.stAddress = student[StdData.ST_ADDRESS];
			// List<StudentDto> type의 리스트에 추가하기 
			stdList.add(stDto);
		}
		
		
		
		//for (int i = 0; i < StdData.STUDENT.length; i++) {
		//	String[] student = StdData.STUDENT[i].split(",");
		//	StudentDto stDto = new StudentDto();
		//	stDto.stNum = student[StdData.ST_NUM];
		//	stDto.stName = student[StdData.ST_NAME];
		//	stDto.stDept = student[StdData.ST_DEPT];
		//	stDto.stGrade = Integer.valueOf(student[StdData.ST_GRADE]);
		//	stDto.stTel = student[StdData.ST_TEL];
		//	stDto.stAddress = student[StdData.ST_ADDRESS];
		//	stdList.add(stDto);
		//}

	}


	@Override
	public void printStudent() {
		System.out.println("=".repeat(120));
		System.out.print("학번\t 이름\t  학과\t      학년\t  전화번호\t\t 주소\n");
		System.out.println("-".repeat(120));
		for(StudentDto dto : stdList) {
			System.out.printf("%s\t", dto.stNum);
			System.out.printf("%s\t", dto.stName);
			System.out.printf("%s\t", dto.stDept);
			System.out.printf("%s\t", dto.stGrade);
			System.out.printf("%s\t", dto.stTel);
			System.out.printf("%s\n", dto.stAddress);
		}
		//for(int i =0; i < stdList.size(); i++) {
		//	// stdList에 저장했는데 저장한걸로 해봐야지 ㅇㅇ 
		//	//String[] student = StdData.STUDENT[i].split(",");
		//	//System.out.print(student[StdData.ST_NUM] + "\t");
		//	//System.out.print(student[StdData.ST_NAME] + "\t");
		//	//System.out.print(student[StdData.ST_DEPT] + "\t");
		//	//System.out.print(student[StdData.ST_GRADE] + "\t");
		//	//System.out.print(student[StdData.ST_TEL] + "\t");
		//	//System.out.print(student[StdData.ST_ADDRESS] + "\n");
		//	System.out.print(stdList.get(i).stNum + "\t");
		//	System.out.print(stdList.get(i).stName + "\t");
		//	System.out.print(stdList.get(i).stDept + "\t");
		//	System.out.print(stdList.get(i).stGrade + "\t");
		//	System.out.print(stdList.get(i).stTel + "\t");
		//	System.out.print(stdList.get(i).stAddress + "\n");
		//}
		System.out.println("=".repeat(120));

	}

	/*
	 * stdList 에서 stNum 학번의 학생데이터를 찾아서
	 * 학생데이터를 return 
	 */
	@Override
	public StudentDto getStudent(String stNum) {
		for(StudentDto dto : stdList) {
			if(dto.stNum.equals(stNum)) {
				return dto;
			}
		}
		return null;
	}

}
