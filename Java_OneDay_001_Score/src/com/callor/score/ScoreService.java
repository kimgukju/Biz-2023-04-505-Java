package com.callor.score;

public class ScoreService {
	// 아. 점수생성, 점수출력 ScoreService 생성후 method 정의후 실행
	
	// 점수생성 method
	public int getScore() {
		int score = (int)(Math.random() * 50) + 51;
		return score;
	}
	
	// 점수출력 method
	public void printScore(ScoreDto score) {
		System.out.printf("%s\t\t %d\t %d\t %d\t %d\t %d\t %d\t %2.2f\n", 
				score.stNum, score.stKor, score.stEng, score.stMath, 
				score.stMusic, score.stArt, score.getTotal(), score.getAvg());
	}
	
	public void printTotalScore(int sKor, int sEng, int sMath, int sMusic,
								int sArt, int sTotal) {
		System.out.printf("총점\t\t %d\t %d\t %d\t %d\t %d\t %d\n",
							sKor, sEng, sMath, sMusic, sArt, sTotal);
	}
	
	public void printTotalAvg(float sKor, float sEng, float sMath, float sMusic,
			  			      float sArt, float sAvg) {
		System.out.printf("평균\t\t %2.2f\t %2.2f\t %2.2f\t %2.2f\t %2.2f\t\t %2.2f\n",
				sKor/10, sEng/10, sMath/10, sMusic/10, sArt/10, sAvg/10);	}

}
