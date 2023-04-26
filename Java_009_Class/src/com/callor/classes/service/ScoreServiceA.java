package com.callor.classes.service;

import com.callor.classes.model.ScoreDto;

public class ScoreServiceA {
	
	public int getScore() {
		int score = (int)(Math.random() * 50) + 51;
		return score;
	}
	
	public void scorePrint(ScoreDto score) {
		System.out.printf("%s\t%s\t %3d\t %3d\t %3d\t %3d\t %2.1f\n", 
				score.stNum, score.stName, score.stKor, score.stEng, score.stMath, score.getTotal(), score.getAvg());
	}
	
	public void scoreTotalPrint(int kor, int eng, int math) {
		System.out.printf("\t \t %3d\t %3d\t %3d\t %3d\t ", 
				kor, eng, math, kor+eng+math);
	}

}
