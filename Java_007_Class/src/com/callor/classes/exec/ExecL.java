package com.callor.classes.exec;

import com.callor.classes.module.ServiceC;

public class ExecL {
	
	public static void main(String[] args) {
		int num = (int)(Math.random()*10);
		ServiceC serviceC = new ServiceC();
		// num 변수에 저장된 값을 전달하면서
		// 구구단을 출력해줘 라는 요청
		// == guguDan() method 호출
		// 여기서는 2이상의 수의 구구단만 호출
		if(num >=2 && num <=9 ) {
			serviceC.guguDan(num);
		} 
	}

}
