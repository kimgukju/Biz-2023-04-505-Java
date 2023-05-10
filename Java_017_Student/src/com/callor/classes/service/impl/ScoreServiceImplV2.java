package com.callor.classes.service.impl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

import com.callor.classes.config.Line;
import com.callor.classes.models.ScoreDto;
import com.callor.classes.models.StudentDto;
import com.callor.classes.service.StudentService;

public class ScoreServiceImplV2 extends ScoreServiceImplV1 {

	public ScoreServiceImplV2() {
		// V1 에서 protected 로 선언 scList 를 사용할수 있도록
		// 초기화 하는 작업, 반드시 필요
		scList = new ArrayList<>();
	}
	
	@Override
	public void loadScore() {
		String scoreFile = "src/com/callor/classes/datas/score.csv";
		InputStream is = null;
		Scanner scan = null;
		
		try {
			is = new FileInputStream(scoreFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		scan = new Scanner(is);
		
		while(scan.hasNext()) {
			String line = scan.nextLine();
			ScoreDto dto = str2Dto(line);
			scList.add(dto);
		}
		scan.close();
		
		
	}

	@Override
	public void printScore() {
		StudentService stService = new StudentServiceImplV2();
		stService.loadStudent();
		
		System.out.println(Line.dLINE(120));
		System.out.print("학번\t 이름\t  학과\t\t 국어\t영어\t수학\t음악\t미술\n");
		System.out.println(Line.sLINE(120));
		for(ScoreDto dto : scList) {
			
			StudentDto stDto = stService.getStudent(dto.getStNum());
			System.out.print(dto.getStNum() + "\t");
			if(stDto != null) {
				System.out.print(stDto.stName + "\t");
				System.out.print(stDto.stDept + "\t");
			} else {
				System.out.print("-\t");
				System.out.print("-\t");
			}
			
			System.out.printf("%s\t", dto.getScKor());
			System.out.printf("%s\t", dto.getScEng());
			System.out.printf("%s\t", dto.getScMath());
			System.out.printf("%s\t", dto.getScMuisc());
			System.out.printf("%s\n", dto.getScArt());
		}
		System.out.println(Line.dLINE(120));
		System.out.println(Line.sLINE(120));
		
	}
}
