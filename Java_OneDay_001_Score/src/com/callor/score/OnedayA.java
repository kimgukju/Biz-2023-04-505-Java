package com.callor.score;

public class OnedayA {

	public static void main(String[] args) {
		// 가.학생수 10명 지정
		// 학생수마다 n번 학생이라고 명명했음
		String[] student = new String[10];
		for (int i = 0; i < student.length; i++) {
			student[i] = (i+1)+ "번 학생";
		}

		// 다. ScoreDto 클래스를 배열로 선언하여
		// 각 학생의 학번과 점수 저장
		ScoreDto[] scores = new ScoreDto[10];
		for (int i = 0; i < scores.length; i++) {
			scores[i] = new ScoreDto();
		}
		
		for (int i = 0; i < scores.length; i++) {
			// 콘솔엔 학생이름 안넣었지만 10명학생에게
			// 1번~10번 학생이라고 이름 넣음
			scores[i].stName = student[i]; 
			scores[i].stNum = String.format("%05d", 23000 + (i+1));
		}
		
		// 라. 각 과목의 성적은 51 ~ 100까지 random 정수 생성
		// 아에서 만든 ScoreService 생성후 실행
		ScoreService scService = new ScoreService();
		int sumKor = 0;
		int sumEng = 0;
		int sumMath = 0;
		int sumMusic = 0;
		int sumArt = 0;
		int sumTotal = 0;
		float sumAvg = 0;
		for (int i = 0; i < scores.length; i++) {
			scores[i].stKor = scService.getScore(); 
			scores[i].stEng = scService.getScore();
			scores[i].stMath = scService.getScore();
			scores[i].stMusic = scService.getScore();
			scores[i].stArt = scService.getScore();
			sumKor += scores[i].stKor;
			sumEng += scores[i].stEng;
			sumMath += scores[i].stMath;
			sumMusic += scores[i].stMusic;
			sumArt += scores[i].stArt;
			sumTotal += scores[i].getTotal();
			sumAvg += scores[i].getAvg();
		}
		// 마. 성적정보 출력
		// 사. 평균점수 소수점 이하 2째 자리까지 
		// 자. 출력 
		System.out.println("=".repeat(100));
		System.out.println("* 한울 고교 성적 리스트 *");
		System.out.println("=".repeat(100));
		System.out.println("학번\t\t 국어\t 영어\t 수학\t 음악\t 미술\t 총점\t 평균");
		System.out.println("-".repeat(100));
		for(int i = 0; i < scores.length; i++) {
			scService.printScore(scores[i]);
		}
		System.out.println("-".repeat(100));
		scService.printTotalScore(sumKor,sumEng,sumMath,sumMusic,sumArt,sumTotal);
		scService.printTotalAvg(sumKor,sumEng,sumMath,sumMusic,sumArt,sumAvg);
		System.out.println("=".repeat(100));
	}

}
