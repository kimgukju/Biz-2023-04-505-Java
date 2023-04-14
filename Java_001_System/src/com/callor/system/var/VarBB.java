package com.callor.system.var;

public class VarBB {
	
	public static void main(String[] args) {
		
		int intNum1 = 0;
		float floatNum1 = 0.0f;
		
		intNum1 = 10;
		floatNum1 = intNum1 +10; 
		floatNum1 = floatNum1 + 1.2f; 
		System.out.println(floatNum1); // 21.2f
		
		floatNum1 = floatNum1 + 0.5f;
		System.out.println(floatNum1); // 21.7f
		
		// java는 
		// float를 int로 강제형변환 할때
		// 소수점 이하를 무조건 버린
		intNum1 = (int)floatNum1;
		System.out.println(intNum1); // 21
		
	}

}
