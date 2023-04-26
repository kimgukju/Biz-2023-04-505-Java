package com.callor.classes.exec;

public class ExecK {
	
	public static void main(String[] args) {
		int[] nums = new int[50];
		for(int i = 0; i < nums.length; i++) {
			nums[i] = (int)(Math.random() * 50) + 51;
		}
		
		// i 이 변화되는 정도
		// 시작값이 0, 종료값이 i < nums.length
		// i : 0 ~ (nums.length - 1 ), 0 ~ 49까지 변화
		for(int i = 0; i < nums.length ; i++ ) {
			System.out.print(nums[i]+ "\t");
			// i+1 : i 가 0부터 시작하는데 1부터 시작하도록 만드는 연산
			if((i+1) % 5 == 0) {
				System.out.println();
			}
			
				
		}
				
	}

}
