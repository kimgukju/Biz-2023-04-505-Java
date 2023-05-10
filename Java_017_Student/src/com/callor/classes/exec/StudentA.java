package com.callor.classes.exec;

import com.callor.classes.service.StudentService;
import com.callor.classes.service.impl.StudentServiceImplV2;

public class StudentA {

	public static void main(String[] args) {
		StudentService scService = new StudentServiceImplV2();
		scService.loadStudent();
		scService.printStudent();
		
	}
}
