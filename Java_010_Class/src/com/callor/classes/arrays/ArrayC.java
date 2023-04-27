package com.callor.classes.arrays;

public class ArrayC {

	public static void main(String[] args) {
		int[] nums = new int[45];
		// 배열에 1 ~ 45까지 숫자를 순서대로 저장
		for (int i = 0; i < nums.length; i++) {
			nums[i] = i + 1;
		}

		for (int i = 0; i < 1000; i++) {
			int index1 = (int) (Math.random() * nums.length);
			int index2 = (int) (Math.random() * nums.length);
			int _tmp = nums[index1];
			nums[index1] = nums[index2];
			nums[index2] = _tmp;
		}
		for (int i = 0; i < 6; i++) {
			System.out.printf("%d\t", nums[i]);
		}
		System.out.println();

		
		int[] lottos = new int[6];
		
		for (int i = 0; i < lottos.length; i++) {
			lottos[i] = nums[i];
		}
		for (int out = 0; out < lottos.length; out++) {
			for (int in = out + 1; in < lottos.length; in++) {
				if (lottos[out] > lottos[in]) {
					int _tmp = lottos[in];
					lottos[in] = lottos[out];
					lottos[out] = _tmp;
				}
			}
		}
		for (int i = 0; i < 6; i++) {
			System.out.printf("%d\t", lottos[i]);
		}
		System.out.println();

	}

}
