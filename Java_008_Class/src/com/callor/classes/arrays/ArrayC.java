package com.callor.classes.arrays;

public class ArrayC {
	
	public static void main(String[] args) {
		int[] nums = new int[10];
		
		nums[0] = 33;
		nums[1] = 35;
		nums[2] = 59;
		nums[3] = 77;
		nums[4] = 90;
		nums[5] = 50;
		nums[6] = 44;
		nums[7] = 57;
		nums[8] = 98;
		nums[9] = 78;
		
		
		System.out.println(nums[0]); // num0 
		System.out.println(nums[1]); // num1
		System.out.println(nums[2]); // num2
		System.out.println(nums[3]); // num3
		System.out.println(nums[4]); // num4
		System.out.println(nums[5]); // num5
		System.out.println(nums[6]); // num6
		System.out.println(nums[7]); // num7
		System.out.println(nums[8]); // num8
		System.out.println(nums[9]); // num9
		
		// num0, num1, num2
		for(int index =0; index<10; index++) {
			System.out.println( nums[index] );
			// System.out.println( numsindex); 'numsindex' 라는 변수로 인식해서 실행X
		}
		
	}

}
