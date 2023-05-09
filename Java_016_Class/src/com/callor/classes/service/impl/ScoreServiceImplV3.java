package com.callor.classes.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.callor.classes.models.ScData;
import com.callor.classes.models.ScoreDto;
import com.callor.classes.models.StdData;
import com.callor.classes.models.StudentDto;
import com.callor.classes.service.ScoreService;

/*
 * interface(class)를 implements 한 클래스는
 * interface에 선언된 모든 method를 의무적으로 구현해야 한다
 * interface에 선언된 method를 한개라도 생략하면
 * 		클래스 코드는 문법오류가 발생하고 실행 불가 상태가 된다
 */


public class ScoreServiceImplV3 implements ScoreService{
	

	// ScData.SCORE 배열을 loading 하여
	// scList 데이터로 변환하기
	
	private List<ScoreDto> scList;
	private List<StudentDto> stdList; 
public ScoreServiceImplV3() {
	scList = new ArrayList<>();
	stdList = new ArrayList<>();
}	
	
	
	@Override
	public void makeScore() {
		for(String str : ScData.SCORE ) {
			
			String[] score = str.split(",");
			ScoreDto scDto = new ScoreDto (
					score[ScData.ST_NUM],
					Integer.valueOf(score[ScData.SC_KOR]),
					Integer.valueOf(score[ScData.SC_ENG]),
					Integer.valueOf(score[ScData.SC_MATH]),
					Integer.valueOf(score[ScData.SC_MUSIC]),
					Integer.valueOf(score[ScData.SC_ART]),
					Integer.valueOf(score[ScData.SC_SOFTWARE]),
					Integer.valueOf(score[ScData.SC_DATABASE])
					);
			scList.add(scDto);
		}
		
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
	}

	@Override
	public void makeScore(List<ScoreDto> scList) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printScore() {
		System.out.println("=".repeat(120));
		System.out.println("학번\t 이름\t 학과\t       국어\t영어\t수학\t음악\t미술\t소프트웨어\t데이터베이스");
		System.out.println("-".repeat(120));
		for(int i = 0; i < 10; i++ ) {
			String[] student = StdData.STUDENT[0].split(",");
			System.out.print(stdList.get(i).stNum + "\t");
			System.out.print(stdList.get(i).stName + "\t");
			System.out.print(stdList.get(i).stDept + "\t");
			System.out.print(scList.get(i).getScKor() + "\t");
			System.out.print(scList.get(i).getScEng() + "\t");
			System.out.print(scList.get(i).getScMath() + "\t");
			System.out.print(scList.get(i).getScMuisc() + "\t");
			System.out.print(scList.get(i).getScArt() + "\t");
			System.out.print(scList.get(i).getScSoftWare() + "\t\t");
			System.out.print(scList.get(i).getScDataBase() + "\n");
		}
		System.out.println("=".repeat(120));
		
	}

	@Override
	public void printScore(List<ScoreDto> scList) {
		// TODO Auto-generated method stub
		
	}

}
