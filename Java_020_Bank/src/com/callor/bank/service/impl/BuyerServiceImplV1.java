package com.callor.bank.service.impl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.bank.models.BuyerDto;
import com.callor.bank.service.BuyerService;
import com.callor.bank.utils.Config;
import com.callor.bank.utils.Line;

public class BuyerServiceImplV1 implements BuyerService{
	protected List<BuyerDto> buyerList;
	protected Scanner scan;
	
	public BuyerServiceImplV1() {
		// TODO Auto-generated constructor stub
		buyerList = new ArrayList<>();
		scan = new Scanner(System.in);
	}
	

	@Override
	public void loadBuyer() {
		// TODO Auto-generated method stub
		
		
	}


	@Override
	public BuyerDto getBuyer(String buId) {
		// TODO Auto-generated method stub
		return null;
	}
	
	protected int getMaxId() {
		int maxId = 0;
		for(BuyerDto dto : buyerList) {
			int intId = Integer.valueOf(dto.buId);
			if(intId > maxId) maxId = intId;
		}
		
		return maxId + 1;
	}
	
protected BuyerDto buyerItemInput() {
		
		BuyerDto buDto = null;
		// 임시초기화
	
		
		// 값에 대한 검증을 하기 위한 while
		String buId = "";
		
		while(true) {
			System.out.printf("고객 ID(%04d) >> ", getMaxId());
			buId = scan.nextLine();
			// Q 처럼 단독 알파벳으로 쓰면 좋을 것 같은데??
			// 입력하는 도중 알파벳은 실수로 자꾸 눌릴 수 있다.
			// 실수로 알파벳 Q는 쉽게 누를 수 있지만
			// 상대적으로 QUIT는 실수로 입력할 확률이 낮다.
			// 입력도중 알파벳을 잘못입력하여 종료되는 것을 방지하기 위함
			if(buId.equals("QUIT")) return null;
			if(buId.equals("")) buId = String.format("%04d", getMaxId());
			try {
				int intBuId = Integer.valueOf(buId);
				buId = String.format("%04d", intBuId);
				break;
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("고객 ID 는 정수로만 입력하세요");
			}
			
			// 여기까지 buDto 는 "null인 상태"
			for(BuyerDto dto : buyerList) {
				
				// 고객ID에 해당하는 정보가 있으면
				// 이때부터는 buDto 는 null 인 상태가 아니고
				// 입력한 고객ID 의 데이터의 주소를 갖는 상태
				if(dto.buId.equals(buId)) {
					buDto = dto;
				}
			}
		} // buId 입력 끝
		
		System.out.printf("고객 이름(%s) >>",
				buDto == null ?  "신규" : buDto.buName);
		String buName = scan.nextLine();
		if(buName.equals("QUIT")) return null;
		
		System.out.printf("고객 전화번호(%s) >>",
				buDto == null ?  "신규" : buDto.buTel);
		String buTel = scan.nextLine();
		if(buTel.equals("QUIT")) return null;
		
		System.out.printf("고객 주소(%s) >>",
				buDto == null ? "신규": buDto.buAddr);
		String buAddr = scan.nextLine();
		if(buAddr.equals("QUIT")) return null;
		
		System.out.printf("고객 생년월일(%s) >>",
				buDto == null ? "신규" : buDto.buBirth);
		String buBirth = scan.nextLine();
		if(buBirth.equals("QUIT")) return null;
		
		System.out.printf("고객 직업(%s) >>",
				buDto == null ?  "신규" : buDto.buJob);
		String buJob = scan.nextLine();
		if(buJob.equals("QUIT")) return null;
		
		if(buDto == null) buDto = new BuyerDto();
		
		//BuyerDto budto = new BuyerDto();
		buDto.buId = buId;
		buDto.buName = buName;
		buDto.buTel = buTel;
		buDto.buAddr = buAddr;
		buDto.buBirth = buBirth;
		buDto.buJob = buJob;
		
		return buDto;
	}


@Override
public void inputBuyer() {
	// TODO Auto-generated method stub
	while(true) {
		System.out.println(Line.dLine(100));
		System.out.println("고객정보 관리 ");
		System.out.println(Line.sLine(100));
		
		BuyerDto buDto = buyerItemInput();
		if(buDto == null) break;
		/*
		 * 
		 * buyerList 데이터를 추가 또는 수정
		 * buyerList 데이터에 buDto 요소가 없으면 추가
		 * 있으면 무시
		 * 주소에 대한 개념으로 이해하여 보자
		 * 
		 * List type 객체의 contains method
		 * List type 객체(buyerList)의 요소중에
		 * buDto 변수에 담긴 주소를 가진 요소가 있냐?
		 */
		if(!buyerList.contains(buDto)) buyerList.add(buDto);
	}
	System.out.println("고객정보 입력 종료");
	
	OutputStream os = null;
	PrintWriter out = null;
	
	try {
		os = new FileOutputStream(Config.BUYER_FILE);
		out = new PrintWriter(os);
		printBuyerList(out);
		out.close();
		
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
}
					
		
	

@Override
public void printBuyerList() {
	// TODO Auto-generated method stub
	OutputStream os = System.out;
	PrintWriter out = new PrintWriter(os);
	
	System.out.println(Line.dLine(100));
	System.out.println("고객정보 리스트");
	System.out.println(Line.dLine(100));
	System.out.println("고객ID\t고객명\t전화번호\t주소\t생년월일\t직업");
	printBuyerList(out);
	out.close();
	System.out.println(Line.dLine(100));
}




@Override
public void printBuyerList(PrintWriter out) {
	// TODO Auto-generated method stub
	
	for(BuyerDto dto : buyerList) {
		out.printf("%s\t", dto.buId);
		out.printf("%s\t", dto.buName);
		out.printf("%s\t", dto.buTel);
		out.printf("%s\t", dto.buAddr);
		out.printf("%s\t", dto.buBirth);
		out.printf("%s\n", dto.buJob);
	}
}

}
