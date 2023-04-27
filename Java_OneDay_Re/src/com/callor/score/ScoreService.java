package com.callor.score;

public class ScoreService {
	
	public int getScore() {
		int score = (int)(Math.random() * 50) +51;
		return score;
	}
	
	public void printScore(ScoreDto score) {
		System.out.printf("%s\t\t %s\t %d\t %d\t %d\t %d\t %2.2f\n",
				score.stNum, score.stName, score.intKor, score.intEng,
				score.intMath, score.scoreTotal(), score.scoreAvg());
	}

}
