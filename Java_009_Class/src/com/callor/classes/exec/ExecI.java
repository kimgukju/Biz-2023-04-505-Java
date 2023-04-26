package com.callor.classes.exec;

public class ExecI {
	
	public static void main(String[] args) {
		int[] nums = new int[50];
		for(int i = 0; i < nums.length; i++) {
			nums[i] = (int)(Math.random() * 50) + 51;
		}
	
		int lastNum = 0;
		/*
		 * lastIndex 초기화를 0으로 실행할 경우
		 * 만약 배열에 담긴 값중에 3의 배수가 하나도 없을 경우
		 * lastIndex는 그대로 0이 될 것이고
		 * 결과 출력에서 0의 index 와 index 0의 요소값이 출력될 것이다.
		 * 이러한 논리적인 문제를 해결하기 위하여 
		 * lastIndex 를 -1 로 초기화하고 
		 * 결과 출력부분에서 lastIndex 의 값을 
		 * 			한번 더 검사할 필요가 있다.
		 */
		int lastIndex = -1; // 3의배수가 없다면 0으로 선언시 0으로 나오니까
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] % 3 == 0 ) {
				lastIndex = i;
				lastNum = nums[i];
			}
		}
		if(lastIndex > -1) {
			System.out.println("3의 배수 가장 마지막 위치의 index값 : " + lastIndex);
			System.out.println("3의 배수 가장 마지막 위치의 값 : " + lastNum);
		} else {
			System.out.println("3의 배수 없음");
		}
		
		/*
		 * index 시작값 : nums.length = 50
		 * index 종료값이 index > 0 조건이 있어서 index 1 일 경우에
		 * 		for() 종료
		 * 49,48,47,46, . . . 0 까지 index 값을 생성해야하 하는데
		 * 여기 코드는 50,49,48,47, . . . 1까지 index 생성되고 있다
		 * 시작하자마자 nums[50] 요소의 값을 읽으려고 시도한다
		 * Index OutofBounds 오류 발생
		 */
		// for(int index = nums.length; index > 0 ; index --) {
		for(int index = nums.length - 1; index >= 0 ; index --) {
			if(nums[index] % 3 == 0 ) {
				System.out.println("마지막 3의 배수 : " + nums[index]);
				System.out.println("위치 : " + index);
			}
		}
			
		
	}

}
