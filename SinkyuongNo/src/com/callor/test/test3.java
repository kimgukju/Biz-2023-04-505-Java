package com.callor.test;

import java.util.ArrayList;
import java.util.List;

public class test3 {
	
	public static int prime(int num) {
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return 0;
			}
		}
		return num;
	}
	
	public static void main(String[] args) {
		
		List<Integer> numList = new ArrayList<>();
		int[] nums = new int[30];
		for(int i = 0; i < 30; i++) {
			nums[i] = (int)(Math.random() * 50) + 51;
		}
		int j = 0; int pSum = 0;
		for(int i = 0; i < nums.length; i++) {
			int result = prime(nums[i]);
			if(result > 0) {
				j++;
				pSum += nums[i];
				//System.out.println("소수" + result);
			}
		}
		System.out.println("소수 개수 : " + j);
		System.out.println("소수의 합 : " + pSum);
	}
}
