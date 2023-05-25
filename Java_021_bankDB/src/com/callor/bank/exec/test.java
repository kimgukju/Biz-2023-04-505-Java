package com.callor.bank.exec;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class test {
	
	public static void main(String[] args) {
		LocalDate localDate = LocalDate.now();
		LocalTime localTime = LocalTime.now();
		
//		LocalDateTime localDateTime = LocalDateTime.now();
		
		DateTimeFormatter dateFormat1 = DateTimeFormatter.ofPattern("YYYY-MM-dd");
		DateTimeFormatter timeFormat1 = DateTimeFormatter.ofPattern("HH:mm:ss");

		System.out.println( localDate.format(dateFormat1) );
		System.out.println( localTime.format(timeFormat1) );
		
//		System.out.println( localDateTime.format(dateFormat1) );
//		System.out.println( localDateTime.format(timeFormat1) );
		
	}

}
