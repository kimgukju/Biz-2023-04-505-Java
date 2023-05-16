package com.callor.student.exec;

import com.callor.student.service.StudentService;
import com.callor.student.service.impl.StudentServiceImplV2;

public class StudentExecF {
	
	public static void main(String[] args) {
		StudentService stdService = new StudentServiceImplV2();
		
		stdService.insertStudent();
		stdService.loadStudent();
		stdService.printStudent();
		
	
	}

}
