package com.callor.bank.service.impl;

import java.util.Scanner;

import com.callor.bank.models.AccDto;
import com.callor.bank.service.AccService;

public class AccServiceImplV1 implements AccService {

	protected Scanner scan;

	public AccServiceImplV1() {
		// TODO Auto-generated constructor stub
		scan = new Scanner(System.in);
	}

	@Override
	public void accInit() {
		// TODO Auto-generated method stub

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
