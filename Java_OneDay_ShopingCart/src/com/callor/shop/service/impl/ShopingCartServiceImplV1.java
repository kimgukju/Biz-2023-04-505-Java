package com.callor.shop.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import org.apache.ibatis.session.SqlSession;

import com.callor.shop.config.DBConnection;
import com.callor.shop.mapper.ShopingCartDao;
import com.callor.shop.models.BuyerDto;
import com.callor.shop.models.IolistDto;
import com.callor.shop.models.ProductDto;
import com.callor.shop.service.ShopingCartService;

public class ShopingCartServiceImplV1 implements ShopingCartService{
	
	SqlSession sqlsession = DBConnection.getFactory().openSession(true);
	ShopingCartDao shopingcartDao = sqlsession.getMapper(ShopingCartDao.class);
	
	protected Scanner scan;
	protected List<BuyerDto> buyerList;
	protected List<ProductDto> productList;
	protected List<IolistDto> iolist;
	
	public ShopingCartServiceImplV1() {
		scan = new Scanner(System.in);
	}

	@Override
	public void productList() {
		productList = shopingcartDao.selectAllProduct();
		System.out.println("상품 리스트");
		System.out.println("-".repeat(100));
		for(ProductDto productDto : productList) {
			System.out.printf("%s\t", productDto.pCode);
			System.out.printf("%s\t", productDto.pName);
			System.out.printf("%s\t", productDto.pItem);
			System.out.printf("%s\t", productDto.pIPrice);
			System.out.printf("%s\n", productDto.pOPrice);
		}
		
		
	}

	@Override
	public void inupProduct() {
		productList();          
		
		System.out.println("상품등록을 하겠습니다");
		System.out.print("상품 코드를 입력하세요 >> ");
		String ipCode = scan.nextLine();
//		ProductDto productDto = shopingcartDao.findByProduct(ipCode);
		System.out.print("상품명을 입력하세요 >> ");
		String ipName = scan.nextLine();
		System.out.print("상품 품목을 입력하세요 >> ");
		String ipItem = scan.nextLine();
		System.out.print("매입 단가를 입력하세요 >> ");
		String ipIPrice = scan.nextLine();
		System.out.print("매출 단가를 입력하세요 >> ");
		String ipOPrice = scan.nextLine();
		
		ProductDto productDto = new ProductDto();
		productDto.pCode = ipCode;
		productDto.pName = ipName;
		productDto.pItem = ipItem;
		productDto.pIPrice = Integer.valueOf(ipIPrice);
		productDto.pOPrice = Integer.valueOf(ipOPrice);
		shopingcartDao.insertProduct(productDto);	
		
		
//		if(productDto.equals(null)) {
//			System.out.print("상품명을 입력하세요 >> ");
//			String ipName = scan.nextLine();
//			System.out.print("상품 품목을 입력하세요 >> ");
//			String ipItem = scan.nextLine();
//			System.out.print("매입 단가를 입력하세요 >> ");
//			String ipIPrice = scan.nextLine();
//			System.out.print("매출 단가를 입력하세요 >> ");
//			String ipOPrice = scan.nextLine();
//			
//			productDto.pCode = ipCode;
//			productDto.pName = ipName;
//			productDto.pItem = ipItem;
//			productDto.pIPrice = Integer.valueOf(ipIPrice);
//			productDto.pOPrice = Integer.valueOf(ipOPrice);
//			shopingcartDao.insertProduct(productDto);			
//		} 
//		else {
//			System.out.println("이미 등록된 코드입니다 상품수정 하겠습니다.");
//			System.out.print("상품명을 입력하세요 >> ");
//			String cpName = scan.nextLine();
//			System.out.print("상품 품목을 입력하세요 >> ");
//			String cpItem = scan.nextLine();
//			System.out.print("매입 단가를 입력하세요 >> ");
//			String cpIPrice = scan.nextLine();
//			System.out.print("매출 단가를 입력하세요 >> ");
//			String cpOPrice = scan.nextLine();
//			
//			productDto.pName = cpName;
//			productDto.pItem = cpItem;
//			productDto.pIPrice = Integer.valueOf(cpIPrice);
//			productDto.pOPrice = Integer.valueOf(cpOPrice);
//			shopingcartDao.updateProduct(productDto);
//			
//		}
		
	}

	@Override
	public void buyerList() {
		buyerList = shopingcartDao.selectAllBuyer();
		System.out.println("고객 List");
		System.out.println("-".repeat(100));
		for(BuyerDto buyerDto : buyerList) {
			System.out.printf("%s\t", buyerDto.buId);
			System.out.printf("%s\t", buyerDto.buName);
			System.out.printf("%s\t", buyerDto.buTel);
			System.out.printf("%s\n", buyerDto.buAddr);
		}
		
	}

	@Override
	public void inupBuyer() {
		buyerList();
		System.out.println("고객등록 및 수정을 하겠습니다");
		System.out.println("신규 고객이시면 1번 , 기존 고객이면 2번을 눌러주세요");
		System.out.print("입력 >> ");
		String str = scan.nextLine();
		int intStr = Integer.valueOf(str);
		
		if(intStr == 1) {
			System.out.print("신규 고객 이름 >> ");
			String buyerName = scan.nextLine();
			System.out.print("신규 고객 전화번호 >> ");
			String buyerTel = scan.nextLine();
			System.out.print("신규 고객 주소 >> ");
			String buyerAddr = scan.nextLine();
			
			BuyerDto buyerDto = new BuyerDto();
			buyerDto.buName = buyerName;
			buyerDto.buTel = buyerTel;
			buyerDto.buAddr = buyerAddr;
			shopingcartDao.insertBuyer(buyerDto);
		}
		
		else if(intStr == 2) {
			System.out.print("수정할 고객이름을 입력하세요 >> ");
			String buName = scan.nextLine();
			BuyerDto buyerDto = shopingcartDao.findByBuyer(buName);
			System.out.print("수정할 고객 이름 >> ");
			String upName = scan.nextLine();
			System.out.print("수정할 고객 전화번호 >> ");
			String upTel = scan.nextLine();
			System.out.print("수정할 고객 주소 >> ");
			String upAddr = scan.nextLine();
			
			buyerDto.buName = upName;
			buyerDto.buTel = upTel;
			buyerDto.buAddr = upAddr;
			shopingcartDao.updateBuyer(buyerDto);
	
		}
		
		else {
			System.out.println("1~2번만 입력해주세요!!!");
			
		}
		
	}

	@Override
	public void inputiolist() {
		productList(); 
		buyerList();
		Date date = new Date(System.currentTimeMillis());
		SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY-MM-dd");
		SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
		String dateString = dateFormat.format(date);
		String timeString = timeFormat.format(date);
		

		
		System.out.println("장바구니에 상품을 담을게요");
		System.out.print("고객명 >> ");
		String inbuName = scan.nextLine();
		BuyerDto buyerDto = shopingcartDao.findByBuyer(inbuName);
		System.out.println(buyerDto.buId);
		System.out.print("상품명 >> ");
		String inpName = scan.nextLine();
		ProductDto productDto = shopingcartDao.findByProduct(inpName);
		System.out.println(productDto.pCode);
		System.out.print("담을 수량을 적어주세요 >> ");
		String inQuan = scan.nextLine();
		
		IolistDto iolistDto = new IolistDto();
		iolistDto.ioDate = dateString;
		iolistDto.ioTime = timeString;
		iolistDto.ioBuId = inbuName;
		iolistDto.ioPCode = productDto.pCode;
		iolistDto.ioQuan = Integer.valueOf(inQuan);
		int intPrice = productDto.pIPrice;
		int outPrice = (int)(intPrice + (intPrice * 0.22));
		iolistDto.ioPrice = outPrice;
		
		shopingcartDao.insertIolist(iolistDto);
		
		
		
		
	}

	@Override
	public void printBuyerIolist() {
		
		
	}

	@Override
	public void printAllIolist() {
		iolist = shopingcartDao.selectAllIoList();
		System.out.println("판매내역 List");
		System.out.println("=".repeat(100));
		System.out.println("SEQ\t거래일자\t거래시각\t고객ID\t상품코드\t수량\t판매단가");
		System.out.println("=".repeat(100));
		for(IolistDto iolistDto : iolist) {
			System.out.printf("%s\t", iolistDto.ioSEQ);
			System.out.printf("%s\t", iolistDto.ioDate);
			System.out.printf("%s\t", iolistDto.ioTime);
			System.out.printf("%s\t", iolistDto.ioBuId);
			System.out.printf("%s\t", iolistDto.ioPCode);
			System.out.printf("%s\t", iolistDto.ioQuan);
			System.out.printf("%s\n", iolistDto.ioPrice);
		}
		
	}

}
