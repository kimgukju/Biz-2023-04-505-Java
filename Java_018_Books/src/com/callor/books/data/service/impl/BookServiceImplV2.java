package com.callor.books.data.service.impl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.books.config.DataIndex;
import com.callor.books.config.Utils;
import com.callor.books.data.models.BookDto;
import com.callor.books.data.service.BookService;

public class BookServiceImplV2 implements BookService{
	
	protected List<BookDto> bookList;
	
	public BookServiceImplV2() {
		bookList = new ArrayList<>();
	}
	
	// 도서정보.txt 파일을 읽어와서
	// List<BookDto> type 리스트 데이터로 변환하는 method 
	public void loadBook() {
		String bookFile = "src/com/callor/books/data/도서정보(2023-05-11).txt";
		InputStream is = null;
		Scanner scan = null;
		
		try {
			is = new FileInputStream(bookFile);
		} catch (FileNotFoundException e) {
			System.out.println(bookFile + "파일이 없어용");
		}
		
		scan = new Scanner(is);
		
		while(scan.hasNext()) {
			String line = scan.nextLine();
			String[] book = line.split(",");
			
			BookDto bDto = new BookDto();
				bDto.setbIsbn(book[ DataIndex.BOOK.ISBN ]);
				bDto.setbTitle(book[ DataIndex.BOOK.TITLE ]);
				bDto.setbPublisher(book[ DataIndex.BOOK.PUBLISHER ]);
				bDto.setbAuthor(book[ DataIndex.BOOK.AUTHOR ]);
				bDto.setbPublishDate(book[ DataIndex.BOOK.PDATE ]);
				bDto.setbPages(Integer.valueOf(book[ DataIndex.BOOK.PAGES ]));
				
				// "  가나다  " : 문자열 앞 뒤에 space가 포함된 상태
				// 	  가나다    
				// "  1000 " : Integer.valueOf("  1000 ")
				// 		  => NumberFormatException 발생
				// 이러한 상황에서 숫자 앞뒤에 붙어있는 space를 제거해줘야 한다
				// 다른변수 = 문자열변수.trie() 사용
				String strPrice = book[ DataIndex.BOOK.PRICE].trim();
				bDto.setbPrice(Integer.valueOf(strPrice));
				bookList.add(bDto);
		}
		scan.close();
		
		
	}
	
	public void printBookList() {
		
		String[] printTitle = "ISBN,도서명,출판사,저자,출판일,\t페이지, 가격".split(",");
								
		
		System.out.println(Utils.dLine(100));
		
		System.out.printf("%-13s\t", printTitle[ DataIndex.BOOK.ISBN]);
		System.out.printf("%-20s\t\t", printTitle[ DataIndex.BOOK.TITLE]);
		System.out.printf("%s\t", printTitle[DataIndex.BOOK.PUBLISHER]);
		System.out.printf("%s\t", printTitle[DataIndex.BOOK.AUTHOR]);
		System.out.printf("%s\t", printTitle[DataIndex.BOOK.PDATE]);
		System.out.printf("%s\t", printTitle[DataIndex.BOOK.PAGES]);
		System.out.printf("%s\n", printTitle[DataIndex.BOOK.PRICE]);
		
		System.out.println(Utils.sLine(100));
		
		for(BookDto dto : bookList) {
			System.out.printf("%13s\t",dto.getbIsbn());
			
			String bTitle = dto.getbTitle();
			if(bTitle.length() > 10) {
				System.out.printf("%-20s\t", bTitle.subSequence(0, 10));
			} else {
				System.out.printf("%-20s\t", bTitle);
			}
			
			System.out.printf("%s\t",dto.getbPublisher());
			System.out.printf("%s\t",dto.getbAuthor());
			System.out.printf("%s\t",dto.getbPublishDate());
			System.out.printf("%s\t",dto.getbPages());
			System.out.printf("%s\n",dto.getbPrice());
		}
		System.out.println(Utils.sLine(100));
			
	}


	@Override
	public BookDto getBook(String isbn) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BookDto> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateBook(BookDto bookDto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteBook(String isbn) {
		// TODO Auto-generated method stub
		
	}

}
