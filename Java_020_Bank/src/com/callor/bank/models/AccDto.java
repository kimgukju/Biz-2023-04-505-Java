package com.callor.bank.models;

/*
 * 계좌정보 데이터 클래스
 * 계좌번호 : acNum
 * 계좌구분 : acDiv
 * 고객ID : BuId
 * 최종잔액 : acBalance
 */
public class AccDto {
	
	public String acNum;
	public String acDiv;
	public String BuId;
	public int acBalance;
	
	
	
	
	public AccDto(String acNum, String acDiv, String buId, int acBalance) {
		super();
		this.acNum = acNum;
		this.acDiv = acDiv;
		BuId = buId;
		this.acBalance = acBalance;
	}




	public AccDto() {
		super();
		// TODO Auto-generated constructor stub
	}




	@Override
	public String toString() {
		return "AccDto [acNum=" + acNum + ", acDiv=" + acDiv + ", BuId=" + BuId + ", acBalance=" + acBalance + "]";
	}
	
}
