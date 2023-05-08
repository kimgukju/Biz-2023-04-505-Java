package com.callor.classes.exec;

import java.util.ArrayList;
import java.util.List;

public class NumbersD {
	
	public static void main(String[] args) {
		List<Integer> numList = new ArrayList<>();
		for(int i = 0; i < 45; i++ ) {
			numList.add(i+1);
		}
		
		// List shuffle 하기 
		for(int i = 0; i < 555; i++ ) {
			int index1 = (int)(Math.random() * numList.size());
			int index2 = (int)(Math.random() * numList.size());
			int temp = numList.get(index1);
			numList.set(index1, numList.get(index2));
			numList.set(index2, temp);
		}
		
		for(int i = 0; i < numList.size(); i++) {
			System.out.print(numList.get(i)+" ");
		}
		
		
		
		
		
	}

}
