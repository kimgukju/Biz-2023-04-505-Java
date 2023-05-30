package com.callor.shop.exec;

import java.util.Scanner;

import com.callor.shop.service.ShopingCartService;
import com.callor.shop.service.impl.ShopingCartServiceImplV1;

public class ExecA {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ShopingCartService shopingcartService = new ShopingCartServiceImplV1();
		
		while(true) {
			System.out.println("=".repeat(120));
			System.out.println("빛나라 쇼핑몰 2023");
			System.out.println("=".repeat(120));
			System.out.println("상품관리");
			System.out.println("-".repeat(80));
			System.out.println("\t 1. 상품리스트");
			System.out.println("\t 2. 상품등록 및 수정");
			System.out.println("-".repeat(80));
			System.out.println("고객관리");
			System.out.println("-".repeat(80));
			System.out.println("\t 3. 고객리스트");
			System.out.println("\t 4. 고객등록 및 수정");
			System.out.println("-".repeat(80));
			System.out.println("상품판매");
			System.out.println("-".repeat(80));
			System.out.println("\t 5. 장바구니 상품 담기");
			System.out.println("\t 6. 구매자별 장바구니 리스트 보기");
			System.out.println("\t 7. 장바구니 전체 리스트 보기");
			System.out.println("-".repeat(80));
			System.out.println("QUIT. 끝내기");
			System.out.println("=".repeat(120));
			System.out.print("선택 >> ");
			String str = scan.nextLine();
			int intSelect = 0;
			if(str.equals("QUIT")) break;
			
			try {
				intSelect = Integer.valueOf(str);
			} catch (Exception e) {
				System.out.printf("업무 선택은 QUIT(끝내기), 1 ~ 7 정수만 입력할 수 있습니다(%s)\n",str);
				continue;
			}
			
			if(intSelect == 1) shopingcartService.productList();
			else if(intSelect ==2) shopingcartService.inupProduct();
			else if(intSelect == 3) shopingcartService.buyerList();
			else if(intSelect == 4) shopingcartService.inupBuyer();
			else if(intSelect == 5) shopingcartService.inputiolist();
			
			else if(intSelect == 7) shopingcartService.printAllIolist();
			else {
				System.out.printf("업무 선택은 1 ~ 7 까지 중에 선택하세요\n",intSelect);
			}
			
		}
		System.out.println("업무끝");
		
	}

}
