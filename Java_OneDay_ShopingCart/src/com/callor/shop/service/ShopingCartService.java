package com.callor.shop.service;

public interface ShopingCartService {
	
	// 1. 상품리스트
	public void productList();
	
	// 2. 상품등록 및 수정
	public void inupProduct();
	
	// 3. 고객리스트
	public void buyerList();
	
	// 4. 고객등록 및 수정
	public void inupBuyer();
	
	// 5. 장바구니 상품담기
	public void inputiolist();
	
	// 6. 구매자별 장바구니 리스트 보기
	public void printBuyerIolist();
	
	// 7. 장바구니 전체 리스트보기
	public void printAllIolist();
	
	

}
