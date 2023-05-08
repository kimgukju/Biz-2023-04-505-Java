package com.callor.classes.exec;

public class ClassB {
	
	public static void main(String[] args) {
		int[] nums = new int[10];
		
		for(int i = 0; i < nums.length; i++) {
			nums[i] = (int)(Math.random() * 50) + 51;
		}
				
		for(int out = 0; out < nums.length; out++) {
			for(int in = out+1; in < nums.length; in++) {
				if(nums[out] > nums[in]) {
					int _temp = nums[in];
					nums[in] = nums[out];
					nums[out] = _temp;
				}
			}
		}
		for(int i = 0; i < nums.length; i++) {
			System.out.printf("%d\t",nums[i]);
		}
	}

}
