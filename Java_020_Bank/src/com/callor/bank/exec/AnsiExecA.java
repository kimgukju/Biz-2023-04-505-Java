package com.callor.bank.exec;

import com.callor.bank.utils.AnsiConsol;


//글씨색 바꾸려는거 참고자료 선생님 github - Reference - AnsiConsol.java 이용
public class AnsiExecA {
	
	public static void main(String[] args) {
		
		System.out.println(AnsiConsol.green + "Republic" + AnsiConsol.exit);
		
		System.out.println(AnsiConsol.GREEN("대한민국 만세"));
		System.out.println(AnsiConsol.BLUE("대한민국 만세"));
		System.out.println(AnsiConsol.CYAN("대한민국 만세"));
		System.out.println(AnsiConsol.WHITE("대한민국 만세"));
		
		System.out.println(AnsiConsol.message("RED","대한민국 만세"));
	}

}
