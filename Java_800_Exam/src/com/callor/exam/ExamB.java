package com.callor.exam;

import com.callor.exam.impl.GuideServiceImplV1;
import com.callor.exam.services.GuideService;

public class ExamB {
	
	public static void main(String[] args) {
		GuideService guService = new GuideServiceImplV1();
		guService.loadGuide();
		guService.printGuide();
	
	}

}
