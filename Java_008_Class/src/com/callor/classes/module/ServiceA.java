package com.callor.classes.module;

public class ServiceA {
	
	public void score(int kor, int eng, int math, int history, int music,
			int art, int sport) {
		int total = kor + eng + math + history + music + art + sport;
		float avg = (float)total/7;
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + math);
		System.out.println("국사 : " + history);
		System.out.println("음악 : " + music);
		System.out.println("미술 : " + art);
		System.out.println("체육 : " + sport);
		System.out.printf("총점 : %d\t 평균 : %2.1f", total, avg);
		
	}

}
