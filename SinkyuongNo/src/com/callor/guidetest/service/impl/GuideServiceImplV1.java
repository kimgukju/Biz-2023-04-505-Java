package com.callor.guidetest.service.impl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.security.DrbgParameters.NextBytes;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.guidetest.model.GuideDto;
import com.callor.guidetest.service.GuideService;

public class GuideServiceImplV1 implements GuideService{
	
	List<GuideDto> guidelist;
	
	public GuideServiceImplV1() {
		guidelist = new ArrayList<>();
	}

	@Override
	public void loadGuide() {
		String guideFile = "src/com/callor/guidetest/data/guide.txt";
		InputStream is = null;
		Scanner scan = null;
		
		try {
			is = new FileInputStream(guideFile);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		scan = new Scanner(is);
		while(scan.hasNext()) {
			String line = scan.nextLine();
			String[] guide = line.split(",");
			
			GuideDto guDto = new GuideDto();
				guDto.setGuideID(guide[0]);
				guDto.setGuideName(guide[1]);
				guDto.setGuideCount(guide[2]);
				guDto.setGuideHow(guide[3]);
				guidelist.add(guDto);
		}
		scan.close();
	}

	@Override
	public void printGuideList() {
		System.out.println("=".repeat(120));
		System.out.println("id\t종목명\t\t순서\t방법");
		System.out.println("=".repeat(120));
		for(GuideDto guDto : guidelist ) {
				System.out.print(guDto.getGuideID() + "\t");
				System.out.print(guDto.getGuideName() + "\t");
				System.out.print(guDto.getGuideCount() + "회 \t");
				System.out.print(guDto.getGuideHow() + "\n");
			
		}
		System.out.println("=".repeat(120));
	}

}
