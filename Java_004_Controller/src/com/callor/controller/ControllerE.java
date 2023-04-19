package com.callor.controller;

public class ControllerE {

	/*
	 * 51~100까지 랜덤 수 1개를 만들고
	 * 이 수가 소수(Prime)수 가 아닌지 찾기
	 * Prime : 1과 자신 이외의 약수를 갖지 않는 수
	 * 		2 ~ (자신-1) 범위의 정수로 각각 나누었을 때
	 * 		나머지가 한번도 0이 아닌 수
	 * 
	 * 		나머지가 한번이라도 0이 되면 prime이 아니다
	 * 
	 */
	public static void main(String[] args) {
		int intRnd = (int) (Math.random() * 50) + 51;
		// 이 for() 명령문에 의해
		// index 값은 2부터 rndNum-1까지 연속된
		// 정수로 만들어져 for() {} 에서 사용가능하다
		for (int i = 2; i < intRnd; i++) {
			if (intRnd % i == 0) {
				System.out.print(intRnd + " : ");
				System.out.print(i + "로 나누면 나머지가 ");
				System.out.print(intRnd % i);
				System.out.println("이 수는 소수가 아님");
				// 반복문을 수행하며 연산을 실행하는 과정에서
				// 소수가 아님을 판별하면 더 이상 반복문을
				// 진행할 필요가 없으므로 여기 중단
				// break는 : for () 반복문을 중단할 때
				//		for() 반복문 밖에 사용할 수 없음
				break;
			}
		}
	}
}
