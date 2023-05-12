package com.callor.test;

public class test1 {
	
	public static void main(String[] args) {
		int i = 0; 
		while(true) {
			for(i=0; i<100; i++) {
				int num = (int)(Math.random()*120) +1;
				if(num < 1 || num > 100 ) {
					System.out.println("테스트 횟수" + i);
					System.out.println(i + "번째에서 끝남");
					System.out.println(num + "숫자가 넘음");
					break;
				} else if(1 <= num && num <=100) {
					i++;
					//System.out.println("테스트 횟수 : " + i);
				}
			}
			System.out.println("테스트 횟수 : " + i);
			break;
		}
	}
}
