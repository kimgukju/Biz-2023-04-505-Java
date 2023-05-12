package com.callor.books.data.service.impl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.books.data.models.PublisherDto;
import com.callor.books.data.service.PublisherService;

public class PubliserServiceImplV1 implements PublisherService{
	
	private List<PublisherDto> publist;
	
	public PubliserServiceImplV1() {
		publist = new ArrayList<>();
	}

	@Override
	public void loadPubliser() {
		String pubFile = "src/com/callor/books/data/출판사정보(2023-05-11).txt";
		InputStream is = null;
		Scanner scan = null;
		
		try {
			is = new FileInputStream(pubFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		scan = new Scanner(is);
		
		while(scan.hasNext()) {
			String line = scan.nextLine();
			String[] publisher = line.split(",");
			PublisherDto pubDto = new PublisherDto();
			
			pubDto.setPubCode(publisher[0]);
			pubDto.setPubName(publisher[1]);
			pubDto.setPubCeo(publisher[2]);
			pubDto.setPubTel(publisher[3]);
			pubDto.setPubAddress(publisher[4]);
			publist.add(pubDto);
		}
		scan.close();
		
		
	}

	@Override
	public void printPubliser() {
		System.out.println("=".repeat(120));
		System.out.println("출판사코드\t출판사명\t대표\t전화번호\t주소");
		System.out.println("=".repeat(120));
		for(PublisherDto pubDto : publist ) {
			System.out.print(pubDto.getPubCode() + "\t");
			System.out.print(pubDto.getPubName() + "\t");
			System.out.print(pubDto.getPubCeo() + "\t");
			System.out.print(pubDto.getPubTel() + "\t");
			System.out.print(pubDto.getPubAddress() + "\n");
		}
		System.out.println("-".repeat(120));
	}

	@Override
	public PublisherDto getPubliser(String code) {
		for(PublisherDto pubDto : publist) {
			if(pubDto.getPubCode().equals(code)) {
				return pubDto;
			}
		}
		// TODO Auto-generated method stub
		return null;
		
	}

	@Override
	public List<PublisherDto> getPubliserList() {
		if(publist.isEmpty()) {
			this.loadPubliser();
		}
		
		return publist;
	}

	@Override
	public List<PublisherDto> getPubliserListByName(String name) {
		List<PublisherDto> samelist = new ArrayList<>();
		
		//for(PublisherDto pubDto : publist) {
		//	while(pubDto.getPubName().contains(name)) {
		//		pubDto.getPubName();
		//		samelist.add(pubDto);
		//		return samelist;
		//	}
		//}
		
		while(true) {
			for(PublisherDto pubDto : publist) {
				if(pubDto.getPubName().contains(name)) {
					pubDto.getPubName();
					samelist.add(pubDto);
					return samelist;
				}
				
			}
 		}
	}
	
	
	
}
