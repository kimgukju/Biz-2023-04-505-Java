package com.callor.bank.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.bank.models.AccDto;
import com.callor.bank.models.BuyerDto;
import com.callor.bank.service.AccService;

public class AccServiceImplV1 implements AccService {
	BuyerServiceImplV1A bService;
	protected Scanner scan;

	public AccServiceImplV1() {
		// TODO Auto-generated constructor stub
		bService = new BuyerServiceImplV1A();
		scan = new Scanner(System.in);
	}
	
	/*
	 * 신규계좌 등록하기
	 * 1. 고객번호를 입력받고, 
	 * 2. 고객번호가 고객정보 있는가 확인
	 * 		BuyerServiceImplV1.getBuyer() method 를 사용하여
	 * 		고객정보 찾기
	 * 		없으면 : 고객정보를 등록하세요 라고 메시지 표현
	 * 3. 고객번호가 있으면 신규 계좌를 생성 : List<AccDto> type accList 에 추가
	 * 
	 * 
	 */
	@Override
	public void accInit() {
		// TODO Auto-generated method stub
		System.out.print("고객ID 를 입력하세요 >> ");
		String buId = scan.nextLine();
		
		
		
		

	}

	@Override
	public void inout() {
		// TODO Auto-generated method stub
		System.out.println("=".repeat(100));
		System.out.println("계좌정보");
		System.out.println("=".repeat(100));

		String buId = "";
		while (true) {
			System.out.print("계좌번호를 입력하세요 >> ");
			buId = scan.nextLine();
			try {
				if (buId.equals("0001")) {
				System.out.println("계좌가 확인되었어요");	
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
		AccDto acDto = new AccDto();
		String count = "";
		System.out.println("1.입금 2.출금");
		String yesNo = scan.nextLine();
		if(yesNo.equals("1")) {
			System.out.print("입금할 금액을 입력해주세요 >> ");
			count = scan.nextLine();
			
		}

		

	}

	@Override
	public void printAccList() {
		// TODO Auto-generated method stub

	}

	@Override
	public void saveAccList() {
		// TODO Auto-generated method stub

	}

	@Override
	public void loadAccList() {
		// TODO Auto-generated method stub

	}

}
