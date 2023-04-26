package com.callor.classes.arrays;

import com.callor.classes.model.ScoreDto;
import com.callor.classes.service.ScoreServiceA;

public class ArrayD {
	/*
	 * class type의 객체(변수) 배열 만들기
	 * ClassName object = new ClassName[10]
	 * class type의 배열은 일반 변수 배열과 달리
	 * 즉시 사용할 수 없다. 동시에 초기화 되지 않는다.
	 * 별도로 배열 요소를 초기화 시키는 코드가 필요하다
	 */
	public static void main(String[] args) {
		// ScoreDto type 요소 10을 갖는 배열 선언
		ScoreDto[] scores = new ScoreDto[10];
		ScoreServiceA scoreService = new ScoreServiceA();
		// class type의 배열 요소 전체를 객체 요소로 생성하기
		for(int index = 0; index < scores.length; index++) {
			scores[index] = new ScoreDto();
			
		}
		
		scores[0].stName = "홍길동";
		scores[1].stName = "이몽룡";
		scores[2].stName = "성춘향";
		scores[3].stName = "장보고";
		scores[4].stName = "임꺽정";
		scores[5].stName = "김철수";
		scores[6].stName = "김희경";
		scores[7].stName = "이기동";
		scores[8].stName = "박철수";
		scores[9].stName = "한동후";
		//scores[0].stNum = "0001";
		//scores[0].stName = "홍길동";
		System.out.println("=".repeat(70));
		System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("=".repeat(70));
		int korTotal = 0;
		int engTotal = 0;
		int mathTotal = 0;

		for(int i = 0; i < scores.length; i++) {
			scores[i].stNum = "000" + (i+1) ;
			scores[i].stKor = scoreService.getScore();
			scores[i].stEng = scoreService.getScore();
			scores[i].stMath = scoreService.getScore();
			scoreService.scorePrint(scores[i]);
			korTotal += scores[i].stKor;
			engTotal += scores[i].stEng;
			mathTotal += scores[i].stMath;
		}
		System.out.println("-".repeat(70));
		scoreService.scoreTotalPrint(korTotal, engTotal, mathTotal);		
	}

}
