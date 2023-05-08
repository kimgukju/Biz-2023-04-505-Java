package com.callor.classes.exec;

import java.util.ArrayList;
import java.util.List;

public class ClassH {
	
	public static void main(String[] args) {
		// java 1.7 이후 버전에서는 생성자에는 Generic을 생략해도 된다
		List<Integer> numList = new ArrayList<>();
		
		for(int i = 0; i < 10; i++) {
			int rndNum = (int)(Math.random()*51) + 50;
			numList.add(rndNum);
			System.out.println(numList.get(i));
		}
		
		// out100,  in50  tmp>> 50
		for(int out = 0; out < numList.size(); out++) {
			for(int in = out + 1; in < numList.size(); in ++) {
				if(numList.get(out) > numList.get(in)) {
					//int tmp = numList.get(in);
					//numList.remove(in);
					//numList.add(out,tmp);
					int num = numList.get(out);
					numList.set(out, numList.get(in));
					numList.set(in, num);
				}
			}
		}
		// List type의 객체변수에는 toString() method가 포함되고
		// 단순히 List의 값들을 출력 해 볼 수 있다.
		System.out.println(numList.toString());
		
	}

}
