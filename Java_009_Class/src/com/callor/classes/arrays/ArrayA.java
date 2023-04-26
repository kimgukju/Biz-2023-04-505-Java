package com.callor.classes.arrays;

import com.callor.classes.model.ScoreDto;

public class ArrayA {
	
	public static void main(String[] args) {
		ScoreDto 홍길동 = new ScoreDto();
		ScoreDto 이몽룡 = new ScoreDto();
		ScoreDto 성춘향 = new ScoreDto();
		
		홍길동.stName = "홍길동";
		홍길동.stNum = "0001";
		홍길동.stKor = (int)(Math.random()* 50) +  51;
		홍길동.stEng = (int)(Math.random()* 50) +  51;
		홍길동.stMath = (int)(Math.random()* 50) +  51;
		
		이몽룡.stName = "이몽룡";
		이몽룡.stNum = "0002";
		이몽룡.stKor = (int)(Math.random()* 50) +  51;
		이몽룡.stEng = (int)(Math.random()* 50) +  51;
		이몽룡.stMath = (int)(Math.random()* 50) +  51;
		
		성춘향.stName = "성춘향";
		성춘향.stNum = "0003";
		성춘향.stKor = (int)(Math.random()* 50) +  51;
		성춘향.stEng = (int)(Math.random()* 50) +  51;
		성춘향.stMath = (int)(Math.random()* 50) +  51;
		
		System.out.println("학번\t 이름\t 국어\t 영어\t 수학\t 총점\t 평균");
		System.out.println("-".repeat(60));
		System.out.printf("%s\t%s\t %3d\t %3d\t %3d\t %3d\t %2.1f\n", 
				홍길동.stNum, 홍길동.stName, 홍길동.stKor, 홍길동.stEng, 홍길동.stMath, 홍길동.getTotal(), 홍길동.getAvg());
		System.out.printf("%s\t%s\t %3d\t %3d\t %3d\t %3d\t %2.1f\n", 
				이몽룡.stNum, 이몽룡.stName, 이몽룡.stKor, 이몽룡.stEng, 이몽룡.stMath, 이몽룡.getTotal(), 이몽룡.getAvg());
		System.out.printf("%s\t%s\t %3d\t %3d\t %3d\t %3d\t %2.1f\n", 
				성춘향.stNum, 성춘향.stName, 성춘향.stKor, 성춘향.stEng, 성춘향.stMath, 성춘향.getTotal(), 성춘향.getAvg());
		
	}

}
