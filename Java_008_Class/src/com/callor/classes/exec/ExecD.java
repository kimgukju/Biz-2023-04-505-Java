package com.callor.classes.exec;

import com.callor.classes.model.ScoreDto;

public class ExecD {
	
	public static void main(String[] args) {
		ScoreDto 학생A = new ScoreDto();
		ScoreDto 학생B = new ScoreDto();
		ScoreDto 학생C = new ScoreDto();
		ScoreDto 학생D = new ScoreDto();
		ScoreDto 학생E = new ScoreDto();
		
		학생A.intKor = (int)(Math.random()*50) + 51;
		학생B.intKor = (int)(Math.random()*50) + 51;
		학생C.intKor = (int)(Math.random()*50) + 51;
		학생D.intKor = (int)(Math.random()*50) + 51;
		학생E.intKor = (int)(Math.random()*50) + 51;
		
		int total = 학생A.intKor;
		total += 학생B.intKor;
		total += 학생C.intKor;
		total += 학생D.intKor;
		total += 학생E.intKor;
		float avg = (float) total/5;
		
		System.out.println("학생 5명의 국어 총점 : " + total);
		System.out.println("학생 5명의 국어 평균 : " + avg);
		
	}

}
