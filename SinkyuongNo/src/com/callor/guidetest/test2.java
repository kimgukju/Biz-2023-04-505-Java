package com.callor.guidetest;

import com.callor.guidetest.service.GuideService;
import com.callor.guidetest.service.impl.GuideServiceImplV1;

public class test2 {
	
	public static void main(String[] args) {
		GuideService gService = new GuideServiceImplV1();
		gService.loadGuide();
		gService.printGuideList();
	}

}
