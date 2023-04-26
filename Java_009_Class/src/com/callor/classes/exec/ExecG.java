package com.callor.classes.exec;

public class ExecG {

	// 매개변수 num 변수로 전달받은 값이
	// prime 이면 num를 아니면 0을 return 하는 method 선언
	public static int prime(int num) {
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return 0;
			}
		}
		return num;
	}

	public static void main(String[] args) {
		int[] nums = new int[50];

		for (int i = 0; i < nums.length; i++) {
			nums[i] = (int) (Math.random() * 50) + 51;
		}

		for (int i = 0; i < nums.length; i++) {
			// prime() method야 nums 배열의 index번째 요소(값을)
			// 너에게 보내니(전달하니) 그 값이 prime 수 인지 알려줘
			// 만약 nums[index] 
			//		값이 prime 이라면 
			//			result에 저장된 값은? nums[index]와 같은 값
			//		값이 prime 아니라면
			//			result에 저장된 값은? 0
			int result = prime(nums[i]);
			if (result > 0) {
				System.out.println("Prime 수 : " + result);
			}
		}

	}
}
