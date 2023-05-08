package com.callor.classes.service;

import java.util.List;

import com.callor.classes.models.ScoreDto;

public class ScoreServiceV1 {

	private int classSize = 10;

	/*
	 * 매개변수로 일반 변수가 아닌 참조형 객체 변수를 사용했다
	 * 참조형 객체변수는 실제 저장된 값이 전달되는 것이 아니고
	 * 기억장소의 주소가 전달된다
	 * 
	 * main() method 에서 보낼때 scoreList 의 주소가 전달되고
	 * makeScore() 에서 값을 변경시키면 main() method 의 scoreList 가
	 * 같이 변경되는 성질을 갖게 된다
	 */
	public void makeScore(List<ScoreDto> scoreList) {
		for (int i = 0; i < classSize; i++) {
			// 001, 002 형식으로 학번 문자열 만들기
			String stNum = String.format("%03d", i + 1);
			int scKor = (int) (Math.random() * 50) + 51;
			int scMath = (int) (Math.random() * 50) + 51;
			int scMusic = (int) (Math.random() * 50) + 51;
			int scArt = (int) (Math.random() * 50) + 51;

			/*
			 * 배열에서는 먼저 배열선언, 배열초기화 각 요소에 데이터 저장 List type의 데이터 1. 먼저 비어있는(blank) List type을
			 * 생성 2. Dto 객체변수를 생성하고 3. Dto 각 변수에 값을 setting(setter) 4. List에 Dto를 add
			 */
			ScoreDto scoreDto = new ScoreDto();
			scoreDto.setStNum(stNum);
			scoreDto.setScKor(scKor);
			scoreDto.setScMath(scMath);
			scoreDto.setScMusic(scMusic);
			scoreDto.setScArt(scArt);
			scoreList.add(scoreDto);

		}

	} // makeScore() end
	
	/*
	 * =========================================
	 * 학번		국어	수학	음악	미술
	 * -----------------------------------------
	 */
	public void printScore(List<ScoreDto> scList) {
		System.out.println("=".repeat(70));
		System.out.print("학번	국어	수학	음악	미술	총점\n");
		System.out.println("-".repeat(70));
		for(int i = 0; i < scList.size(); i++ ) {
			System.out.print(scList.get(i).getStNum() + "\t");
			System.out.print(scList.get(i).getScKor() + "\t");
			System.out.print(scList.get(i).getScMath() + "\t");
			System.out.print(scList.get(i).getScMusic() + "\t");
			System.out.print(scList.get(i).getScArt() + "\t");
			System.out.print(scList.get(i).getTotal() + "\t");
			System.out.println();
			
		}
		System.out.println("-".repeat(70));
	}
	
	// scList 데이터를 총점을 기준으로 오름차순 정렬하기 
	public void sortScore(List<ScoreDto> scList) {
		for(int out = 0; out < scList.size(); out++) {
			for(int in = out+1; in < scList.size(); in++) {
				if(scList.get(out).getTotal() > scList.get(in).getTotal() ) {
					ScoreDto scDto = scList.get(out);
					scList.set(out, scList.get(in));
					scList.set(in,scDto);
				}
				
			}
		}
	}
	public void add(int num1, int num2) {
		num1 = 1000;
		num2 = 2000;

	}
}
