package com.callor.controller.var;

public class VarD {
	
	public static void main(String[] args) {
		/*
		 * String은 일반적인 변수를 생성하는 키워드가 아니다
		 * String은 특이하게 class 이다
		 * class를 사용하여 만든 변수를 
		 * 인스턴스, Object 라고 한다 
		 */
		String str1 = "Republic";
		String str2 = "Of";
		String str3 = "Korea";
		int num1 = 30;
		
		System.out.printf("%s %s %s\n",str1,str2,str3);
		System.out.println(str1.toUpperCase()); 
		//str1.toUpperCase  str1값을 모두 대문자로
		System.out.println(str1.toLowerCase());
		//str1.toLowerCase  str1값을 모두 소문자로
	}

}
