package com.callor.score;

public class OnedayRe {
	
	public static void main(String[] args) {
		String[] stName = new String[10];
		for(int i = 0; i < stName.length; i++) {
			stName[i] = (i+1) + "번 학생";
		}
		
		ScoreDto[] scoreDto = new ScoreDto[10];
		for(int i = 0; i < scoreDto.length; i++) {
			scoreDto[i] = new ScoreDto();
		}
		
		for(int i = 0; i < scoreDto.length; i++) {
			scoreDto[i].stNum = String.format("ABC%03d", (i+1));
			scoreDto[i].stName = stName[i];
		}
		
		ScoreService scService = new ScoreService();
		for(int i = 0; i < scoreDto.length; i++) {
			scoreDto[i].intKor = scService.getScore();
			scoreDto[i].intEng = scService.getScore();
			scoreDto[i].intMath = scService.getScore();
		}
		System.out.println("=".repeat(80));
		System.out.println("\t\t\t\t성적표");
		System.out.println("=".repeat(80));
		System.out.println("학번\t\t 학생이름\t 국어\t 영어\t 수학\t 총점\t 평균");
		System.out.println("-".repeat(80));
		for(int i = 0; i < scoreDto.length; i++) {
			scService.printScore(scoreDto[i]);
		}
		
		
		
	
		
	}

}
