package com.callor.classes.arrays;

public class ArrayF {
	/*
	 * prime() method 에게 정수값 1개를 전달하고
	 * 그 정수값이 소수인지 아닌지 알려줘 라고 요청
	 */

	// class 밖에다 선언하는 멍청한짓 ㄴㄴ
	public static int prime(int num) {
		int rNum = num;
		for (int i = 2; i < rNum; i++) {
			if (rNum % i == 0) {
				return 0;
			}
		}
		return rNum;
	}
	
	/*
	 * 다수의 데이터를 정보처리할 경우
	 * 데이터를 수집하고, 수집이 완료되었을때
	 * 한꺼번에 처리를 한다
	 * 
	 * 실시간 처리 : 데이터가 발생하는 즉시 처리, 티켓예매
	 * 배치(Batch) 처리 : 데이터를 모두 수집하고
	 * 		수집이 완료되었을때 처리, 급여계산, 인구통계
	 * 
	 */

	public static void main(String[] args) {
		int[] nums = new int[10];
		for (int i = 0; i < 10; i++) {
			nums[i] = (int) (Math.random() * 50) + 51;
		}

		for (int i = 0; i < 10; i++) {
			if(prime(nums[i]) > 0) {
				System.out.println("는 소수 : " + nums[i]);
			} else {
				System.err.println("는 소수 아님 : " + nums[i]);
			}

		}
	}
}