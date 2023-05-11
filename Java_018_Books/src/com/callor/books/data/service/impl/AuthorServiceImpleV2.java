package com.callor.books.data.service.impl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.books.config.DataIndex;
import com.callor.books.config.Utils;
import com.callor.books.data.models.AuthorDto;
import com.callor.books.data.service.AuthorService;

public class AuthorServiceImpleV2 implements AuthorService{
	
	private List<AuthorDto> aulist;
	
	public AuthorServiceImpleV2() {
		aulist = new ArrayList<>();
	}

	@Override
	public void loadAuthor() {
		String auFile = "src/com/callor/books/data/저자정보(2023-05-11).txt";
		InputStream is = null;
		Scanner scan = null;
		
		try {
			is = new FileInputStream(auFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		scan = new Scanner(is);
		
		while(scan.hasNext()) {
			String line = scan.nextLine();
			String[] author = line.split(",");
			
			AuthorDto auDto = new AuthorDto();
				auDto.setAuCode(author[DataIndex.AUTHOR.CODE]);
				auDto.setAuName(author[DataIndex.AUTHOR.NAME]);
				auDto.setAuTel(author[DataIndex.AUTHOR.TEL]);
				auDto.setAuAddress(author[DataIndex.AUTHOR.ADDRESS]);
				aulist.add(auDto);
		}
		scan.close();
		
	}
	
	
	// 저자코드,저자명,전화번호,주소
	@Override
	public void printAuthorList() {
		System.out.println(Utils.dLine(100));
		System.out.println("저자코드\t저자명\t\t\t전화번호\t\t주소");
		System.out.println(Utils.dLine(100));
		for(AuthorDto auDto : aulist) {
			System.out.print(auDto.getAuCode() + "\t\t");
			
			String auName = auDto.getAuName();
			if(auName.length() > 10) {
				System.out.printf("%-20s", auName.subSequence(0, 10));
			} else {
				System.out.printf("%-20s", auName);
			}
			//System.out.print(auDto.getAuName() + "\t");
			System.out.print(auDto.getAuTel() + "\t");
			System.out.print(auDto.getAuAddress() + "\n");
			
		}
		
		
	}

	@Override
	public AuthorDto getAuthor(String code) {
		if(aulist.isEmpty()) {
			this.loadAuthor();
		}
		for(AuthorDto auDto : aulist ) {
			if(auDto.getAuCode().equals(code)) {
				return auDto;
			}
		}
		return null;
	}

	@Override
	public List<AuthorDto> getAuthorList() {
		if(aulist.isEmpty()) {
			this.loadAuthor();
		}
		return aulist; // 나는 이것만 했는데 만약에 aulist가 없을수 있으니 위의 if절을 넣어서 완벽하게
	}

}
