package com.callor.classes.arrays;

public class ArrayE {

	public static void main(String[] args) {
		int[] nums = new int[10];

		for (int i = 0; i < 10; i++) {
			nums[i] = i + 1;
		}

		for (int i = 0; i < 10; i++) {
			if (nums[i] % 2 == 0) {
				System.out.println("저장된 짝수 : " + nums[i]);
			}
		}

		for (int i = 0; i < 10; i++) {
			int index = 0;
			for (index = 2; index < nums[i]; index++) {
				if (nums[i] % index == 0) {
					break;
				} 
			}
			if(nums[i] <= index) {
				System.out.println("저장된 수 중 소수(prime) : " + nums[i]);
			}

			// int sum = 0;
			// for(int i =0; i < 10; i++ ) {
			// sum += (i+1);
			// }
		}
	}
}
