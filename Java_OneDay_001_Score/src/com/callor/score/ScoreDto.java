package com.callor.score;

public class ScoreDto {
	// 나. 국어, 영어, 수학, 음악, 미술 성적
	// 저장할 ScoreDto 클래스 모델링
	public int stKor; // 국어
	public int stEng; // 영어
	public int stMath; // 수학
	public int stMusic; // 음악
	public int stArt; // 미술
	
	public String stName; // 학생이름
	public String stNum; // 학번
	
	// 한학생의 성적 총합 method
	public int getTotal() {
		int getTotal = this.stKor;
		getTotal += this.stEng;
		getTotal += this.stMath;
		getTotal += this.stMusic;
		getTotal += this.stArt;
		return getTotal;
	}
	
	// 한 학생의 성적 평균 method
	public float getAvg() {
		float getAvg = (float) this.getTotal()/7;
		return getAvg;
	}

}
